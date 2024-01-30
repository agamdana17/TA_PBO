import Database.AllModel;
import View.ViewBuku;
import Controller.ControllerBuku;


import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    public boolean login = false;
    ViewBuku viewBuku = new ViewBuku();
    ControllerBuku controllerBuku = new ControllerBuku(AllModel.bukus, viewBuku);

    static void insertStatic(){
        AllModel.bukus.tambahBuku("Koala Kumal", "Raditiya Dika", "EAA", "220");
        AllModel.bukus.tambahBuku("Laskar Pelangi", "Andrea Hirata", "kakca", "250");
    }
    private boolean adminLogin() {
        System.out.println();
        System.out.println("=== Admin Login ===");
        System.out.print("Username: ");
        String username = input.next();
        System.out.print("Password: ");
        String password = input.next();

        if ("admin".equals(username) && "admin123".equals(password)) {
            System.out.println("Login Berhasil!");
            login = true;
            return true;
        } else {
            System.out.println("Username atau Password salah");
            return false;
        }
    }

    public void Menu() {

        int pilih;
        do {
            System.out.println();
            System.out.println("=============================");
            System.out.println("        Perpustakaan       ");
            System.out.println("=============================");
            System.out.println("1. Masuk Sebagai Admin ");
            System.out.println("2. Masuk Sebagai Pengunjung ");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    if (adminLogin()) {
                        adminMenu();
                    }
                    break;
                case 2:
                    pengunjung();
                    break;
                case 3:
                    System.out.println("Program telah selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilih != 3);
    }

    private void adminMenu() {
        int pilihAdmin;
        do {
            System.out.println();
            System.out.println("=============================");
            System.out.println("        Admin Menu           ");
            System.out.println("=============================");
            System.out.println("1. Lihat Data Buku ");
            System.out.println("2. Tambah Data Buku ");
            System.out.println("3. Edit Data Buku ");
            System.out.println("4. Hapus Data Buku ");
            System.out.println("5. Cari Buku");
            System.out.println("6. Logout");
            System.out.print("Pilih : ");
            pilihAdmin = input.nextInt();

            switch (pilihAdmin) {
                case 1:
                    System.out.println("Data Buku");
                    controllerBuku.viewAllBuku();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Tambah Buku ");
                    controllerBuku.tambahBuku();
                    break;
                case 3:
                    System.out.println("Edit Stok Buku ");
                    controllerBuku.updateStok();
                    break;
                case 4:
                    System.out.println("Hapus Buku ");
                    controllerBuku.hapusBuku();
                    break;
                case 5:
                    System.out.println("Cari Buku");
                    controllerBuku.lihatBuku();
                    break;
                case 6:
                    System.out.println("Logout berhasil.");
                    login = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilihAdmin != 6);
    }

    private void pengunjung() {
        int pilihGuest;
        System.out.println("Masuk Sebagai Pengunjung");
        do {
            System.out.println();
            System.out.println("=============================");
            System.out.println("       Pengunjung Menu       ");
            System.out.println("=============================");
            System.out.println("1. Lihat Data Buku ");
            System.out.println("2. Cari Buku");
            System.out.println("3. Logout");
            System.out.print("Pilih : ");
            pilihGuest = input.nextInt();

            switch (pilihGuest) {
                case 1:
                    System.out.println("Data Buku");
                    controllerBuku.viewAllBuku();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Cari Buku");
                    controllerBuku.lihatBuku();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Logout berhasil.");
                    login = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilihGuest != 3);
    }
    public static void main(String[] args) {
        Main main = new Main();
        insertStatic();
        main.Menu();

    }
}