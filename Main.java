
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
        super(nama);
    }

    void suara() {
        System.out.println(nama + " mengeong: Meow Meow!");
    }
}

class Anjing extends Hewan {
    Anjing(String nama) {
        super(nama);
    }

    void suara() {
        System.out.println(nama + " menggonggong: Guguk Guguk!");
    }
}
public class Main {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucingSaya = new Kucing("Coki");
        kucingSaya.info();
        kucingSaya.suara();

        System.out.println(); // Pemisah output

        // Membuat objek Anjing
        Anjing anjingSaya = new Anjing("Ciko");
        anjingSaya.info();
        anjingSaya.suara();
    }
}