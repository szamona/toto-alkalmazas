package toto;
import toto.szolgaltatas.TotoSzolgaltatas;

import java.util.Scanner;

public class Alk
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        TotoSzolgaltatas s = new TotoSzolgaltatas();
        s.Bekeres("toto.csv");
        //s.Ellenorzes();
        System.out.println("A legnagyobb nyeremeny amit rogzitettek: "+s.LegnagyobbNyeremeny());
        s.Statisztika();
        System.out.print("Kerem adjon meg egy datumot: ");
        String datum = sc.nextLine();
        System.out.print("Kerem adjon meg egy tippet: ");
        String tipp = sc.nextLine();
        s.getTipp(datum,s.Tombosit(tipp));
    }

}
