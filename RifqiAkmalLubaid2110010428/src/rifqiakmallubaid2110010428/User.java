/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rifqiakmallubaid2110010428;

/**
 *
 * @author acer
 */
public class User {
    private String username, password, iduser;
    private String bioskop, lvl;
    
    
    
   public User (){}
   
   public void setIDUSER(String iduser){
       this.iduser = iduser;
   }
    
   public String getIDUSER(){
       return this.iduser;
   }
   
   public void setUSERNAME(String username){
       this.username = username;
   }
    
   public String getUSERNAME(){
       return this.username;
   }
   
   public void setPASSWORD(String password){
       this.password = password;
   }
    
   public String getPASSWORD(){
       return this.password;
   }
   
   public void setBIOSKOP(String bioskop){
       this.bioskop = bioskop;
   }
    
   public String getBIOSKOP(){
       return this.bioskop;
   }
   
   public void setLVL(String lvl){
       this.lvl = lvl;
   }
   
   public String getLVL(){
       return this.lvl;
   }
}
