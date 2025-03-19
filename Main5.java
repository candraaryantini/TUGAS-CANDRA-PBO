class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    void info() {
        System.out.println("Nama: " + nama);
    }
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama); // Memanggil konstruktor superclass
    }

    void suara() {
        System.out.println(nama + " mengeong: Meow! Meow!");
    }
}

public class Main5 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucingSaya = new Kucing("Coki");

        // Memanggil method yang dimiliki oleh objek Kucing
        kucingSaya.info(); // Dari superclass Hewan
        kucingSaya.suara(); // Method khusus Kucing
    }
}