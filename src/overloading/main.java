/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author MOKLET-2
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //mendeklarasikan objek Induk
        Induk print = new Induk();
        
        //void identitas
        print.identitas("Lathifa Puteri", "XR2");
        
        //judul 1
        System.out.println(print.Print1());
        
        // mendeklarasikan objek Luas Permukaan
        LuasPermukaan luaspermukaan = new LuasPermukaan();
        //luas permukaan kubus
        luaspermukaan.luaspermukaan(2);
        //luas permukaan balok
        luaspermukaan.luaspermukaan(2, 3, 5);
        
        //judul 2
        System.out.println(print.Print2());
        
        //mendeklarasikan objek Volume
        Volume volume = new Volume();
        //Volume Tabung
        volume.volume(7, 10);
        //volume Limas
        volume.volume(5, 3, 4);
    }
    
}
