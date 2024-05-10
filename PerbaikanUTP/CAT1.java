package PerbaikanUTP;

//kelas CAT1 yang merupakan turunan dari kelas TiketKonser
class CAT1 extends TiketKonser {

    // konstructor dari kelas CAT1
    public CAT1() {
        super(1000000);
    }

    // method yang mengembalikkan harga tiket CAT1
    public double HargaTiket() {
        return getHarga();
    }

    // method toString() dioverride dalam kelas CAT1 untuk direpresentasikan sebagai
    // string CAT 1 ketika dicetak
    @Override
    public String toString() {
        return "CAT 1";
    }
}