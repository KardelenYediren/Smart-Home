public class CamasirMakinesi extends BeyazEsya implements IZamanlanabilir
{
    public int DereceAyari;
    public int DevirAyari;
    public String ProgramAyari;

    public CamasirMakinesi(int CDereceAyari, int CDevirAyari, String CProgramAyari, String girilenEnerjiSinifi, int girilenIcHacmi)
    {
        DereceAyari=CDereceAyari;
        DevirAyari=CDevirAyari;
        ProgramAyari=CProgramAyari;
    }

    @Override
    public void EkranaYazdir() {
        System.out.println("Derece Ayarı ="+DereceAyari);
        System.out.println("Devir Ayarı ="+DevirAyari);
        System.out.println("Program Ayarı ="+ProgramAyari);
    }

    @Override
    public void ZamanliCalistir(String zaman) {

        System.out.println("Camasir Makinesi " +zaman+ "(da/de) çalıştırılacaktır!");
    }
}
