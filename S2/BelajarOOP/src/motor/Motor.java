package motor;

//contoh enkapsulasi

public class Motor {

    String merek;
    String nomorPlat;
    String tipe;
    int tahunPembuatan;
    boolean isPunyaKacaSpion;

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public void setNomorPlat(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public boolean isPunyaKacaSpion() {
        return isPunyaKacaSpion;
    }

    public void setPunyaKacaSpion(boolean punyaKacaSpion) {
        isPunyaKacaSpion = punyaKacaSpion;
    }
}
