public class KahveMakinesi extends KucukEvAleti implements IZamanlanabilir
{
    public int BardakKapasitesi;
    private int Derece;
    private int SuHacmi;

    public KahveMakinesi(int CBardakKapasitesi, int CDerece, int CSuHacmi)
    {
        BardakKapasitesi=CBardakKapasitesi;
        Derece=CDerece;
        SuHacmi=CSuHacmi;
    }
    @Override
    public void EkranaYazdir() {
        super.EkranaYazdir();
        System.out.println("KAHVE MAKINESI");
        System.out.println("Bardak Kapasitesi ="+BardakKapasitesi);
        System.out.println("Derece ="+Derece);
        System.out.println("Su Hacmi ="+SuHacmi);
        System.out.println("Rengi ="+Renk);
        System.out.println("Tasinabilirlik ="+Tasinabilir);
        System.out.println("Batarya Tipi ="+bataryaTipi);

    }

    @Override
    public void ZamanliCalistir(String zaman) {

        System.out.println("Kahve Makinesi " +zaman+ "(da/de) çalıştırılacaktır!");
    }

}
