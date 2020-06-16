/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.action;

import com.hibernate.dao.FamilyServiceImplementation;
import com.hibernate.dto.Family;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pratyush
 */
public class ActionClass {

    public static String status="";
    
public static void insertion(String id,String name,String head,String mem,String add,FamilyServiceImplementation fsi)
{
                Family f=new Family();
                    f.setFadd(add);
                    f.setFhead(head);
                    f.setFid(id);
                    f.setFmem(mem);
                    f.setFname(name);
                status=fsi.insertFamily(f);
                if(status.equals("success"))
                    System.out.println("Family record inserted Successfully");
                else
                    System.out.println("Something went wrong");
}

public static void showAll(FamilyServiceImplementation fsi)
{
    List<Family> list=fsi.listFamily();
    list.forEach((f) -> {
        System.out.println(f.getFid()+" "+f.getFname()+" "+f.getFhead()+" "+f.getFmem()+" "+f.getFadd());
        });
}
public static void updation(String id,FamilyServiceImplementation fsi)
{
        Family f=fsi.searchfamily(id);
                if(f==null)
                {
                          System.out.println("Family record not found");
                }
                else
                {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter Family name - ");
                    String name=sc.next();
                    System.out.println("Enter Family Head name - ");
                    String head=sc.next();
                    System.out.println("Enter Family member - ");
                    String mem=sc.next();
                    System.out.println("Enter Family address - ");
                    String add=sc.next();
                    ActionClass.insertion(id,name,head,mem,add,fsi);                    
                }
}
public static void deletion(String id,FamilyServiceImplementation fsi)
{
                Family f=fsi.searchfamily(id);
                if(f==null)
                {
                          System.out.println("Family record not found");
                }
                else
                {
                     System.out.println("Family record found");
                     System.out.println(f.getFid()+" "+f.getFname()+" "+f.getFhead()+" "+f.getFmem()+" "+f.getFadd());
                     status=fsi.deletefamily(id);
                     if(status.equals("success"))
                    System.out.println("Family record inserted Successfully");
                else
                    System.out.println("Something went wrong");
                }
}
public static void searching(String id,FamilyServiceImplementation fsi)
{
    Family f=fsi.searchfamily(id);
                if(f==null)
                {
                          System.out.println("Family record not found");
                }
                else
                {
                     System.out.println("Family record found");
                      System.out.println(f.getFid()+" "+f.getFname()+" "+f.getFhead()+" "+f.getFmem()+" "+f.getFadd());
                }   
}        
}
