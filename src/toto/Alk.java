package toto;
import toto.szolgaltatas.TotoSzolgaltatas;
public class Alk
{

    public static void main(String[] args)
    {
        TotoSzolgaltatas s = new TotoSzolgaltatas();
        s.Bekeres("toto.csv");
        //s.Ellenorzes();
        System.out.print("A legnagyobb nyeremeny amit rogzitettek: "+s.LegnagyobbNyeremeny());
    }

}
