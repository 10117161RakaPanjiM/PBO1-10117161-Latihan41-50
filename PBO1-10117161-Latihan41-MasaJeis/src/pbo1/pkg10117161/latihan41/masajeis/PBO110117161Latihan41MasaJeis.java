/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan41.masajeis;
import java.util.Scanner;
/**
 *
 * @author GPS-2
 */
public class PBO110117161Latihan41MasaJeis {

    /**
     * @param args the command line arguments
     * NAMA  : Raka Panji Muhabieq
     * KELAS : PBO1
     * NIM   : 10117161
     * * Deskripsi Program : program ini berisi program yang dapat menghitung massa 
     * jenis kubus
     */
    public static void main(String[] args) {
       Kubus kubus = new Kubus();
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner (System.in);
        
        System.out.println("===Massa Jenis Kubus===");
        System.out.print("Sisi : ");
        kubus.setSisi(scn1.nextInt());
        System.out.print("Massa : " + "\n");
        kubus.setMassa(scn2.nextInt());
        
        System.out.println("");
        
        System.out.println("===Hasil Perhitungan===");
        System.out.println("Volume : " + kubus.hitungVolume(5));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(5,250));          
    }
}
