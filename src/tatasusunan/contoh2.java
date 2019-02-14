/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tatasusunan;

/**
 *
 * @author pc 18
 */
public class contoh2 {
    public static void main(String[] args){
    java.util.Scanner input = new java.util.Scanner(System.in);
    String[] namaBulan = {"Muharram","Safar","Rabiul awal","Rabiul akhir",
        "Jamadil awal","Jamadil akhir","Rejab","Sya'ban","Ramadhan","Syawal","Zulkaidah","Zulhijah" };
    
    System.out.print("NAMA-NAMA BULAN DALAM KALENDAR HIJRAH\n");
    
    System.out.print("Masukkan nombor(1 hingga 12):");
    
    int bilBulan = input.nextInt();
    
    System.out.println("Bulan"+bilBulan+ "adalah bulan" + namaBulan [bilBulan - 1]);
    
    
    
    }
    
}
