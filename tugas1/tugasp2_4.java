package tugasp2;

import java.util.Scanner;

public class tugasp2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam, menit, detik, totdet;
        
        System.out.println("Masukkan jam :");
        jam = input.nextInt();
        
        System.out.println("Masukkan menit :");
        menit = input.nextInt();
        
        System.out.println("Masukkan detik :");
        detik = input.nextInt();
        
        totdet = jam*3600+menit*60+detik;
        
        System.out.println("totdet = " + totdet);
    }
            
}
