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
import java.util.Scanner;
public class soalan1 {
    public static void main(String[] input){
    int i, j;
    String temp;
    Scanner scan = new Scanner (System.in);
    String nama[] = new String[7];
    System.out.print("Taipkan 7 nama rakan anda :");
    for(i=0; i<=7; i++){
     nama[i] = scan.nextLine();
    }
    System.out.println("\nSusunan nama yang dimasukkan tadi dalam susunan A-Z...\n");
    for(i=0; i<7; i++){
        for(j=1; j<5; j++){
          if(nama[j-1].compareTo(nama[j])>0){
            temp=nama[j-1];
            nama[j-1]=nama[j];
            nama[j]=temp;   
          }
        }
    }
    System.out.print("Susunan nama dalam susunan anda telah berjaya!!!..");
    System.out.println("\nSsunannya adalah : \n");
    for(i=0; i<=5; i++){
     System.out.println(nama[i]);
    } 
   }
}
