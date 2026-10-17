package P3;

public class Main {
    public static void main(String[] args) {
        //instatiation: Namakelas Namaobjek = New Constructor
        
        Lingkaran L1 = new Lingkaran();
        System.out.println("Object L1 dibuat!");
        L1.jari = 7;
        System.out.println("Jari Object L1 = " + L1.jari);
        System.out.println("Luas Object L1 = " + L1.luas);
        System.out.println("Phi Object L1 = " + L1.phi);
        
        //tambah objek 
        Lingkaran L2 = new Lingkaran();
        System.out.println("\nObject L2 dibuat!");
        System.out.println("Jari Object L1 = " + L2.jari);
        System.out.println("Luas Object L1 = " + L2.luas);
        System.out.println("Phi Object L1 = " + L2.phi);
        
    }      
}

class Lingkaran{
    //atribut 
    double jari;
    double luas;
    final double phi = 3.14;
    
    double hitungluas(){
        luas = phi*jari*jari;
        return luas;
    }   
}