package looping;

import java.util.ArrayList;
import java.util.List;

public class ContohLooping {

    public static void main(String[] args) {
        List<Siswa> listSiswa = new ArrayList<>();

        //contoh for1 = for indexed -> untuk input data
        for (int i=0;i<10;i++) {
            //1. membuat objek data siswa
            Siswa dataSiswa = new Siswa("Siswa"+(i+1), i);
            //2. menambahkan objek data siswa ke listSiswa
            listSiswa.add(dataSiswa);
        }

        //contoh for2 = foreach -> untuk menampilkan data
        for (Siswa dataSiswa : listSiswa) {
            System.out.println("Nama Siswa : "+dataSiswa.getNama());
            System.out.println("NIS : "+dataSiswa.getNis());
            System.out.println("-------------------");
        }

        //contoh while
        int i = 0;
        while (i < listSiswa.size()) {

            if (i%2 == 0) {
                Siswa dataSiswa = listSiswa.get(i);
                System.out.println("Nama Siswa : "+dataSiswa.getNama());
                System.out.println("NIS : "+dataSiswa.getNis());
                System.out.println("-------------------");
            }
            i++;
        }
    }
}
