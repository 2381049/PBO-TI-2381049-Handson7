package membuatobjekpertama;

public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;

    //Construktor adalah method yang pertama kali dipanggil pada saat pembuatan objek
    public Mobil(String warna, String merek, int kecepatanMaks) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo() {
        System.out.println("Mobil Merek: " + merek);
        System.out.printf("Warna: " + warna);
        System.out.println("Kecepatan Maks: " + kecepatanMaks);
    }

    public void berjalan() {
        System.out.println("Mobil " + merek + "sedang berjalan");
    }

    public void berhenti() {
        System.out.println("Mobil " + merek + "sedang berjalan");
    }
}
