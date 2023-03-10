public class MikroDalgaFirin extends KucukEvAleti implements IZamanlanabilir, ISurelenebilir
{
    private int Kapasite;
    private int KontrolTipi;
    public String GucKademesi;

    public MikroDalgaFirin(int CKapasite, int CKontrolTipi, String CGucKademesi)
    {

        Kapasite=CKapasite;
        KontrolTipi=CKontrolTipi;
        GucKademesi=CGucKademesi;
    }

    @Override
    public void EkranaYazdir() {
        System.out.println("MIKRODALGA FIRIN");
        System.out.println("Kapasite ="+Kapasite);
        System.out.println("Guc Kademesi ="+GucKademesi);
        System.out.println("Rengi ="+Renk);
        System.out.println("Tasinabilirlik ="+Tasinabilir);
        System.out.println("Batarya Tipi ="+bataryaTipi);

    }

    @Override
    public void ZamanliCalistir(String zaman) {

        System.out.println("Mikrodalga Firin " +zaman+ "(da/de) çalıştırılacaktır!");
    }

    @Override
    public void SureliCalistir(float saniye) {
        System.out.println("Mikrodalga Firin " +saniye+ " çalıştırılacaktır!");

    }
}
