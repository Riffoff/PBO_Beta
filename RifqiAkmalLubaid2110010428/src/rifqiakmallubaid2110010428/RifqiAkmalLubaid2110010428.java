/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rifqiakmallubaid2110010428;

/**
 *
 * @author acer
 */
public class RifqiAkmalLubaid2110010428 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        User obj = new User();
        obj.setIDUSER("2110010428");
        obj.setUSERNAME("Rifqi Akmal Lubaid");
        obj.setPASSWORD("0987654321");
        obj.setBIOSKOP("-");
        obj.setLVL("admin");
        System.out.println("\n ID User : "+ obj.getIDUSER()
                    +"\n Username : "+obj.getUSERNAME()
                    +"\n Password : " +obj.getPASSWORD()
                    +"\n Bioskop :" +obj.getBIOSKOP()
                    +"\n Level : " +obj.getLVL());
    }
    
}
