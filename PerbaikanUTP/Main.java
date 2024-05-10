package PerbaikanUTP;

import java.text.SimpleDateFormat; //import kelas untuk mengformat tanggal dan waktu
import java.util.Date; //import  kelas yang merepresentasikan tanggal dan waktu tertentu
import java.util.Scanner; // import kels untuk membaca input dari pengguna

//method utama yang dieksekusi pertama kali saat program dijalanan
public class Main {
    public static void main(String[] args) {
        // membuat objek scn untuk membaca input user
        Scanner scn = new Scanner(System.in);

        // mencetak pesan selamat datang dan meminta user input nama
        System.out.println("Selamat datang di Pemesanan Tiket!");
        System.out.print("Masukkan nama pemesan: ");

        // membaca input user dan menyimpan sebagai namaPemesan
        String namaPemesan = scn.nextLine();

        // menampilkan pilihan jenis tiket kepada user
        System.out.println("Pilih jenis tiket:");
        System.out.println("1. CAT 8");
        System.out.println("2. CAT 1");
        System.out.println("3. FESTIVAL");
        System.out.println("4. VIP");
        System.out.println("5. UNLIMITED EXPERIENCE");
        System.out.print("Masukkan pilihan: ");

        // membaca input pilihan user dan disimpan sebagai pilihan
        int pilihan = scn.nextInt();
        String jenisTiket = "";

        // menggunakan switch untuk menentukan jenis tiket berdasarkan pilihan user
        // jika user memilih 1, maka objek "CAT8" akan dibuat
        // jika user memilih 2, maka objek "CAT1" akan dibuat
        // dan seterusnya hingga case 5 dan case default
        switch (pilihan) {
            case 1:
                jenisTiket = new CAT8().toString();
                break;
            case 2:
                jenisTiket = new CAT1().toString();
                break;
            case 3:
                jenisTiket = new FESTIVAL().toString();
                break;
            case 4:
                jenisTiket = new VIP().toString();
                break;
            case 5:
                jenisTiket = new VVIP().toString();
                break;
            default:
                jenisTiket = "Jenis tiket tidak valid!";
                break;
        }

        // menutup objek scn
        scn.close();

        String kodeBooking = generateKodeBooking(); // memanggil method generateKodeBooking()
        String tanggalPesan = getCurrentDate(); // memanggil method getCurrentDate()
        double totalHarga = hitungHargaTiket(pilihan); // memanggil method hitungHargaTiket(pilihan)

        // membuat objek PemesanTiket dengan constructor dari kelas tersebut
        PemesananTiket pesanan = new PemesananTiket(namaPemesan, kodeBooking, tanggalPesan, jenisTiket, totalHarga);

        // tampilan output hasil pemesanan
        System.out.println("\n----- Detail Pemesanan -----");
        System.out.println("Nama Pemesan: " + pesanan.getNamaPemesan());
        System.out.println("Kode Booking: " + pesanan.getKodeBooking());
        System.out.println("Tanggal Pesanan: " + pesanan.getTanggalPesan());
        System.out.println("Tiket yang dipesan: " + pesanan.getJenisTiket());
        System.out.printf("Total harga: %.1E USD%n", pesanan.getTotalHarga());
    }

    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }

    // method hitungHargaTiket(pilihan) untuk menghitung harga tiket berdasarkan
    // pilihan user
    public static double hitungHargaTiket(int pilihan) {
        switch (pilihan) {
            case 1:
                return new CAT8().getHarga();
            case 2:
                return new CAT1().getHarga();
            case 3:
                return new FESTIVAL().getHarga();
            case 4:
                return new VIP().getHarga();
            case 5:
                return new VVIP().getHarga();
            default:
                return 0.0;
        }
    }
}
