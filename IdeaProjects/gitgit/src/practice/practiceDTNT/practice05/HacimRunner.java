package practice.practiceDTNT.practice05;

public class HacimRunner {
    public static void main(String[] args) {
        Hacim hacim=new Hacim();
        int karePrizma= hacim.hacimHesapla(5,6);
        int dikdortgenPrizma= hacim.hacimHesapla(5,6,7);
        int kup= hacim.hacimHesapla(5);
        System.out.println("karePrizma="+karePrizma);
        System.out.println("dikdortgenPrizma="+dikdortgenPrizma);
        System.out.println("kup="+kup);







    }
}
