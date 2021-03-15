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
public class Induk {
    //parameter untuk identitas
    public void identitas(String nama, String kelas){
        System.out.println("Identitas pengguna kalkulator");
        System.out.println("Nama = "+nama);
        System.out.println("Kelas = "+kelas);
    }
    //judul 1
    String Print1;
    String Print1(){
        Print1 = "\n"+"Meghitung Luas Permukaan Bangun Ruang"+"\n";
        return Print1;
    }
    //judul 2
    String Print2;
    String Print2(){
        Print2 = "\n"+"Meghitung Volume Bangun ruang"+"\n";
        return Print2;
    }
}
