
public class Ayam extends Hewan {

    String jenis;
    String jenisKelamin;

    public Ayam() {
    }

    public Ayam(int jmlKaki, String warna, boolean isMamalia, String jenis, String jenisKelamin) {
        super(jmlKaki, warna, isMamalia);
        this.jenis = jenis;
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void printAyam() {
        System.out.println("\nData Ayam");
        System.out.println("Jenis : " + jenis);
        System.out.println("Jumlah Kaki : " + jmlKaki);
        System.out.println("Warna : " + warna);
        System.out.println("Jenis Kelamin : " + jenisKelamin);

        if (!isMamalia) {
            System.out.println("Bukan Hewan Mamalia");
        } else {
            System.out.println("Merupakan Hewan Mamalia");
        }
    }
}
