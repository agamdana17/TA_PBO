package View;

import Model.ModelBuku;
import Node.Buku;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewBuku {
    Scanner input = new Scanner(System.in);

    //Menu
    public void tambahBuku(ModelBuku modelBuku){
        System.out.print("Judul          : ");
        String judul = input.nextLine();
        System.out.print("Pengarang      : ");
        String pengarang = input.nextLine();
        System.out.print("Penerbit       : ");
        String penerbit = input.nextLine();
        System.out.print("Jumlah Halaman : ");
        String halaman = input.nextLine();
        modelBuku.tambahBuku(judul, pengarang, penerbit, halaman);
    }

    public void cetakAllBuku(ArrayList<Buku>bukus){
        for (int i=0; i < bukus.size(); i++){
            System.out.println("No Rak            : " + (i+1) );
            System.out.println("Judul             : "+ bukus.get(i).judul);
            System.out.println("Pengarang         : "+ bukus.get(i).pengarang );
            System.out.println("Penerbit          : "+ bukus.get(i).penerbit);
            System.out.println("Jumlah Halaman    : "+ bukus.get(i).halaman);
            System.out.println("Stok              : "+ bukus.get(i).stok);
            System.out.println("-------------------------------------------------");
        }
    }

    public void cetakBuku(ModelBuku modelBuku){
        System.out.println("Masukkan Judul : ");
        String judul = input.nextLine();
        Buku buku = modelBuku.cariBuku(judul);
        int i=0;
        if (buku!=null){
            System.out.println("no. Rak          : " + (i+1));
            System.out.println("Judul            : " + buku.judul);
            System.out.println("Pengarang        : " + buku.pengarang);
            System.out.println("Penerbit         : " + buku.penerbit);
            System.out.println("Jumlah Halaman   : " + buku.halaman);
            System.out.println("Stok             : " + buku.stok);
        }else {
            System.out.println("Buku tidak ditemukan");
        }
    }

    public void updateStok(ModelBuku modelBuku){
        System.out.println("Masukkan Judul    : ");
        String judul = input.nextLine();
        System.out.println("Stok product baru   : ");
        int newstok = input.nextInt();
        modelBuku.updateBuku(newstok, judul);
    }

    public void hapusBuku(ModelBuku modelBuku){
        System.out.print("Masukkan Judul : ");
        String judul = input.nextLine();
        modelBuku.hapusBuku(judul);
        System.out.println("Berhasil Dihapus");
    }
}
