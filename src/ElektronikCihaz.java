public abstract class ElektronikCihaz
{
    public boolean OnOff;

    public void Ac()
    {
        OnOff = true;
    }

    public void Kapat()
    {
        OnOff = false;
    }

    public ElektronikCihaz(boolean COnOff)
    {
        OnOff=COnOff;
    }


    public ElektronikCihaz()
    {
        Ev.Evimiz.ElektronikCihazlar.add(this);
    }
    public void EkranaYazdir()
    {

    }
}


