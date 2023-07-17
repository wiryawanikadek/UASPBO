import java.util.ArrayList;
import java.util.Scanner;

// Abstract class Kendaraan
abstract class Kendaraan {
    private String merk;
    private String tipe;

    public Kendaraan(String merk, String tipe) {
        this.merk = merk;
        this.tipe = tipe;
    }

    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public abstract double hitungBiayaSewa(int lamaSewa);
}
