/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penyimpanan;
import java.sql.DriverManager;

/**
 *
 * @author iqbal
 */
public class konek {
    private static java.sql.Connection konek;
    
    public static java.sql.Connection getKonek(){
        if (konek == null){
            try{
                String url = "jdbc:mysql://localhost:3306/karyawan";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                konek = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi berhasil");
            }catch (Exception e){
                System.out.println("Gagal koneksi");
            }
        }
        return konek;
    }
    
    public static void main(String args[]){
        getKonek();
    }
}
