/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan17.programtunjangan;

import java.util.Scanner;
/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * NIM                  : 10119068
 * Kelas                : IF2
 * Deskripsi program    : Program menhtiung tunjangan dan gaji Pokok
 */
    public class PBOIF210119068Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */

    public static double inputUserGaji() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Berapa gaji pokok anda perbulan?: ");
       double gajiPokok = scanner.nextInt();
       return gajiPokok;
    }

    public static String inputUserStatus() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Status anda? (Menikah/Belum): ");
       String status = scanner.nextLine();
       return status;
    }


    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("----------Program Tunjangan----------");
       double gajiPokok = inputUserGaji();
       String status = inputUserStatus();
       double tunjangan,gajiTotal;
       
        if (status.equals("Menikah")) {
             tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0;
        }

        gajiTotal=tunjangan + gajiPokok;
        
        String outputText = "\n----------Hasil Perhitungan Gaji Anda----------\n" + 
            "Gaji Pokok\t: Rp. " + gajiPokok + "\n" +
            "Tunjangan\t: Rp. " + tunjangan + "\n" +
            "Gaji Total\t: Rp. " + gajiTotal + "\n" +
            "DIBUAT OLEH TATANG SULAEMAN";

        System.out.println(outputText);
    }
}