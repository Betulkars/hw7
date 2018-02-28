package odev4;// BETÜL KARS/21520786/ÖDEV4


import java.util.Scanner;
public class THYReazervasyonSistemi extends UcakRezervasyonSistemi {
    public THYReazervasyonSistemi() {
        super();
    }

    public THYReazervasyonSistemi(int koltukSayisi) {
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
                if(businessDoluMu()){
                     System.out.println("Maalesef business koltuklarımız dolu.Rezervasyon alamıyoruz.");
                     break;
                }
                else {
                    System.out.println("Aşağıdaki boş koltuklardan birini seçiniz.");
                    for (int i = 0; i < 5; i++) {
                        if (!koltuklar[i] ) {
                            System.out.print((i + 1) + " ");
                        }
                    }

                    koltukSec = input.nextInt();
                    if (koltukSec < 0 || koltukSec > 5) {
                        System.out.println("Yanlış koltuk numarası girdiniz.Lütfen tekrar deneyiniz.");
                    } else {
                        koltuklar[koltukSec - 1] = true;
                        System.out.println("Koltuk no:"+koltukSec+" "+"adınıza rezerve edildi.");
                        System.out.println("İyi uçuşlar!");
                        break;
                    }
                }

            } else {//eğer kullanıcı 1 girdiyse;
                if(ucakDoluMu()){//Eğer dizimim tüm elemanları true ise ucak dolu olacak ve ekrana uyarı yazdıracak
                    System.out.println("Maalesef uçak dolu.Rezervasyon alamıyoruz.");
                    break;
                }
                if(ekonomiDoluMu()){//Eğer dizimin ilk 5 elemanından sonrası true ise
                    System.out.println("Maalesef ekonomi koltuklarımız dolu.Rezervasyon alamıyoruz."); //Ekrana uyarı mesajı yazdırdım.
                    break;
                }else{//Eğer dizimin ilk 5 elemanından sonrası true değil ise ,
                    System.out.println("Aşağıdaki boş koltuklardan birini seçiniz.");
                    for (int i = 5; i < koltukSayisi; i++) {//dizimin ilk 5 elemandan sonrasını taradım.
                        if (!koltuklar[i]) {// elemanlarım false ise indislerimin 1 fazlasını ekrana yazdırdım.
                            System.out.print((i + 1) + " ");
                        }
                    }
                    koltukSec = input.nextInt();
                    if(koltukSec<5 || koltukSec>koltukSayisi){//Eğer koltuk sayısı 5 ten küçük ve  koltukSayisinden fazla ise
                        System.out.println("Yanlış koltuk numarası girdiniz.Lütfen tekrar deneyiniz.");//ekrana uyarı mesajı yazdırdım
                    }
                    else {////Eğer koltuk sayısı 5 ten küçük ve  koltukSayisinden fazla değil ise
                        koltuklar[koltukSec-1]=true;//seçilen koltuk değerinin 1 eksiği dizimdeki indisi verdiği için o indisi true yaptım.
                        System.out.println("Koltuk no:"+koltukSec+" "+"adınıza rezerve edildi.");//Ekrana seçilen koltuk bilgisini yazdırdım.
                        System.out.println("İyi uçuşlar!");
                        break;
                    }


                }


            }



        }
    }
}
