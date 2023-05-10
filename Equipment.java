/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databasegui;

/**
 *
 * @author Tyrei
 */
class Equipment {
    private String type, amount;
    
    public Equipment(String type, String amount){
        this.type = type;
        this.amount = amount;
    }
    
    public String gettype(){
        return type;
    }
    
    public String getamount(){
        return amount;
    }
}
