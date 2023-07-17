import java.util.ArrayList;
import java.util.Scanner;

// Class Main
public class Main {
    private static ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
    private static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        // Tambahkan motor dan pelanggan awal
        daftarKendaraan.add(new Motor("Honda", "Vario", 50000));
        daftarKendaraan.add(new Motor("Yamaha", "NMAX", 60000));
        daftarPelanggan.add(new Pelanggan("John", "JlMerdekaNo123", "08123456789"));
        daftarPelanggan.add(new Pelanggan("Jane", "Jl.ProklamasiNo.456", "087654321"));

        while (!exit) {
            System.out.println("MENU UTAMA");
            System.out.println("1. Perlihatkan Motor");
            System.out.println("2. Tambah Motor");
            System.out.println("3. Perlihatkan Pelanggan");
            System.out.println("4. Tambah Pelanggan");
            System.out.println("5. Sewa Motor");
            System.out.println("6. Kembalikan Motor");
            System.out.println("7. Keluar");
            System.out.println("========================================");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    perlihatkanMotor();
                    break;
                case 2:
                    tambahMotor();
                    break;
                case 3:
                    perlihatkanPelanggan();
                    break;
                case 4:
                    tambahPelanggan();
                    break;
                case 5:
                    sewaMotor();
                    break;
                case 6:
                    kembalikanMotor();
                    break;
                case 7:
                    exit = true;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }

    // Perlihatkan Motor
    private static void perlihatkanMotor() {
        System.out.println("DAFTAR MOTOR");
        for (Kendaraan kendaraan : daftarKendaraan) {
            if (kendaraan instanceof Motor) {
                Motor motor = (Motor) kendaraan;
                System.out.println("Merk: " + motor.getMerk());
                System.out.println("Tipe: " + motor.getTipe());
                System.out.println("Harga Sewa per Hari: " + motor.getHargaSewaPerHari());
                System.out.println("============================================");
            }
        }
    }

    // Tambah Motor
    private static void tambahMotor() {
        System.out.println("TAMBAH MOTOR");
        System.out.print("Merk: ");
        String merk = scanner.next();
        System.out.print("Tipe: ");
        String tipe = scanner.next();
        System.out.print("Harga Sewa per Hari: ");
        double hargaSewaPerHari = scanner.nextDouble();

        daftarKendaraan.add(new Motor(merk, tipe, hargaSewaPerHari));

        System.out.println("Motor berhasil ditambahkan!");
        System.out.println("=========================================");
    }

    // Perlihatkan Pelanggan
    private static void perlihatkanPelanggan() {
        System.out.println("DAFTAR PELANGGAN");
        for (Pelanggan pelanggan : daftarPelanggan) {
            System.out.println("Nama: " + pelanggan.getNama());
            System.out.println("Alamat: " + pelanggan.getAlamat());
            System.out.println("No Telepon: " + pelanggan.getNoTelepon());
            System.out.println("========================================");
        }
    }

    // Tambah Pelanggan
    private static void tambahPelanggan() {
        System.out.println("TAMBAH PELANGGAN");
        System.out.print("Nama: ");
        String nama = scanner.next();
        System.out.print("Alamat: ");
        String alamat = scanner.next();
        System.out.print("No Telepon: ");
        String noTelepon = scanner.next();

        daftarPelanggan.add(new Pelanggan(nama, alamat, noTelepon));

        System.out.println("Pelanggan berhasil ditambahkan!");
        System.out.println("============================================");
    }

    // Sewa Motor
    private static void sewaMotor() {
        System.out.println("SEWA MOTOR");
        System.out.print("Nama Pelanggan: ");
        String namaPelanggan = scanner.next();
        System.out.print("Merk Motor yang Disewa: ");
        String merkMotor = scanner.next();

        Pelanggan pelanggan = cariPelanggan(namaPelanggan);
        Motor motor = (Motor) cariMotor(merkMotor);

        if (pelanggan != null && motor != null) {
            System.out.print("Lama Sewa (hari): ");
            int lamaSewa = scanner.nextInt();
            double totalBiaya = motor.hitungBiayaSewa(lamaSewa);

            System.out.println("Pelanggan " + pelanggan.getNama() + " telah menyewa motor " +
                    motor.getMerk() + " " + motor.getTipe() + " selama " + lamaSewa + " hari.");
            System.out.println("Total Biaya: " + totalBiaya);
            System.out.println("================================================================");
        } else {
            System.out.println("Nama pelanggan atau merk motor tidak ditemukan.");
            System.out.println("=================================================================");
        }
    }

    // Kembalikan Motor
    private static void kembalikanMotor() {
        System.out.println("KEMBALIKAN MOTOR");
        System.out.print("Nama Pelanggan: ");
        String namaPelanggan = scanner.next();
        System.out.print("Merk Motor yang Dikembalikan: ");
        String merkMotor = scanner.next();

        Pelanggan pelanggan = cariPelanggan(namaPelanggan);
        Motor motor = (Motor) cariMotor(merkMotor);

        if (pelanggan != null && motor != null) {
            System.out.println("Pelanggan " + pelanggan.getNama() + " telah mengembalikan motor " +
                    motor.getMerk() + " " + motor.getTipe() + ".");
            System.out.println("Terima kasih!");
            System.out.println("===================================================");
        } else {
            System.out.println("Nama pelanggan atau merk motor tidak ditemukan.");
            System.out.println("======================================================");
        }
    }

    // Cari Pelanggan berdasarkan nama
    private static Pelanggan cariPelanggan(String nama) {
        for (Pelanggan pelanggan : daftarPelanggan) {
            if (pelanggan.getNama().equalsIgnoreCase(nama)) {
                return pelanggan;
            }
        }
        return null;
    }

    // Cari Motor berdasarkan merk
    private static Kendaraan cariMotor(String merk) {
        for (Kendaraan kendaraan : daftarKendaraan) {
            if (kendaraan instanceof Motor && kendaraan.getMerk().equalsIgnoreCase(merk)) {
                return kendaraan;
            }
        }
        return null;
    }
}