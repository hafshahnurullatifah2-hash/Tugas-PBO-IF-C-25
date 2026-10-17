package Quiz;

import java.util.Scanner;

public class Quiz1 {
  // Method untuk menghitung nilai akhir
    static double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (30.0 / 100 * tugas) +
               (30.0 / 100 * uts) +
               (40.0 / 100 * uas);
    }
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.println("=================================================");
        System.out.println("       SISTEM PENGOLAHAN NILAI MAHASISWA");
        System.out.println("=================================================");

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine();

        // Array untuk menyimpan data mahasiswa
        String[] npm = new String[jumlah];
        String[] nama = new String[jumlah];
        double[] tugas = new double[jumlah];
        double[] uts = new double[jumlah];
        double[] uas = new double[jumlah];
        double[] akhir = new double[jumlah];
        char[] huruf = new char[jumlah];
        String[] status = new String[jumlah];

        // Variabel untuk statistik
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        double nilaiTertinggi = 0;
        double nilaiTerendah = 100;
        double totalNilai = 0;

        // INPUT DATA MAHASISWA

        for (int i = 0; i < jumlah; i++) {

            System.out.println();
            System.out.println("Data Mahasiswa Ke-" + (i + 1));
            System.out.println("--------------------------------------------------------------");

            System.out.print("NPM : ");
            npm[i] = input.nextLine();

            System.out.print("Nama : ");
            nama[i] = input.nextLine();

            // Input nilai Tugas
            while (true) {
                System.out.print("Nilai Tugas : ");
                tugas[i] = input.nextDouble();

                if (tugas[i] >= 0 && tugas[i] <= 100) {
                    break;
                } else {
                    System.out.println(
                        "Nilai tidak valid! Masukkan nilai 0 - 100."
                    );
                }
            }

            // Input nilai UTS
            while (true) {
                System.out.print("Nilai UTS : ");
                uts[i] = input.nextDouble();

                if (uts[i] >= 0 && uts[i] <= 100) {
                    break;
                } else {
                    System.out.println(
                        "Nilai tidak valid! Masukkan nilai 0 - 100."
                    );
                }
            }

            // Input nilai UAS
            while (true) {
                System.out.print("Nilai UAS : ");
                uas[i] = input.nextDouble();

                if (uas[i] >= 0 && uas[i] <= 100) {
                    break;
                } else {
                    System.out.println(
                        "Nilai tidak valid! Masukkan nilai 0 - 100."
                    );
                }
            }
            
            input.nextLine();
            
            // Menghitung nilai akhir menggunakan method
            akhir[i] = hitungNilaiAkhir(
                tugas[i],
                uts[i],
                uas[i]
            );

            // Menentukan nilai huruf
            if (akhir[i] >= 80) {
                huruf[i] = 'A';
            } else if (akhir[i] >= 70) {
                huruf[i] = 'B';
            } else if (akhir[i] >= 60) {
                huruf[i] = 'C';
            } else if (akhir[i] >= 50) {
                huruf[i] = 'D';
            } else {
                huruf[i] = 'E';
            }

            // Menentukan status kelulusan
            if (huruf[i] == 'A' ||
                huruf[i] == 'B' ||
                huruf[i] == 'C') {

                status[i] = "LULUS";
                jumlahLulus++;

            } else {
                status[i] = "TIDAK LULUS";
                jumlahTidakLulus++;
            }

            // Menghitung total nilai
            totalNilai = totalNilai + akhir[i];

            // Mencari nilai tertinggi
            if (akhir[i] > nilaiTertinggi) {
                nilaiTertinggi = akhir[i];
            }

            // Mencari nilai terendah
            if (akhir[i] < nilaiTerendah) {
                nilaiTerendah = akhir[i];
            }
        }

        // Menghitung rata-rata
        double rataRata = totalNilai / jumlah;

 
        // OUTPUT DATA MAHASISWA

        System.out.println();
        System.out.println("=================================================");
        System.out.println("             DAFTAR NILAI MAHASISWA");
        System.out.println("=================================================");

        System.out.printf(
            "%-3s %-12s %-15s %-7s %-7s %-7s %-8s %-7s %-12s%n",
            "No",
            "NPM",
            "Nama",
            "Tugas",
            "UTS",
            "UAS",
            "Akhir",
            "Huruf",
            "Status"
        );

        System.out.println(
            "--------------------------------------------------------------"
        );

        for (int i = 0; i < jumlah; i++) {

            System.out.printf(
                "%-3d %-12s %-15s %-7.0f %-7.0f %-7.0f %-8.1f %-7c %-12s%n",
                (i + 1),
                npm[i],
                nama[i],
                tugas[i],
                uts[i],
                uas[i],
                akhir[i],
                huruf[i],
                status[i]
            );
        }

        System.out.println("=================================================");

        // STATISTIK NILAI


        System.out.println();
        System.out.println("                STATISTIK NILAI");
        System.out.println(
            "--------------------------------------------------------------"
        );

        System.out.println("Jumlah Mahasiswa : " + jumlah);
        System.out.println(
            "Jumlah Mahasiswa Lulus : " + jumlahLulus
        );
        System.out.println(
            "Jumlah Tidak Lulus : " + jumlahTidakLulus
        );

        System.out.printf(
            "Nilai Tertinggi : %.1f%n",
            nilaiTertinggi
        );

        System.out.printf(
            "Nilai Terendah : %.1f%n",
            nilaiTerendah
        );

        System.out.printf(
            "Rata-rata Kelas : %.2f%n",
            rataRata
        );

        System.out.println("=================================================");

        input.close();
    }
}
