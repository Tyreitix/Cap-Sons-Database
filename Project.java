/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databasegui;

/**
 *
 * @author Tyrei
 */
class Project {
    private String projectID, price, street, state, city;
    
    public Project(String projectID, String price, String street, String state, String city){
        this.projectID = projectID;
        this.price = price;
        this.city = city;
        this.street = street;
        this.state = state;
    }
    
    public String getprojectID(){
        return projectID;
    }
    
    public String getprice(){
        return price;
    }
    
    public String getstreet(){
        return street;
    }
    
    public String getcity(){
        return city;
    }
    
    public String getstate(){
        return state;
    }
}
