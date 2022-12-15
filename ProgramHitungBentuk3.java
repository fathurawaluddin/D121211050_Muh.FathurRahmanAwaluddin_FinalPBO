import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ProgramHitungBentuk3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("========================================");
        System.out.println("||  Program Penghitung Bangun Datar   ||");
        System.out.println("========================================");
        System.out.println("|| 1. Persegi                         ||");
        System.out.println("|| 2. Lingkaran                       ||");
        System.out.println("|| 3. Segitiga                        ||");
        System.out.println("|| Tekan Sembarang Angka Untuk Keluar ||");
        System.out.println("========================================");
        System.out.print("Silahkan Ketik Pilihan Anda = ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nilai untuk sisi pertama: ");
                int sisi1 = input.nextInt();
                System.out.print("Masukkan nilai untuk sisi kedua: ");
                int sisi2 = input.nextInt();
                Bentuk myPersegi = new Persegi(sisi1, sisi2);

                try {
                    File myObj = new File ("D:\\Persegi.txt");
                    myObj.createNewFile();
            
                    FileWriter myWriter = new FileWriter("D:\\Persegi.txt", true);
                    myWriter.write(myPersegi.waktu());
                    myWriter.write(myPersegi.keliling());
                    myWriter.write(myPersegi.luas());
                    myWriter.close();

                } catch(IOException e) {
                    e.printStackTrace();
                }

                System.out.println("");
                System.out.print(myPersegi.waktu());
                myPersegi.deskripsi();
                System.out.print(myPersegi.keliling());
                System.out.print(myPersegi.luas());
                break;

             case 2:
                 System.out.print("Masukkan nilai untuk jari-jari: ");
                 int jari2 = input.nextInt();
                 Bentuk myLingkaran = new Lingkaran(jari2);
                 
                 try {
                    File myObj = new File ("D:\\Lingkaran.txt");
                    myObj.createNewFile();
            
                    FileWriter myWriter = new FileWriter("D:\\Lingkaran.txt", true);
                    myWriter.write(myLingkaran.waktu());
                    myWriter.write(myLingkaran.keliling());
                    myWriter.write(myLingkaran.luas());
                    myWriter.close();
                
                } catch(IOException e) {
                    e.printStackTrace();
                }
                
                System.out.println("");
                System.out.print(myLingkaran.waktu());
                myLingkaran.deskripsi();
                System.out.print(myLingkaran.keliling());
                System.out.print(myLingkaran.luas());
                break;

            case 3:
                 System.out.print("Masukkan nilai untuk sisi pertama atau alas: ");
                 int alas = input.nextInt();
                 System.out.print("Masukkan nilai untuk sisi kedua: ");
                 sisi2 = input.nextInt();
                 System.out.print("Masukkan nilai untuk sisi ketiga: ");
                 int sisi3 = input.nextInt();
                 System.out.print("Masukkan nilai untuk tinggi: ");
                 int tinggi = input.nextInt();
                 Bentuk mySegitiga = new Segitiga(alas, sisi2, sisi3, tinggi);

                 try {
                    File myObj = new File ("D:\\Segitiga.txt");
                    myObj.createNewFile();
            
                    FileWriter myWriter = new FileWriter("D:\\Segitiga.txt", true);
                    myWriter.write(mySegitiga.waktu());
                    myWriter.write(mySegitiga.keliling());
                    myWriter.write(mySegitiga.luas());
                    myWriter.close();
                
                } catch(IOException e) {
                    e.printStackTrace();
                }

                System.out.println("");
                System.out.print(mySegitiga.waktu());
                mySegitiga.deskripsi();
                System.out.print(mySegitiga.keliling());
                System.out.print(mySegitiga.luas());
                break;

            default:
                break;
        }
    }
}