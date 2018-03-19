package struktur_data;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //contoh array
        //1. membuat data array
        String[] namaSiswa = {"Ilham", "Jodi", "Jones", "dll"};
        int[] nomorCelana = {4, 23, 123, 34, 123, 345345, 3124234};

        //2. mengakses data dari array
        System.out.println("nomor celana ke 4 : "+nomorCelana[5]);

        //----------------------//

        //contoh List<>
        //1. membuat data list nama siswa
        List<String> students = new ArrayList<>();
        students.add("Ilham");
        students.add("Jodi");
        students.add("Jones");
        students.add("dll");

        //2. mengakses data dari list
        System.out.println("Nama dengan index ke 2 "+students.get(1));
    }
}
