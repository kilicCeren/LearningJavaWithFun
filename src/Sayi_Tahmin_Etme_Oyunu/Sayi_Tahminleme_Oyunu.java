package Sayi_Tahmin_Etme_Oyunu;

import java.util.Random;
import java.util.Scanner;

public class Sayi_Tahminleme_Oyunu {
    public static void main(String[] args) {
        /*
        1-100 arasında rastgele bir sayı üreten ve kullanıcıdan sayıyı tahmn etmesini
        Tahmini doğru bilirse de 5.tahminde doğru bildiniz
        Tahmini yanlış ise bilemediniz tekrar deneyiniz
        */

        sayiTahminEt();
    }
    public static void sayiTahminEt(){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Sayi Tahminleme oyunumuza Hoşgeldniz...");
        int rastgeleSayi = random.nextInt(100) + 1;

        int sayiTahmini = 0;

        int sayac=0;


        do {
            System.out.println("Lütfen 1-100 arasinda bir sayi giriniz");
            sayiTahmini = scanner.nextInt();

            sayac++;

            if((sayiTahmini<0) && (sayiTahmini>100)){
                System.out.println("Yazdiginiz sayi 1-100 arasinda degil");
            }else if(sayiTahmini == rastgeleSayi) {
                System.out.println("Tebrikler! " + sayac + ". tahmininiz doğru! ("+ "Evet aradiginiz sayi: " + sayiTahmini + " )");
            } else if ((rastgeleSayi-5)<sayiTahmini && sayiTahmini<(rastgeleSayi+5)) {
                System.out.println("Çok yaklaştınız, iyi denemeydiii");
            } else {
                System.out.println("Bu hiç yakın bir tahmin değil,lütfen tekrar deneyiniz...");
            }

        } while (sayiTahmini != rastgeleSayi);

    }
}
