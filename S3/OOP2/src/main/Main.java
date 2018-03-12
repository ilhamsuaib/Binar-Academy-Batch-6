package main;

import hitung.Perhitungan;
import siswa.Siswa;

public class Main {

    public static void main(String[] args) {

        //membuat objek class pehitungan
        Perhitungan objekPerhitungan = new Perhitungan();

        //memanggil fungsi perkalian
        System.out.println("Hasil perkalian : " + objekPerhitungan.perkalian(45.5, 34.03));

        //memanggil fungsi pembagian
        double hasilBagi = objekPerhitungan.pembagian(10, 2);
        System.out.println("Hasil pembagian : " + hasilBagi);

        //memanggil fungsi penjumlahan
        int hasilJumlah = objekPerhitungan.penjumlahan(4,5);
        System.out.println("Hasil penjumlahan : " + hasilJumlah);

        //memanggil fungsi pengurangan
        int hasilKurang = objekPerhitungan.pengurangan(5,4);
        System.out.println("Hasil pengurangan : " + hasilKurang);


        Siswa objekSiswa = new Siswa("Ilham", 123123);
        objekSiswa.tampilSiswa();
    }
}
