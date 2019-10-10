package toto.szolgaltatas;

import toto.tarolo.Fordulo;

import javax.swing.*;
import java.util.List;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
                f.setForduloAHeten(Integer.parseInt(st[2]));
                f.setDatum(LocalDate.parse(DatumJavitas(st[3])));


            }

            b.close();
            fr.close();
        }

        catch (IOException e)
        {
            System.out.println(e);
        }

    }

    public String DatumJavitas(String s)
    {
        s.replaceFirst(".","-");
        s.replaceFirst(".","-");
        s.replaceFirst(".","");
        return s;
    }

}
