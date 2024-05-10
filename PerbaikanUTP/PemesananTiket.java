package PerbaikanUTP;

//kelas PemesananTiket
class PemesananTiket {
    // atribut2 yang menyimpan informasi lengkap pemesanan tiket
    private String namaPemesan;
    private String kodeBooking;
    private String tanggalPesan;
    private String jenisTiket;
    private double totalHarga;

    // Constructor PemesananTiket
    public PemesananTiket(String namaPemesan, String kodeBooking, String tanggalPesan, String jenisTiket,
            double totalHarga) {
        this.namaPemesan = namaPemesan;
        this.kodeBooking = kodeBooking;
        this.tanggalPesan = tanggalPesan;
        this.jenisTiket = jenisTiket;
        this.totalHarga = totalHarga;
    }

    // Getter methods
    public String getNamaPemesan() {
        return namaPemesan;
    }

    public String getKodeBooking() {
        return kodeBooking;
    }

    public String getTanggalPesan() {
        return tanggalPesan;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public double getTotalHarga() {
        return totalHarga;
    }
}