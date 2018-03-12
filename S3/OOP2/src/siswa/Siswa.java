package siswa;

public class Siswa {

    private String namaSiswa;
    private int nisnSiswa;

    public Siswa(String nama, int nisn) {
        namaSiswa = nama;
        nisnSiswa = nisn;
    }

    public void tampilSiswa() {
        System.out.println("Nama : " + namaSiswa);
        System.out.println("NISN : " + nisnSiswa);
    }
}
