/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Q2602
 */
public class Profile {
    private String idU;
    private String name;
    private String mobile;
    private String gmail;
    private String State;

    public Profile() {
    }

    
    public Profile(String idU, String name, String mobile, String gmail, String State) {
        this.idU = idU;
        this.name = name;
        this.mobile = mobile;
        this.gmail = gmail;
        this.State = State;
    }

    public String getIdU() {
        return idU;
    }

    public void setIdU(String idU) {
        this.idU = idU;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
    
    
}
