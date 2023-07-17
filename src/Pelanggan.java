// Class Pelanggan
class Pelanggan {
    private String nama;
    private String alamat;
    private String noTelepon;

    public Pelanggan(String nama, String alamat, String noTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }
}
