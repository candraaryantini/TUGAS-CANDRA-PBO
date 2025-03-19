// Kelas induk (superclass)
class Hewan {
    void makan() { 
        System.out.println("Hewan sedang makan."); 
    }
}

// Kelas anak (subclass) yang mewarisi dari Hewan
class Kucing extends Hewan {
    void suara() { 
        System.out.println("Meow!"); 
    }
}

// Kelas cucu (subclass) yang mewarisi dari Kucing
class KucingAnggora extends Kucing {
    void jenis() { 
        System.out.println("Ini adalah kucing anggora."); 
    }
}

// Kelas utama untuk menjalankan program
public class Main2 {
    public static void main(String[] args) {
        // Membuat objek dari kelas KucingAnggora
        KucingAnggora anggora = new KucingAnggora();

        // Memanggil metode dari berbagai level pewarisan
        anggora.makan();  // Dari kelas Hewan
        anggora.suara();  // Dari kelas Kucing
        anggora.jenis();  // Dari kelas KucingAnggora
    }
}