// Class Pelanggan
class Pelanggan {
    private String nama; // Variabel instans untuk menyimpan nama pelanggan
    private String alamat;
    private String noTelepon;

    public Pelanggan(String nama, String alamat, String noTelepon) { // Constructor dengan parameter nama, alamat, dan noTelepon
        this.nama = nama; // Menginisialisasi nilai variabel nama dengan parameter nama
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    public String getNama() { // Metode getter untuk mengembalikan nilai variabel nama
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }
}
