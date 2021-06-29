package no_1;
public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(2);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(2);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println(" ");
        long nilai = tumpukan.peek();
        System.out.println("nilai teratas = " + nilai);
        System.out.println("nama saya adalah Fadhil Ahmad Hidayat");
        tumpukan.pop();
        System.out.println("nilai yang dihapus = " + nilai);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
    }
}