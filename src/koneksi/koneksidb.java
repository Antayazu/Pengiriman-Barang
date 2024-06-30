package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksidb{
    public static Connection BukaKoneksi(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_pbo", "root", "");
            return cn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public static void main(String[] args) {
        BukaKoneksi();
    }
}