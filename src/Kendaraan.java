import java.util.ArrayList;
import java.util.Scanner;


// Abstract class Kendaraan
abstract class Kendaraan {
    private String merk; // Variabel instans untuk menyimpan merk kendaraan
    private String tipe;

    public Kendaraan(String merk, String tipe) { // Constructor dengan parameter merk dan tipe
        this.merk = merk; // Menginisialisasi nilai variabel merk dengan parameter merk
        this.tipe = tipe; // Menginisialisasi nilai variabel tipe dengan parameter tipe
    }


    public String getMerk() { // Metode getter untuk mengembalikan nilai variabel merk
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public abstract double hitungBiayaSewa(int lamaSewa);// Metode abstract untuk menghitung biaya sewa kendaraan berdasarkan lama sewa
}
