import java.util.ArrayList;
import java.util.Scanner;

// Class Main
public class Main {
    private static ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();// Membuat ArrayList untuk menyimpan objek-objek Kendaraan (Motor)
    private static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();// objek-objek Pelanggan
    private static Scanner scanner = new Scanner(System.in); //Scanner untuk membaca input dari pengguna


    public static void main(String[] args) {
        boolean exit = false;

        // implementasi constructor tanpa parameter pada kelas Pelanggan
        Pelanggan pelanggan1 = new Pelanggan();
        System.out.println("Pelanggan Default:");
        System.out.println("Nama: " + pelanggan1.getNama());
        System.out.println("Alamat: " + pelanggan1.getAlamat());
        System.out.println("No Telepon: " + pelanggan1.getNoTelepon());

        // implementasi setter pada kelas Motor
        Motor motor1 = new Motor("Suzuki", "Hayate", 45000);
        System.out.println("\nMotor Sebelum Set:");
        System.out.println("Merk: " + motor1.getMerk());
        System.out.println("Tipe: " + motor1.getTipe());
        System.out.println("Harga Sewa per Hari: " + motor1.getHargaSewaPerHari());

        // Menggunakan setter untuk mengubah harga sewa per hari
        motor1.setHargaSewaPerHari(48000);
        System.out.println("\nMotor Setelah Set:");
        System.out.println("Merk: " + motor1.getMerk());
        System.out.println("Tipe: " + motor1.getTipe());
        System.out.println("Harga Sewa per Hari: " + motor1.getHargaSewaPerHari());
    

        // Tambahkan motor dan pelanggan awal
        daftarKendaraan.add(new Motor("Honda", "Vario", 50000));// Menambahkan objek 
        daftarKendaraan.add(new Motor("Yamaha", "NMAX", 60000));
        daftarKendaraan.add(new Motor("Bebek", "Pespa", 60000));
        

        daftarPelanggan.add(new Pelanggan("John", "JlMerdekaNo123", "08123456789"));
        daftarPelanggan.add(new Pelanggan("Jane", "Jl.ProklamasiNo.456", "087654321"));
        daftarPelanggan.add(new Pelanggan("Susila", "Jl.KartiniNo.90", "08987073000"));
       
        while (!exit) { // Mengulangi selama exit bernilai false
            System.out.println("MENU UTAMA");
            System.out.println("1. Perlihatkan Motor");
            System.out.println("2. Tambah Motor");
            System.out.println("3. Perlihatkan Pelanggan");
            System.out.println("4. Tambah Pelanggan");
            System.out.println("5. Sewa Motor");
            System.out.println("6. Kembalikan Motor");
            System.out.println("7. Keluar");
            System.out.println("========================================");

            int pilihan = scanner.nextInt(); // Membaca input pilihan dari pengguna


            switch (pilihan) { // Menggunakan switch-case untuk mengeksekusi kode berdasarkan pilihan pengguna
                case 1:
                    perlihatkanMotor();  // Memanggil metode perlihatkanMotor untuk 
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
        for (Kendaraan kendaraan : daftarKendaraan) { // Menggunakan for-each loop untuk mengulangi setiap elemen dalam daftarKendaraan
            if (kendaraan instanceof Motor) { // Menggunakan operator instanceof untuk memeriksa apakah elemen adalah objek Motor
                Motor motor = (Motor) kendaraan;
                System.out.println("Merk: " + motor.getMerk()); // Menggunakan type casting untuk mengubah tipe elemen dari Kendaraan 
                                                                // menjadi Motor
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
        String merk = scanner.next(); // Membaca input merk dari pengguna
        System.out.print("Tipe: ");
        String tipe = scanner.next();
        System.out.print("Harga Sewa per Hari: ");
        double hargaSewaPerHari = scanner.nextDouble();

        daftarKendaraan.add(new Motor(merk, tipe, hargaSewaPerHari)); // Menambahkan objek Motor baru ke daftarKendaraan dengan parameter merk, 
                                                                        //tipe, dan harga sewa per hari

        System.out.println("Motor berhasil ditambahkan!");
        System.out.println("=========================================");
    }

    // Perlihatkan Pelanggan
    private static void perlihatkanPelanggan() {
        System.out.println("DAFTAR PELANGGAN");
        for (Pelanggan pelanggan : daftarPelanggan) { // Menggunakan for-each loop untuk mengulangi setiap elemen dalam daftarPelanggan
            System.out.println("Nama: " + pelanggan.getNama()); // Menampilkan nilai nama pelanggan dengan menggunakan metode getter
            System.out.println("Alamat: " + pelanggan.getAlamat());
            System.out.println("No Telepon: " + pelanggan.getNoTelepon());
            System.out.println("========================================");
        }
    }

    // Tambah Pelanggan
    private static void tambahPelanggan() {
        System.out.println("TAMBAH PELANGGAN");
        System.out.print("Nama: ");
        String nama = scanner.next(); // Membaca input nama dari pengguna
        System.out.print("Alamat: ");
        String alamat = scanner.next();
        System.out.print("No Telepon: ");
        String noTelepon = scanner.next();

        daftarPelanggan.add(new Pelanggan(nama, alamat, noTelepon)); // Menambahkan objek Pelanggan baru ke daftarPelanggan dengan 
                                                                    //parameter nama, alamat, dan nomor telepon

        System.out.println("Pelanggan berhasil ditambahkan!");
        System.out.println("============================================");
    }

    // Sewa Motor
    private static void sewaMotor() {
        System.out.println("SEWA MOTOR");
        System.out.print("Nama Pelanggan: ");
        String namaPelanggan = scanner.next(); // Membaca input nama pelanggan dari pengguna 
        System.out.print("Merk Motor yang Disewa: ");
        String merkMotor = scanner.next(); // Membaca input merk motor yang disewa dari pengguna

        Pelanggan pelanggan = cariPelanggan(namaPelanggan);
        Motor motor = (Motor) cariMotor(merkMotor); // Memanggil metode cariMotor untuk mencari objek Motor berdasarkan merk motor

        if (pelanggan != null && motor != null) { // Memeriksa apakah objek pelanggan dan motor tidak null, yang berarti ditemukan dalam daftar
            System.out.print("Lama Sewa (hari): ");
            int lamaSewa = scanner.nextInt(); // Membaca input lama sewa dari pengguna
            double totalBiaya = motor.hitungBiayaSewa(lamaSewa); // Memanggil metode hitungBiayaSewa dari objek motor untuk menghitung total biaya 
                                                                    //sewa berdasarkan lama sewa

            System.out.println("Pelanggan " + pelanggan.getNama() + " telah menyewa motor " +
                    motor.getMerk() + " " + motor.getTipe() + " selama " + lamaSewa + " hari.");
            System.out.println("Total Biaya: " + totalBiaya); // Menampilkan total biaya sewa
            System.out.println("================================================================");
        } else {
            System.out.println("Nama pelanggan atau merk motor tidak ditemukan.");
            System.out.println("=================================================================");
        }
    }

    // Kembalikan Motor
    private static void kembalikanMotor() {
        System.out.println("KEMBALIKAN MOTOR");
        System.out.print("Nama Pelanggan: "); // Membaca input nama pelanggan dari pengguna
        String namaPelanggan = scanner.nextLine();
        System.out.print("Merk Motor yang Dikembalikan: ");
        String merkMotor = scanner.nextLine(); // Membaca input merk motor yang dikembalikan dari pengguna


        Pelanggan pelanggan = cariPelanggan(namaPelanggan); // Memanggil metode cariPelanggan untuk mencari objek Pelanggan berdasarkan nama pelanggan
        Motor motor = (Motor) cariMotor(merkMotor);

        if (pelanggan != null && motor != null) { // Memeriksa apakah objek pelanggan dan motor tidak null, yang berarti ditemukan dalam daftar
            System.out.println("Pelanggan " + pelanggan.getNama() + " telah mengembalikan motor " +
                    motor.getMerk() + " " + motor.getTipe() + "."); // Menampilkan informasi pelanggan dan motor yang dikembalikan
            System.out.println("Terima kasih!");
            System.out.println("===================================================");
        } else {
            System.out.println("Nama pelanggan atau merk motor tidak ditemukan.");
            System.out.println("======================================================");
        }
    }

    // Cari Pelanggan berdasarkan nama
    private static Pelanggan cariPelanggan(String nama) {
        for (Pelanggan pelanggan : daftarPelanggan) { // Menggunakan for-each loop untuk mengulangi setiap elemen dalam daftarPelanggan
            if (pelanggan.getNama().equalsIgnoreCase(nama)) { // Menggunakan metode equalsIgnoreCase untuk memeriksa apakah nilai nama 
                                                                // pelanggan sama dengan parameter nama, tanpa memperhatikan huruf besar atau kecil
                return pelanggan; // Mengembalikan objek pelanggan yang ditemukan
            }
        }
        return null; // Mengembalikan null jika tidak ada objek pelanggan yang cocok dengan parameter nama
    }

    // Cari Motor berdasarkan merk
    private static Kendaraan cariMotor(String merk) {
        for (Kendaraan kendaraan : daftarKendaraan) { // Menggunakan for-each loop untuk mengulangi setiap elemen dalam daftarKendaraan
            if (kendaraan instanceof Motor && kendaraan.getMerk().equalsIgnoreCase(merk)) {
    // Menggunakan operator instanceof untuk memeriksa apakah elemen adalah objek Motor dan menggunakan metode equalsIgnoreCase untuk memeriksa 
    //apakah nilai merk kendaraan sama dengan parameter merk, tanpa memperhatikan huruf besar atau kecil   
                return kendaraan;
            }
        }
        return null;
    }
}