public class Firin extends BeyazEsya implements IZamanlanabilir, ISurelenebilir
{
    public int DereceAyari;
    private int FirinKapasite;
    private String FirinKontrolTipi;

    public Firin(int CDereceAyari, int CFirinKapasite, String CFirinKontrolTipi, String CEnerjiSinifi, int CIcHacmi)
    {
        DereceAyari=CDereceAyari;
        FirinKapasite=CFirinKapasite;
        FirinKontrolTipi=CFirinKontrolTipi;
        SetEnerjiSinifi(CEnerjiSinifi);
    }

    @Override
    public void EkranaYazdir() {
        System.out.println("FIRIN");
        System.out.println("Derece Ayarı ="+DereceAyari);
        System.out.println("Kapasite ="+FirinKapasite);
        System.out.println("Kontrol Tipi ="+FirinKontrolTipi);
    }

    @Override
    public void ZamanliCalistir(String zaman) {
        System.out.println("Firin " +zaman+ "(da/de) çalıştırılacaktır!");
    }

    @Override
    public void SureliCalistir(float saniye) {
        System.out.println("Firin " +saniye+ " çalıştırılacaktır!");

    }
}
