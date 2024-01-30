package Model;
import Node.Buku;
import java.util.ArrayList;

public class ModelBuku {
    private ArrayList<Buku> bukus;
    private  int update_kode=-1;
    public ModelBuku(){
        this.bukus = new ArrayList<>();
    }

    public void tambahBuku(String judul, String pengarang, String penerbit, String halaman){
        this.update_kode++;
        this.bukus.add(new Buku(this.update_kode, judul, pengarang, penerbit, halaman));
    }

    public ArrayList<Buku> lihatBuku(){return bukus;}

    public void hapusBuku(String judul){
        for (int i=0; i<bukus.size(); i++){
            if (bukus.equals(bukus.get(i).getJudul())){
                bukus.remove(i);
            }
        }
    }

    public void updateBuku(int newstock, String judul){
        Buku barang = cariBuku(judul);
        barang.updateBuku(newstock);
    }

    public Buku cariBuku(String judul){
        Buku buku = null;
        for (int i=0; i<bukus.size(); i++){
            if (judul.equals(bukus.get(i).judul)){
                buku = bukus.get(i);
            }
        }
        return buku;
    }

}
