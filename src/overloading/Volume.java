/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;
import java.lang.Math;
/**
 *
 * @author MOKLET-2
 */
public class Volume extends Induk{
    //parameter Volume Tabung
    public void volume(int jarijari, int tinggi){
        System.out.println("Volume Tabung = "+(jarijari*jarijari*tinggi)*Math.PI);
    }
    //parameter Volume Limas
    public void volume(int panjang, int lebar, int tinggi){
        System.out.println("Volume Limas = "+(panjang*lebar*tinggi/3));
    }
}
