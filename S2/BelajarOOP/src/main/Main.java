package main;

import mobil.Mobil;
import motor.Motor;

public class Main {

    public static void main(String[] args) {
        //membuat objek mobil
        Mobil objectMobil = new Mobil();
        objectMobil.tampilDataMobil();

        //membuat objek motor
        Motor objekMotor = new Motor();

        objekMotor.setMerek("Yamaha");
        objekMotor.setTahunPembuatan(2016);
        objekMotor.setPunyaKacaSpion(false);

        System.out.println("Merek motor : " + objekMotor.getMerek());
    }
}
