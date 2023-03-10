public class RobotSupurge extends KucukEvAleti implements IZamanlanabilir, ISurelenebilir
{
    private int Agirlik;
    private int Yukseklik;
    private String GurultuSeviyesi;
    private int SarjSuresi;

    public RobotSupurge(int CAgirlik, int CYukseklik, String CGurultuSeviyesi, int CSarjSuresi)
    {
        Agirlik=CAgirlik;
        Yukseklik=CYukseklik;
        GurultuSeviyesi=CGurultuSeviyesi;
        SarjSuresi=CSarjSuresi;
    }

    @Override
    public void EkranaYazdir() {
        System.out.println("ROBOT SUPURGE");
        System.out.println("Agirlik ="+Agirlik);
        System.out.println("Yukseklik ="+Yukseklik);
        System.out.println("Gurultu Seviyesi ="+GurultuSeviyesi);
        System.out.println("Sarj Suresi ="+SarjSuresi);
        System.out.println("Rengi ="+Renk);
        System.out.println("Tasinabilirlik ="+Tasinabilir);
        System.out.println("Batarya Tipi ="+bataryaTipi);
    }

    @Override
    public void ZamanliCalistir(String zaman) {

        System.out.println("Robot Supurge " +zaman+ "(da/de) çalıştırılacaktır!");
    }

    @Override
    public void SureliCalistir(float saniye) {
        System.out.println("Robot Supurge " +saniye+ " çalıştırılacaktır!");

    }
}
