package Node;

public class Buku {
    public int kode;
    public String judul;
    public String pengarang;
    public String penerbit;
    public String halaman;
    public int stok;

    public Buku(int kode, String judul, String pengarang, String penerbit, String halaman){
        this.kode = kode;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.halaman = halaman;
    }

    public String getJudul() {
        return judul;
    }

    public void updateBuku(int newstock){
        this.stok = this.stok + newstock;
    }

}

