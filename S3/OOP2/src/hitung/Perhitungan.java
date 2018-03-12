package hitung;

import class_interface.Operasi;

public class Perhitungan implements Operasi {

    public Perhitungan() {

    }

    @Override
    public double perkalian(double x, double y) {
        //melakukan perkalian `x` dan `y` lalu HASILNYA disimpan dlm variabel `hasil`
        double hasil = x * y;
        //method perkalian me-return variabel `hasil`
        return hasil;
    }

    @Override
    public double pembagian(double a, double b) {
        return a / b;
    }

    @Override
    public int penjumlahan(int x, int y) {
        return x + y;
    }

    @Override
    public int pengurangan(int a, int b) {
        return a - b;
    }
}
