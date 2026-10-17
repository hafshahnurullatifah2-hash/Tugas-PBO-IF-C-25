package tugasp2;

import java.util.Scanner;

public class tugasp2_3 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     float jari, keliling, luas;
     final float PI = 3.14f;
     
     System.out.println("Masukkan Jari-Jari :");
     jari = input.nextFloat();
     
     luas = PI * jari * jari;
     keliling = 2 * PI * jari;
     
     System.out.println("Luas =" + luas);
     System.out.println("Keliling =" + keliling);
    }
}
