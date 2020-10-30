package com.latihan;

import java.util.Scanner;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : mengubah besar kecil huruf yang di masukkan Latihan 27
 *
 */
public class changeWord {
    public static void main(String[] args) {
        // deklarasi variabel
        String nama;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        nama = keyboard.nextLine();

        System.out.println("\n====Hasil Formating====");
        System.out.println("Huruf Besar : " + nama.toUpperCase());
        System.out.println("Huruf Kecil : " + nama.toLowerCase());
    }
}
