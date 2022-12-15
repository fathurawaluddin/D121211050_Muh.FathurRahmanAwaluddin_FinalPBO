import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Persegi implements Bentuk {
    
    private int sisi1;
    private int sisi2;

    public Persegi(int sisi1,int sisi2){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }
    public void deskripsi(){
        System.out.println("Bentuk: Persegi");
        System.out.println("Panjang Sisi Pertama: " + sisi1);
        System.out.println("Panjang Sisi Kedua: " + sisi2);
    }
    public String waktu() {
        LocalDateTime detailWaktu = LocalDateTime.now();
        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String waktuTerformat = detailWaktu.format(formatWaktu);
        return "Waktu Penginputan: " + waktuTerformat + "\n";
    }
    public String keliling() {
        int keliling = 2 * (sisi1 + sisi2);
        return "Kelilingnya adalah: " + keliling + "\n";
    }
    public String luas() {
        int luas = sisi1 * sisi2;
        return "Luasnya adalah: " + luas+ "\n\n";
    }

}
