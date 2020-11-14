/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan50.energykinetik;

/**
 *
 * @author GPS-2
 */
public class PBO110117161Latihan50EnergyKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Energi bola = new Energi();
        bola.setMassa(145);
        bola.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan massa = " + bola.getMassa() + " g");
        System.out.println("Bola baseball terssebut dilempar dengan kecepatan = " + bola.getKecepatan() + " m/s");
        
        double massa = bola.getMassa();
        double kecepatan = bola.getKecepatan();
        
        System.out.println("A. Energi Kinetik = " + bola.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola = " + bola.usaha());
        System.out.println("P.S : Nilai usaha tetap, karena dimulai dari keadaan diam");
    }
    
}