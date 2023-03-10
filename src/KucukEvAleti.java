import java.util.Scanner;

public abstract class KucukEvAleti extends ElektronikCihaz
{
        public String Renk;
        public boolean Tasinabilir;
        public BataryaTipi bataryaTipi;

        public KucukEvAleti()
        {
                System.out.println("Renk giriniz:");
                Scanner scanner = new Scanner(System.in);
                Renk= scanner.next();

                System.out.println("Cihaz Taşınabilir mi?");
                System.out.println("1 Evet");
                System.out.println("2 Hayır");

                int secim = scanner.nextInt();
                if (secim == 1)
                {
                        Tasinabilir=true;
                }
                else if (secim == 2)
                {
                        Tasinabilir=false;
                }

                System.out.println("Cihazın Batarya Tipi nedir?");
                System.out.println("1 Sarjli");
                System.out.println("2 Elektrikli");

                secim = scanner.nextInt();
                if (secim == 1)
                {
                        bataryaTipi= BataryaTipi.Sarjli;
                }
                else if (secim == 2)
                {
                        bataryaTipi= BataryaTipi.Elektrikli;
                }

        }

}
