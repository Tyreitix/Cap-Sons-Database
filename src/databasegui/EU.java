/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databasegui;

/**
 *
 * @author Tyrei
 */
class EU {
    private String PID, EquipT, EquipA; 
    
    public EU(String PID, String EquipT, String EquipA){
        this.PID = PID;
        this.EquipT = EquipT;
        this.EquipA = EquipA;
    }
    
    public String getpid(){
        return PID;
    }
    
    public String getequipT(){
        return EquipT;
    }
    
    public String getequipA(){
        return EquipA;
    }
}
