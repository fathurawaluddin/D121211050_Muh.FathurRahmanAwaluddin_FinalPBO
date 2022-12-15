import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Segitiga implements Bentuk {
    
    private int alas;
    private int sisi2;
    private int sisi3;
    private int tinggi;

    public Segitiga(int alas,int sisi2, int sisi3, int tinggi){
        this.alas = alas;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.tinggi = tinggi;
    }

    public void deskripsi(){ 
        System.out.println("Bentuk: Segitiga");
        System.out.println("Panjang Sisi Pertama / Alas: " + alas);
        System.out.println("Panjang Sisi Kedua: " + sisi2);
        System.out.println("Panjang Sisi Ketiga: " + sisi3);
        System.out.println("Tinggi: " + tinggi);
    }
    public String waktu() {
        LocalDateTime detailWaktu = LocalDateTime.now();
        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String waktuTerformat = detailWaktu.format(formatWaktu);
        return "Waktu Penginputan: " + waktuTerformat + "\n"; 
    }
    public String keliling() {
        int keliling = alas + sisi2 + sisi3;
        return "Kelilingnya adalah: " + keliling + "\n";
    }
    public String luas() {
        int luas = (alas * tinggi) / 2;
        return "Luasnya adalah: " + luas + "\n\n";
    }

}