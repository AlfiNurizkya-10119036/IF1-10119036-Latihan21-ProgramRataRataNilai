/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfi Nurizkya
 * Nama  : ALFI NURIZKYA
 * Kelas : IF-1
 * NIM   : 10119036
 * Deskripsi Program : Program Menentukan Rata-Rata Nilai
 */

import java.util.Scanner;

public class IF110119036Latihan21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner masuk = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        System.out.print ("Banyaknya Data: ");
        n = masuk.nextInt();
        jum=0;
        i=1;
        while (i<=n){
                System.out.print ("Data ke-"+i+": ");
                x=masuk.nextFloat ();
                jum += x;
                i++;
        }
        rata = jum / n;
        System.out.println ("Maka, Nilai Rata-rata nya adalah "+rata);
        System.out.println ("Jumlah: "+jum);
    }
    
}
