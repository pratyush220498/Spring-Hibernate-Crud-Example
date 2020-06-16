/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.dao;

import com.hibernate.dto.Family;
import java.util.List;

/**
 *
 * @author pratyush
 */
public interface FamilySericeInterface {

    public String insertFamily(Family f);
    public Family searchfamily(String fid);
    public String deletefamily(String fid);
    public String updatefamily(String fid);
    public List listFamily();
    
}
