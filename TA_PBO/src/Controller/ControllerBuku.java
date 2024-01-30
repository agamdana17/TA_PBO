package Controller;

import Model.ModelBuku;
import View.ViewBuku;


public class ControllerBuku {

    ModelBuku modelBuku;
    ViewBuku viewBuku;
    public  ControllerBuku(ModelBuku modelBuku, ViewBuku viewBuku){
        this.modelBuku = modelBuku;
        this.viewBuku = viewBuku;
    }

    public void viewAllBuku(){
        viewBuku.cetakAllBuku(modelBuku.lihatBuku());
    }

    public void tambahBuku(){
        viewBuku.tambahBuku(modelBuku);
    }

    public void lihatBuku(){
        viewBuku.cetakBuku(modelBuku);
    }

    public void updateStok(){
        viewBuku.updateStok(modelBuku);
    }

    public void hapusBuku(){
        viewBuku.hapusBuku(modelBuku);
    }

}

