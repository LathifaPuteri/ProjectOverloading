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
public class LuasPermukaan extends Induk {
    //parameter Luas Permukaan Kubus
    public void luaspermukaan(int sisi){
        System.out.println("Luas Permukaan Kubus = "+(6*sisi));
    }
    //parameter Luas Permukaan Balok
    public void luaspermukaan(int panjang, int lebar, int tinggi){
        System.out.println("Luas Permukaan Balok = "+2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi)));
    }
}
