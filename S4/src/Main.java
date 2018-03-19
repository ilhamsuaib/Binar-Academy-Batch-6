

public class Main implements ContohInterface {

    public static void main(String[] args) {
        Ayam ayam = new Ayam(2, "hitam", false, "ayam kampung", "jantan");
        ayam.printAyam();

        Ayam ayam1 = new Ayam();
        ayam1.setJmlKaki(2);
        ayam1.setWarna("merah muda");
        ayam1.printAyam();

        Hewan hewan = new Ayam();
        hewan.setJmlKaki(2);
        hewan.setWarna("biru muda");
        System.out.println("\nHewan : Ayam");
        System.out.println("Jml Kaki : "+hewan.getJmlKaki());
        System.out.println("Hewan : "+hewan.getWarna());

        Object object = ayam;
        if (object instanceof Ayam) {
            Ayam ayam2 = (Ayam) object;
            ayam2.printAyam();
        }
    }

    @Override
    public void tampilNama(String nama) {

    }
}
