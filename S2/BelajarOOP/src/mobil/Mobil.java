package mobil;

public class Mobil {

    String merk = "Suzuki";
    String tipe = "Suzuki R3";
    int tahunPembuatan = 2016;
    String warna = "Putih";
    boolean isSunRoof = true;

    public void tampilDataMobil() {
        System.out.println("-- DATA MOBIL --");
        System.out.println("Merek : " + merk);
        System.out.println("Tipe : " + tipe);
        System.out.println("Tahun : " + tahunPembuatan);
        System.out.println("Warna : " + warna);

        if (isSunRoof == true) {
            System.out.println("Punya Sun Roof : Ya");
        } else {
            System.out.println("Punya Sun Roof : Tidak");
        }
    }
}
