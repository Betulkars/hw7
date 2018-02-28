package odev4;

public abstract   class UcakRezervasyonSistemi {
    protected int koltukSayisi=10;
    protected boolean [] koltuklar;

    public UcakRezervasyonSistemi(){
        setKoltukSayisi(koltukSayisi);

    }
    public UcakRezervasyonSistemi(int koltukSayisi){
        setKoltukSayisi(koltukSayisi);
        this.koltuklar = new boolean[this.koltukSayisi];
    }
    public void setKoltukSayisi(int koltukSayisi){
        if(koltukSayisi<10){
            System.out.println("Koltuk sayısı hatalı.Otomatik olarak 10 yapıldı.");
            koltukSayisi = 10;
        }else{
            this.koltukSayisi = koltukSayisi;
        }
    }
    public int getKoltukSayisi(){

        return koltukSayisi;
    }
    public boolean ekonomiDoluMu(){
        for(int i=5; i<koltukSayisi;i++) {
           if (!(koltuklar[i])) {
               return false;
           }
       }
       return true;
    }
    public boolean businessDoluMu(){
        for(int i=0; i<5;i++) {
            if (!(koltuklar[i])) {
                return false;
            }
        }
        return true;

    }
    public boolean ucakDoluMu(){
        for(int i=0; i<koltukSayisi;i++) {
            if(!(koltuklar[i]))
                return false;
        }
        return true;

    }
    public  abstract void rezervasyonAl();
}
