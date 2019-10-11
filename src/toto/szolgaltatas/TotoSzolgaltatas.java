package toto.szolgaltatas;

import toto.tarolo.Fordulo;
import toto.tarolo.Talalat;
import toto.tarolo.Eredmeny;

import java.util.List;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class TotoSzolgaltatas
{

    private List<Fordulo> fordulok= new LinkedList<Fordulo>();

    public void Bekeres(String fajl)
    {
        try{
            FileReader fr = new FileReader(fajl);
            BufferedReader b = new BufferedReader(fr);
            String sor = b.readLine();

            while (sor!=null)
            {
                Fordulo f = new Fordulo();
                String[] st = sor.split(";");
                f.setEv(Integer.parseInt(st[0]));
                f.setHet(Integer.parseInt(st[1]));
                f.setForduloAHeten(setFordulokAHeten(st[2]));
                f.setDatum(LocalDate.parse(DatumJavitas(st[3])));
                List<Talalat> talalatokLista = new LinkedList<Talalat>();
                List<Eredmeny> eredmenyekLista = new LinkedList<Eredmeny>();
                f.setTalalatok(TalalatokFeldolgozasa(st,talalatokLista));
                f.setEredmenyek(EredmenyekFeldolgozasa(st,eredmenyekLista));
                this.fordulok.add(f);
                sor = b.readLine();
            }

            b.close();
            fr.close();
        }

        catch (IOException e)
        {
            System.out.println(e);
        }

    }
    public int setFordulokAHeten( String s )
    {
        int i = 0;
        if ( s.equals("") )
        {
            i = 1;
        }
        else
        {
            i = Integer.parseInt(s);
        }
        return i;
    }

    public String DatumJavitas(String s)
    {
        s.replaceFirst(".","-");
        s.replaceFirst(".","-");
        s.replaceFirst(".","");
        return s;
    }

    public List<Talalat> TalalatokFeldolgozasa(String[] st,List<Talalat> t)
    {
        int i = 4;
        int talalatokSzama=14;

        while (i < 14)
        {
            int nyertTalalatok= Integer.parseInt(st[i]);
            String penz = st[i + 1].replace(" Ft", "");
            penz = penz.replaceAll(" ", "");
            int nyeremeny = Integer.parseInt(penz);
            t.add(new Talalat(talalatokSzama, nyertTalalatok, nyeremeny));
            talalatokSzama--;
            i += 2;
        }
        return t;
    }

    public List<Eredmeny> EredmenyekFeldolgozasa(String[] st, List<Eredmeny> e)
    {
        int i = 14;

        while (i < 29)
        {
            if (st[i].equals("1")||st[i].equals("+1"))
            {
                e.add(Eredmeny._1);
            }
            else if(st[i].equals("2")||st[i].equals("+2"))
            {
                e.add(Eredmeny._2);
            }
            else
            {
                e.add(Eredmeny.X);
            }

        }
        return e;
    }
}
