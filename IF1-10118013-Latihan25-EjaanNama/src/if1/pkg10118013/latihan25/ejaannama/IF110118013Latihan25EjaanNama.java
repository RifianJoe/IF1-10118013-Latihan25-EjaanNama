/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-1
 * NIM : 10118013
 * Deskripsi Program : Menampilkan Ejaan Nama
 */
public class IF110118013Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan nama depan anda untuk dieja : ");
        Scanner scanner = new Scanner(System.in);
        String namaDepan = scanner.next();
        System.out.println("Ejaan untuk " + namaDepan + " adalah : ");
        for (int i = 0; i < namaDepan.length(); i++)
            System.out.println("Huruf ke-" + (i+1) + " : " + namaDepan.charAt(i));
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}
