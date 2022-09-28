package reCapDemo_Classes;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(4,7);
        int sonuc_2 = dortIslem.Cikar(8,3);
        int sonuc_3 = dortIslem.Carp(4,7);
        int sonuc_4 = dortIslem.Bol(10,1);
        System.out.println(sonuc);
        System.out.println(sonuc_2);
        System.out.println(sonuc_3);
        System.out.println(sonuc_4);
    }
}
