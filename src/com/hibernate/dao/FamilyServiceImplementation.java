/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.dao;

import com.hibernate.dto.Family;
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author pratyush
 */
public class FamilyServiceImplementation implements FamilySericeInterface{

    
    private HibernateTemplate hibernateTemplate; 
    String status="";
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    @Override
    public String insertFamily(Family f) {
        String id=(String)hibernateTemplate.save(f);
        if(id.equals(id))
            status="success";
        else
            status="failure";
        return status;
    }

    @Transactional
    @Override
    public List listFamily() {
        List<Family> list=hibernateTemplate.loadAll(Family.class);
        return list;    
    }
    
    
    @Transactional
    @Override
    public Family searchfamily(String fid) {
        Family f=(Family)hibernateTemplate.get(Family.class,fid);
        return f;    
    }

    @Transactional    
    @Override
    public String deletefamily(String fid) {
        Family f=(Family)hibernateTemplate.get(Family.class,fid);
        if(f==null)
            status="failure";
        else
        {
            hibernateTemplate.delete(f);
            status="success";
        }
        return status;
    }
    @Transactional
    @Override
    public String updatefamily(String fid) {
        Family f=(Family)hibernateTemplate.get(Family.class,fid);
        if(f==null)
            status="failure";
        else
        {
            hibernateTemplate.update(f);
            status="success";
        }
        return status;
    
    }
    
    
}
