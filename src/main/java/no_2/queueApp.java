package no_2;
public class queueApp {
    public static void main(String[] args) {
        mainqueue antrian = new mainqueue(10);
        antrian.enqueue(2);
        antrian.tampil();
        System.out.println();
        antrian.enqueue(8);
        antrian.tampil();
        System.out.println();
        System.out.println("yang diambil dari antrian = "+antrian.dequeue());
        System.out.println();
        System.out.println("Nama saya adalah Fadhil Ahmad Hidayat");
        System.out.println();
        System.out.println(antrian.peek());
        System.out.println();
        System.out.println();
        antrian.enqueue(7);
        antrian.tampil();
        System.out.println();
        antrian.enqueue(6);
        antrian.tampil();
        System.out.println();
        System.out.println("Nilai yang paling depan = "+antrian.peek());
    } 
}