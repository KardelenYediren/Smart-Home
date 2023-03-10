import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hosgeldiniz!");
        Scanner scanner = new Scanner(System.in);

        int secim;
        int cihazSecim;
        while(true)
        {
            System.out.println("1 Cihazları Göster");
            System.out.println("2 Cihaz Ekle");
            secim=scanner.nextInt();
            if (secim == 1)
            {
                System.out.println("1 SECTİNİZ");
                Ev.Evimiz.ElektronikCihazlariYazdir();
            }
            else if (secim == 2)
            {
                System.out.println("2 SECTİNİZ");
                //Cihaz Ekle Menusu
                System.out.println("1 Çamasır Makinesi");
                System.out.println("2 Fırın");
                System.out.println("3 Kahve Makinesi");
                System.out.println("4 Mikrodalga Fırın");
                System.out.println("5 Robot Süpürge");
                cihazSecim=scanner.nextInt();
                switch (cihazSecim)
                {
                    case 1:

                        System.out.println("Derece Ayarı giriniz:");
                        int GirilenDereceAyari =scanner.nextInt();
                        System.out.println("Devir Ayarı giriniz:");
                        int GirilenDevirAyari =scanner.nextInt();
                        System.out.println("Program Ayarı giriniz:");
                        String GirilenProgramAyari =scanner.next();
                        System.out.println("Enerji Sınıfı giriniz:");
                        String GirilenEnerjiSinifi=scanner.next();
                        System.out.println("Ic Hacmi giriniz:");
                        int GirilenIcHacmi=scanner.nextInt();

                        CamasirMakinesi olusturulanCamasirMakinesi = new CamasirMakinesi(GirilenDereceAyari,GirilenDevirAyari, GirilenProgramAyari, GirilenEnerjiSinifi, GirilenIcHacmi);
                        break;

                    case 2:
                        System.out.println("Derece Ayarı giriniz:");
                        int GirilenDAyari =scanner.nextInt();
                        System.out.println("Kapasite giriniz:");
                        int GirilenFirinKapasite =scanner.nextInt();
                        System.out.println("Kontrol Tipi giriniz:");
                        String GirilenFirinKontrolTipi=scanner.next();
                        System.out.println("Enerji Sınıfı giriniz:");
                        String GirilenFEnerjiSinifi=scanner.next();
                        System.out.println("Ic Hacmi giriniz:");
                        int GirilenFIcHacmi=scanner.nextInt();

                        Firin olusturulanFirin = new Firin(GirilenDAyari, GirilenFirinKapasite, GirilenFirinKontrolTipi, GirilenFEnerjiSinifi, GirilenFIcHacmi);
                        break;

                    case 3:

                        System.out.println("Bardak Kapasitesi giriniz:");
                        int GirilenBardakKapasitsi =scanner.nextInt();
                        System.out.println("Derece giriniz:");
                        int GirilenDerece =scanner.nextInt();
                        System.out.println("Su Hacmi giriniz:");
                        int GirilenSuHacmi =scanner.nextInt();

                        KahveMakinesi olusturulanKahveMakinesi = new KahveMakinesi(GirilenBardakKapasitsi,GirilenDerece,GirilenSuHacmi);
                        break;

                    case 4:

                        System.out.println("Kapasite giriniz:");
                        int GirilenKapasite =scanner.nextInt();
                        System.out.println("Kontrol Tipi giriniz:");
                        int GirilenKontrolTipi =scanner.nextInt();
                        System.out.println("Guc Kademesi giriniz:");
                        String GirilenGucKademesi =scanner.next();

                        MikroDalgaFirin olusturulanMikroDalgaFirin = new MikroDalgaFirin(GirilenKapasite, GirilenKontrolTipi, GirilenGucKademesi);
                        break;

                    case 5:

                        System.out.println("Agırlık giriniz:");
                        int GirilenAgirlik =scanner.nextInt();
                        System.out.println("Yukseklik giriniz:");
                        int GirilenYukseklik =scanner.nextInt();
                        System.out.println("Gurultu Seviyesi giriniz:");
                        String GirilenGurultuSeviyesi =scanner.next();
                        System.out.println("Sarj Suresi giriniz:");
                        int GirilenSarjSuresi =scanner.nextInt();

                        RobotSupurge olusturulanRobotSupurge = new RobotSupurge(GirilenAgirlik, GirilenYukseklik, GirilenGurultuSeviyesi, GirilenSarjSuresi);
                        break;
                }

            }
            else
            {
                System.out.println("HATALI SEÇİM");
            }
        }

    }
}