/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databasegui;

/**
 *
 * @author Tyrei
 */
class Manager {
    private String MGRSSN, ESSN;
    
    public Manager(String MGRSSN, String ESSN){
        this.MGRSSN = MGRSSN;
        this.ESSN = ESSN;
    }
    
    public String getmgrssn(){
        return MGRSSN;
    }
    
    public String getessn(){
        return ESSN;
    }
}
