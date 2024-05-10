package PerbaikanUTP;

//kelas CAT8 yang merupakan turunan dari kelas TiketKonser
class CAT8 extends TiketKonser {

    // konstructor dari kelas CAT8
    public CAT8() {
        super(500000);
    }

    // method yang mengembalikkan harga tiket CAT8
    public double HargaTiket() {
        return getHarga();
    }

    // method toString() dioverride dalam kelas CAT8 untuk direpresentasikan sebagai
    // string CAT 8 ketika dicetak
    @Override
    public String toString() {
        return "CAT 8";
    }
}