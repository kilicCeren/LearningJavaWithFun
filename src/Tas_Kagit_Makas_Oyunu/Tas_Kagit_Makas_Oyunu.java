package Tas_Kagit_Makas_Oyunu;

import java.util.Random;
import java.util.Scanner;

public class Tas_Kagit_Makas_Oyunu {
    public static void main(String[] args) {

     /*
    Bilgisayar ile "tas kagit makas oyunu" oynayiniz.
    Kullanici secimini; Tas icin 1, Kagit icin 2, Makas icin 3 yazarak belirtir.
    Kullanici tahminini yazar, sonra bilgisayarin tahminine göre o elin kazanani belli olur.
    5 kez kazandiktan sonra, asagidaki kurallara göre en fazla kazanan, oyunun galibi olur.

    Kâğıt taşı sarar
    Taş makası kırar
    Makas kağıdı keser
     */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Taş Kağıt Makas Oyunumuza Hoş geldiniz!!! ");


        int tas = 1;
        int kagıt = 2;
        int makas = 3;

        int kullaniciSkor = 0;
        int bilgisayarSkor = 0;

        int kullaniciSecimi = 0;
        int bilgisayarinSecimi = 0;

        do {
            System.out.println("\n  Tas icin 1, Kagit icin 2, Makas icin 3 yazınız. ");

            kullaniciSecimi = scanner.nextInt();
            bilgisayarinSecimi = random.nextInt(3) + 1;

            if (kullaniciSecimi == 1) {

                if (bilgisayarinSecimi == 1) {
                    System.out.println("Berabere Kaldiniz...");
                    System.out.println("Kullanici skoru: " + kullaniciSkor + " " + " Bilgisayarin skoru: " + bilgisayarSkor);
                } else if (bilgisayarinSecimi == 2) {
                    System.out.println("Kağıt taşı sarar.Bilgisayar Kazandi...");
                    bilgisayarSkor++;
                    System.out.println("Kullanici skoru: " + kullaniciSkor + " " + " Bilgisayarin skoru: " + bilgisayarSkor);
                } else {
                    System.out.println("Taş makası ezer.Kazandiniz Tebrikler...");
                    kullaniciSkor++;
                    System.out.println("Kullanici skoru: " + kullaniciSkor + " " + " Bilgisayarin skoru: " + bilgisayarSkor);
                }
            } else if (kullaniciSecimi == 2) {
                if (bilgisayarinSecimi == 1) {
                    System.out.println("Kağıt taşı sarar.Kazandiniz Tebrikler...");
                    kullaniciSkor++;
                    System.out.println("Kullanici skoru: " + kullaniciSkor + " " + " Bilgisayarin skoru: " + bilgisayarSkor);
                } else if (bilgisayarinSecimi == 2) {
                    System.out.println("Berabere Kaldiniz...");
                    System.out.println("Kullanici skoru: " + kullaniciSkor + " " + " Bilgisayarin skoru: " + bilgisayarSkor);

                } else {
                    System.out.println("Makas kağıdı keser.Bilgisayar Kazandi...");
                    bilgisayarSkor++;
                    System.out.println("Kullanici skoru: " + kullaniciSkor + " " + " Bilgisayarin skoru: " + bilgisayarSkor);
                }
            } else if (kullaniciSecimi == 3) {
                if (bilgisayarinSecimi == 1) {
                    System.out.println("Taş makası ezer. Bilgisayar Kazandi...");
                    bilgisayarSkor++;
                    System.out.println("Kullanici skoru: " + kullaniciSkor + " " + " Bilgisayarin skoru: " + bilgisayarSkor);
                } else if (bilgisayarinSecimi == 2) {
                    System.out.println("Makas kağıdı keser.Kazandiniz Tebrikler...");
                    kullaniciSkor++;
                    System.out.println("Kullanici skoru: " + kullaniciSkor + " " + " Bilgisayarin skoru: " + bilgisayarSkor);
                } else {
                    System.out.println("Berabere Kaldiniz...");
                    System.out.println("Kullanici skoru: " + kullaniciSkor + " " + " Bilgisayarin skoru: " + bilgisayarSkor);
                }
            }

            if (kullaniciSecimi != 1 & kullaniciSecimi != 2 & kullaniciSecimi != 3) {
                System.out.println("Hatali bir giris yaptiniz, lutfen tekrar deneyiniz.");
            }

        } while (kullaniciSkor != 5 & bilgisayarSkor != 5);

        if (kullaniciSkor > bilgisayarSkor) {
            System.out.println(" Tebrikler....Siz kazandiniz! Bugün sansli gününüzdesiniz :)");
        } else {
            System.out.println("Malesef kaybettiniz....Bilgisayar sizi yendiiii!!!");
        }
    }
}
