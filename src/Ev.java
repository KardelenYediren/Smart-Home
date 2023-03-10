import java.util.ArrayList;

public class Ev
{
    public static class Evimiz
    {
        public static ArrayList<ElektronikCihaz> ElektronikCihazlar = new ArrayList<ElektronikCihaz>();
        public static ArrayList<ISurelenebilir> SurelenebilirCihazlar = new ArrayList<ISurelenebilir>();
        public static ArrayList<IZamanlanabilir> ZamanlanabilirCihazlar = new ArrayList<IZamanlanabilir>();
        //public static ArrayList<BeyazEsya> BeyazEsyalar = new ArrayList<>();

        public static void ElektronikCihazlariYazdir()
        {
            for (int i = 0 ; i<ElektronikCihazlar.size() ; i++)
            {
                ElektronikCihaz goruntulenenCihaz = ElektronikCihazlar.get(i);
                goruntulenenCihaz.EkranaYazdir();
            }
            System.out.println("Evdeki cihaz sayısı:" +ElektronikCihazlar.size());

        }

        //public static void BeyazEsyalariYazdir()
        //{
            //  for (int i = 0 ; i<BeyazEsyalar.size() ; i++)
            //  {
                //      ElektronikCihaz goruntulenenCihaz = BeyazEsyalar.get(i);
                //      goruntulenenCihaz.EkranaYazdir();

                //       System.out.println("Evdeki Beyaz Esya sayısı:" +BeyazEsyalar.size());
            }
            //}
    }


}
