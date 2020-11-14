/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10117161.latihan43.gajipegawai;

/**
 *
 * @author GPS-2
 * NAMA  : Raka Panji Muhabieq
 * KELAS : PBO1
 * NIM   : 10117161
 */
public class PBO110117161Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("### Data Gaji Karyawan De Bruyne Company ###");
        System.out.println("----------------------");
        GajiPegawai pgw = new GajiPegawai();
        pgw.setNama("Gery Akbar Fauzi");
        pgw.setAlamat("Manggahang 2 Rt 06/05");
        pgw.setUangTransport(250000);
        pgw.setUangTunjangan(300000);
        pgw.setGajiPokok(4500000);
        pgw.setTotalGaji(pgw.getTotalGaji());
        pgw.tampilData(pgw.getNama(), pgw.getAlamat(), pgw.getUangTunjangan(), pgw.getUangTransport(), pgw.getGajiPokok(), pgw.getTotalGaji());
    }
    
}