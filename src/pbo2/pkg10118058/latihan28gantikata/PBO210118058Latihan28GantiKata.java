/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan28gantikata;

/**
 *
 * @author user
 *  * Nama : Satyaning Andaru Bawalaksana
 * Nim : 10118058
 * Kelas : IF-2
 * Nama kelas : Pemrograman Berbasis OO
 */
import java.util.Scanner;
public class PBO210118058Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println("=====Program Mengganti Kata=====");
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        Scanner input = new Scanner(System.in);
        String kal = input.nextLine();
        
        System.out.print("Ganti Kata : ");
        String kata1 = input.nextLine();
        System.out.print("Menjadi Kata : ");
        String kata2 = input.nextLine();
        
        String kal1 = kal.replace(kata1, kata2) ;
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Kalimat Awal : " + kal);
        System.out.println("Kalimat Baru : " + kal1);
        System.out.println("Developed by Satyaning Andaru Bawalaksana");
    }
    
}
