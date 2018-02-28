package odev4;

import java.util.Scanner;
public class PegasusRezervasyonSistemi extends UcakRezervasyonSistemi {
    public PegasusRezervasyonSistemi() {
        super();
    }

    public PegasusRezervasyonSistemi(int koltukSayisi) {
        super(koltukSayisi);
    }

    public void rezervasyonAl() {
        Scanner input = new Scanner(System.in);
        int tercih;
        int koltukNo;
        int koltukSec;
        System.out.println("THY Rezervasyon Sistemi'ne hoş geldiniz!");
        System.out.println("Business class uçmak için 0'a basınız. Ekonomi class uçmak için 1'e basınız:");
        tercih = input.nextInt();

        while (true) {
            if (tercih == 0) {
                if(ucakDoluMu()){
                    System.out.println("Maalesef uçak dolu.Rezervasyon alamıyoruz.");
                    break;
                }
                if (businessDoluMu()) {
                    System.out.println("Maalesef business koltuklarımız dolu.Rezervasyon alamıyoruz.");
                    break;
                } else {
                    System.out.println("Aşağıdaki boş koltuklardan birini seçiniz.");
                    for (int i = 0; i < 5; i++) {
                        if (!koltuklar[i]) {
                            System.out.print((i + 1) + " ");
                        }

                    }
                    koltukSec = input.nextInt();
                    if (koltukSec < 0 || koltukSec > 5) {
                        System.out.println("Yanlış koltuk numarası girdiniz.Lütfen tekrar deneyiniz.");
                    } else {
                        koltuklar[koltukSec - 1] = true;
                        System.out.println("Koltuk no:" + koltukSec + " " + "adınıza rezerve edildi.");
                        System.out.println("İyi uçuşlar!");
                        break;
                    }

                }
            }else{
                if(ucakDoluMu()){
                    System.out.println("Maalesef uçak dolu.Rezervasyon alamıyoruz.");
                    break;
                }
                if(ekonomiDoluMu()){
                    System.out.println("Maalesef ekonomi sınıfı dolu.Rezervasyon alamıyoruz.");
                    break;
                }else{
                    koltukSec = (6+((int)(Math.random()*(koltukSayisi-5))));
                   if( (!koltuklar[koltukSec-1])){
                        koltuklar[koltukSec-1]=true;
                        System.out.println("Koltuk no:" + koltukSec + " " + "adınıza rezerve edildi.");
                        System.out.println("İyi uçuşlar!");
                        break;
                    }


                }

            }
        }

    }
}
