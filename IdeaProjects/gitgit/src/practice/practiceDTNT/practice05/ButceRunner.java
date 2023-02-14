package practice.practiceDTNT.practice05;

public class ButceRunner {
    public static void main(String[] args) {
        Butce baba=new Butce();
        System.out.println("maas oncesi butce="+Butce.butce);
    baba.maasAl(3000);
        System.out.println("maas sonrasi butce="+Butce.butce);
        baba.harclikAl(100);
    baba.harclikHarca(20);
    baba.butcedenHarca(500);
        System.out.println(baba.harclik);
        System.out.println(Butce.butce);

    Butce anne=new Butce();
    anne.maasAl(5000);
    anne.harclikAl(500);
    anne.harclikHarca(450);
        System.out.println(Butce.butce);
        System.out.println(anne.harclik);

    Butce cocuk=new Butce();
    cocuk.harclikAl(100);
    cocuk.harclikHarca(30);
        System.out.println(Butce.butce);
        System.out.println(cocuk.harclik);









    }


}
