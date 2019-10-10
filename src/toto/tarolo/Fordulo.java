package toto.tarolo;

import java.time.LocalDate;
import java.util.List;
import java.util.LinkedList;

public class Fordulo
{
    private int ev;
    private int het;
    private int forduloAHeten;
    private LocalDate datum;
    private List<Talalat> talalatok=new LinkedList<Talalat>();
    private List<Eredmeny> eredmenyek=new LinkedList<Eredmeny>();


    public Fordulo() {}


    public int getEv()
    {
        return ev;
    }

    public int getHet()
    {
        return het;
    }

    public int getForduloAHeten()
    {
        return forduloAHeten;
    }

    public LocalDate getDatum()
    {
        return datum;
    }

    public Talalat getTalalatok(int i)
    {
        return talalatok.get(i);
    }

    public Eredmeny getEredmenyek(int i)
    {
        return eredmenyek.get(i);
    }


    public void setEv(int ev)
    {
        this.ev = ev;
    }

    public void setHet(int het)
    {
        this.het = het;
    }

    public void setForduloAHeten(int forduloAHeten)
    {
        this.forduloAHeten = forduloAHeten;
    }

    public void setDatum(LocalDate datum)
    {
        this.datum = datum;
    }

    public void setTalalatok(Talalat t)
    {
        this.talalatok.add(t);
    }

    public void setEredmenyek(Eredmeny e)
    {
        this.eredmenyek.add(e);
    }
}
