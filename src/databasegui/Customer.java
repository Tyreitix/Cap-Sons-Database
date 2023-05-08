/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databasegui;

/**
 *
 * @author Tyrei
 */
class Customer {
    private int customerID;
    private String fname, lname;
    
    public Customer(int customerID, String fname, String lname){
        this.customerID = customerID;
        this.fname = fname;
        this.lname = lname;
    }
    
    public int getcustomerID(){
        return customerID;
    }
    
    public String getfname(){
        return fname;
    }
    
    public String getlname(){
        return lname;
    }
}
