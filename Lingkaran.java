import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Lingkaran implements Bentuk {
    
    private int jari2;
    private final double PI = 3.14;

    public Lingkaran(int jari2){
        this.jari2 = jari2;
    }
    public void deskripsi(){ 
        System.out.println("Bentuk: Lingkaran");
        System.out.println("Panjang Jari-jari: " + jari2);
    }
    public String waktu() {
        LocalDateTime detailWaktu = LocalDateTime.now();
        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String waktuTerformat = detailWaktu.format(formatWaktu);
        return "Waktu Penginputan: " + waktuTerformat + "\n"; 
    }
    public String keliling() {
        double keliling = 2 * PI * jari2;
        return "Kelilingnya adalah: " + keliling + "\n";
    }
    public String luas() {
        double luas = PI * jari2 * jari2;
        return "Luasnya adalah: " + luas + "\n\n";
    }

}