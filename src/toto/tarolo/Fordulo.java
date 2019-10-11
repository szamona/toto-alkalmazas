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

    public List<Talalat> getTalalatok()
    {
        return talalatok;
    }

    public List<Eredmeny> getEredmenyek()
    {
        return eredmenyek;
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

    public void setTalalatok(List<Talalat> talalatok)
    {
        this.talalatok = talalatok;
    }

    public void setEredmenyek(List<Eredmeny> eredmenyek)
    {
        this.eredmenyek = eredmenyek;
    }
}
