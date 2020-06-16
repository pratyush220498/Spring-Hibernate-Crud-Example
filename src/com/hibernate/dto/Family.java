/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.dto;

/**
 *
 * @author pratyush
 */
public class Family {

    private String fid;
    private String fname;
    private String fhead;
    private String fmem;
    private String fadd;

    public Family() {
    }

    public Family(String fid, String fname, String fhead, String fmem, String fadd) {
        this.fid = fid;
        this.fname = fname;
        this.fhead = fhead;
        this.fmem = fmem;
        this.fadd = fadd;
    }

    @Override
    public String toString() {
        return "Family{" + "fid=" + fid + ", fname=" + fname + ", fhead=" + fhead + ", fmem=" + fmem + ", fadd=" + fadd + '}';
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFhead() {
        return fhead;
    }

    public void setFhead(String fhead) {
        this.fhead = fhead;
    }

    public String getFmem() {
        return fmem;
    }

    public void setFmem(String fmem) {
        this.fmem = fmem;
    }

    public String getFadd() {
        return fadd;
    }

    public void setFadd(String fadd) {
        this.fadd = fadd;
    }
        
}
