// Superclass
class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

// Subclass Kucing
class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow!");
    }
}

// Subclass Anjing
class Anjing extends Hewan {
    void suara() {
        System.out.println("Guk Guk!");
    }
}

// Program Utama
public class Main3 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing();
        kucing.makan();  // Memanggil metode dari superclass
        kucing.suara();  // Memanggil metode dari subclass

        // Membuat objek Anjing
        Anjing anjing = new Anjing();
        anjing.makan();  // Memanggil metode dari superclass
        anjing.suara();  // Memanggil metode dari subclass
    }
}