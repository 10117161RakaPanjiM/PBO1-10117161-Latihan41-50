/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * @author GPS-2
 * NAMA  : Raka Panji Muhabieq
 * KELAS : PBO1
 * NIM   : 10117161
 */
public class PBO110117161Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner baca = new Scanner(System.in);
        Printer ptr = new Printer();
        System.out.println("=== Aplikasi Pencetak Nama===");
        System.out.print("Masukkan Nama Anda : ");
        ptr.setNama(baca.nextLine());
        System.out.print("Mau Cetak Berapa Kali? : ");
        ptr.setJmlCetak(baca.nextInt());
        ptr.cetak(ptr.getNama());
        ptr.cetak(ptr.getJmlCetak(), ptr.getNama());
    }
    
}