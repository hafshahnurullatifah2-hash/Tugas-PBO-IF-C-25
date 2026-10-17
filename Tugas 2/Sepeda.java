package Pertemuan4;

import java.util.Scanner;

public class Sepeda {     
    String merek;
    String merekbaru;
    int jrktempuh;

    public Sepeda(String merek) {
        this.merek = merek;
        this.jrktempuh = 0; // jarak awal
    }

    public void mereksepeda() {
        System.out.println("Objek " + merek + " dibuat, jarak tempuh awal " + jrktempuh + " km");
    }

    public void gerakmaju() {
        jrktempuh += 10;
        System.out.println("Bergerak maju 10 km");
        System.out.println("Objek sepeda " + merek + ", jarak tempuh " + jrktempuh + " km");
    }

    public void gerakmundur() {
        jrktempuh -= 5;
        System.out.println("Bergerak mundur 5 km");
        System.out.println("Objek sepeda " + merek + ", jarak tempuh " + jrktempuh + " km");
    }

    public void berhenti() {
        System.out.println("Sepeda Berhenti");
        System.out.println("Objek sepeda " + merek + ", jarak tempuh akhir " + jrktempuh + " km");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Objek Sepeda : ");
        String merekinput = scanner.nextLine();

        // Pemanggilan constructor yang sudah benar
        Sepeda sepeda = new Sepeda(merekinput);
        sepeda.mereksepeda(); //untuk menampilkan info awal sepeda

        int pil;
        do {
            System.out.println("\nMenu: ");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan : ");
            pil = scanner.nextInt();

            switch (pil) {
                case 1:
                    sepeda.gerakmaju();
                    break;
                case 2:
                    sepeda.gerakmundur();
                    break;
                case 3:
                    sepeda.berhenti();
                    break;
                case 0:
                    System.out.println("Keluar Program..");
                    System.out.println("Terimakasih sudah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi");
            }
        } while (pil != 0);

        scanner.close();
    }
}

