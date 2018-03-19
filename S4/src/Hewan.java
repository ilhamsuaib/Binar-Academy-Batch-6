
public class Hewan {

    int jmlKaki;
    String warna;
    boolean isMamalia;

    public Hewan() {
    }

    public Hewan(int jmlKaki, String warna, boolean isMamalia) {
        this.jmlKaki = jmlKaki;
        this.warna = warna;
        this.isMamalia = isMamalia;
    }

    public int getJmlKaki() {
        return jmlKaki;
    }

    public void setJmlKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean isMamalia() {
        return isMamalia;
    }

    public void setMamalia(boolean mamalia) {
        isMamalia = mamalia;
    }
}
