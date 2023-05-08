/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databasegui;

/**
 *
 * @author Tyrei
 */
class Staff {
    private String staffID, ssn, phoneNo, fname, lname, sex, salary, dob, role, address;
    
    public Staff(String staffID, String ssn, String phoneNo, String fname, String lname, String sex, String salary, String dob, String role, String address){
        this.staffID = staffID;
        this.ssn = ssn;
        this.phoneNo = phoneNo;
        this.fname = fname;
        this.lname = lname;
        this.sex = sex;
        this.salary = salary;
        this.dob = dob;
        this.role = role;
        this.address = address;
    }
    
    public String getstaffID(){
        return staffID;
    }
    
    public String getssn(){
        return ssn;
    }
    
    public String getphoneNo(){
        return phoneNo;
    }
    
    public String getfname(){
        return fname;
    }
    
    public String getlname(){
        return lname;
    }
    
    public String getsex(){
        return sex;
    }
    
    public String getsalary(){
        return salary;
    }
    
    public String getdob(){
        return dob;
    }
    
    public String getrole(){
        return role;
    }
    
    public String getaddress(){
        return address;
    }
}
