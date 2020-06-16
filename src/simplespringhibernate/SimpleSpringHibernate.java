/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplespringhibernate;

import com.hibernate.action.ActionClass;
import com.hibernate.dao.FamilyServiceImplementation;
import com.hibernate.dto.Family;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author pratyush
 */
public class SimpleSpringHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  try {
        String option;
        ApplicationContext context=new ClassPathXmlApplicationContext("/SpringXMLConfig.xml");
        FamilyServiceImplementation ref=(FamilyServiceImplementation)context.getBean("familyDao");
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("----INDEX-----");
            System.out.println("1.INSERT A RECORD");
            System.out.println("2.SEARCH A RECORD");
            System.out.println("3.UPDATE A RECORD");
            System.out.println("4.DELETE A RECORD");
            System.out.println("5.DISPLAY ALL DETAILS");
            System.out.println("6.EXIT");
            System.out.println("please enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter Family id - ");
                    String id=sc.next();
                    System.out.println("Enter Family name - ");
                    String name=sc.next();
                    System.out.println("Enter Family Head name - ");
                    String head=sc.next();
                    System.out.println("Enter Family member - ");
                    String mem=sc.next();
                    System.out.println("Enter Family address - ");
                    String add=sc.next();
                    ActionClass.insertion(id,name,head,mem,add,ref);
                    break;
                }                    
                case 2:
                {
                    System.out.println("Enter Family id - ");
                    String id=sc.next();
                    ActionClass.searching(id,ref);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter Family id - ");
                    String id=sc.next();
                    ActionClass.updation(id,ref);
                    break;
                }    
                case 4:
                {
                    System.out.println("Enter Family id - ");
                    String id=sc.next();
                    ActionClass.deletion(id,ref);
                    break;
                }
                case 5:
                {
                    ActionClass.showAll(ref);
                    break;
                }
                case 6:
                {
                    System.exit(0);
                }
                default:
                    System.out.println("YOU HAVE ENTERED WRONNG CHOICE");
            }
            System.out.println("do u want to continue(y/n)");
            option=sc.next();
        }
        while(option.equalsIgnoreCase("y"));
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
