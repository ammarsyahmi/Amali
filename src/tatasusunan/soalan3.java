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
public class soalan3 {
   public static void main(String[] args){
   
   final int BILANGAN_MARKAH = 5;
   
   java.util.Scanner input = new java.util.Scanner(System.in);
   
   String[] namaPep = {"Febuari", "Pertengahan Tahun", "Akhir Tahun"};
   
   System.out.print("Peperiksaan/Ujian kali ke : (1 / 2 / 3) : " );
   
   int bilPep = input.nextInt();
   
   System.out.println("Masukkan 5 markah");
   
   double [] markah = new double[BILANGAN_MARKAH];
   
   double jumlah = 0;
   
   for (int i = 0; i < BILANGAN_MARKAH; i++){
   
       System.out.print("Markah : ");
       markah[i] = input.nextDouble();
       jumlah += markah[i];
   }
   double purata = jumlah / BILANGAN_MARKAH;
   int bilang = 0;
   
   for (int i = 0; i < BILANGAN_MARKAH; i++)
       if( markah[i] > purata)
           bilang++;
   System.out.println("Peperiksaan/Ujian " +namaPep[bilPep - 1]);
   
   System.out.println("Purata Markah : " +purata);
   
   System.out.println("Bilangn markah yang melepasi purata : " +bilang);
   } 
}
