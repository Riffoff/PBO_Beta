/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
import rifqiakmallubaid2110010428.User;

/**
 *
 * @author acer
 */
public class datasetUser {
    private ArrayList <String> id_user;
    private ArrayList <String> username;
    private ArrayList <String> password;
    private ArrayList <String> bioskop;
    private ArrayList <Integer> lvl;
    
    public datasetUser (){
        
        id_user=new ArrayList<>();
        username=new ArrayList<>();
        password=new ArrayList<>();
        bioskop=new ArrayList<>();
        lvl=new ArrayList<>();
    }
    
    public void addIDUser (String value){
        id_user.add(value);
    }
    public ArrayList <String> getIDUser(){
        return this.id_user;
    }
    public void addUSERNAME (String value){
        username.add(value);
    }
    public ArrayList <String> getUSERNAME (){
        return this.username;
    }
    public void addPASSWORD (String value){
        password.add(value);
    }
    public ArrayList <String> getPASSWORD(){
        return this.password;
    }
    public void addBIOSKOP (String value){
        bioskop.add(value);
    }
    public ArrayList <String> getBIOSKOP(){
        return this.bioskop;
    }
    public void addLVL (int value){
        lvl.add(value);
    }
    public ArrayList <Integer> getLVL(){
        return this.lvl;
    }
    
    public void LoginUser
            (String id_user,
             String username,
             String password,
             String bioskop,
             Integer lvl){
                
             addIDUser(id_user);
             addUSERNAME(username);
             addPASSWORD(password);
             addBIOSKOP(bioskop);
             addLVL(lvl);
            }
}
