/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databasegui;

/**
 *
 * @author Tyrei
 */
class CP {
    private String PID;
    private int CID;
    
    public CP(String PID, int CID){
        this.PID = PID;
        this.CID = CID;
    }
    
    public String getpid(){
        return PID;
    }
    
    public int getcid(){
        return CID;
    }
}
