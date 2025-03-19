abstract class Kendaraan {
    protected String nama;
    protected int jumlahRoda;

    public Kendaraan(String nama, int jumlahRoda) {
        this.nama = nama;
        this.jumlahRoda = jumlahRoda;
    }

    // Abstract method bergerak
    public abstract void bergerak();

    // Method untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println(nama + " memiliki " + jumlahRoda + " roda.");
    }
}

// Subclass Mobil
class Mobil extends Kendaraan {
    public Mobil(String nama, int jumlahRoda) {
        super(nama, jumlahRoda);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Subclass SepedaMotor
class SepedaMotor extends Kendaraan {
    public SepedaMotor(String nama, int jumlahRoda) {
        super(nama, jumlahRoda);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Interface KendaraanListrik
interface KendaraanListrik {
    void isiDaya();
}

// Subclass MobilListrik
class MobilListrik extends Mobil implements KendaraanListrik {
    public MobilListrik(String nama, int jumlahRoda) {
        super(nama, jumlahRoda);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan motor listrik.");
    }

    @Override
    public void isiDaya() {
        System.out.println(nama + " sedang diisi daya.");
    }
}

// Main class untuk menjalankan program
public class Latihan1 {
    public static void main(String[] args) {
        // Output abstract class
        Kendaraan toyota = new Mobil("Toyota", 4);
        toyota.tampilkanInfo();
        toyota.bergerak();

        Kendaraan honda = new SepedaMotor("Honda", 2);
        honda.tampilkanInfo();
        honda.bergerak();

        // Output aplikasi dengan interface
        MobilListrik tesla = new MobilListrik("Tesla Model 3", 4);
        tesla.tampilkanInfo();
        tesla.bergerak();
        tesla.isiDaya();
    }
}