//Sarah Vogelzang
package w3;
import java.util.*;
import java.util.Map.Entry;

public class Vereniging {
    private ArrayList<Lidmaatschap> leden;


    public Vereniging(){
        this.leden = new ArrayList<>();
    }

    public void addLeden(Lidmaatschap lidmaastchap){
        this.leden.add(lidmaastchap);
    }

    public double getWinst(){
        double winst = 0;
        for(Lidmaatschap l : leden){
            winst += l.getContributie();
        }
        return winst;
    }



    public void getJongste(){

        Map<String, Integer> lijst = new LinkedHashMap<>();

            for(Lidmaatschap l : leden){
            lijst.put(l.persoon.getVoornaam(), l.persoon.getAge());
        }
        Entry<String, Integer> min = Collections.min(lijst.entrySet(), new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
               return o1.getValue().compareTo(o2.getValue());   
            }
        });
        System.out.println("Het Jongste lid is: " + min.getKey() + " en is " + min.getValue() + " jaar oud");
    }

    public void getOudste(){

         Map<String, Integer> lijst = new LinkedHashMap<>();
        for(Lidmaatschap l : leden){
            lijst.put(l.persoon.getVoornaam(), l.persoon.getAge());
        }
        Entry<String, Integer> max = Collections.max(lijst.entrySet(), new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
               return o1.getValue().compareTo(o2.getValue());   
            }
        });
        System.out.println("Het oudste lid is: " + max.getKey() + " en is " + max.getValue() + " jaar oud");
    }


    public void getKorstLid(){
        List<Integer> lijst = new ArrayList<>();
        for(Lidmaatschap l : leden){
            int lt = l.getJarenActief();
            lijst.add(lt);
        }
        System.out.println(Collections.min(lijst));
    }

    public void getLangstLid(){
        List<Integer> lijst = new ArrayList<>();
        for(Lidmaatschap l : leden){
            int lt = l.getJarenActief();
            lijst.add(lt);
        }
        System.out.println(Collections.max(lijst));
    }
   

    public static void main(String[] args){
        //Maak een Ijsclub class 
        Vereniging Ijsclub = new Vereniging();
        //Lid a en contributie en aanmelding zetten
        Lidmaatschap a = new Lidmaatschap();
        a.setPersoon("Sarah", "Vogelzang", 1997, 4, 3);
        a.setContributie();
        a.setAanmeldDatum(2020, 11, 5);
        //System.out.println(a.persoon.getGeboorteDatum());
 
        //Lid b en contributie en aamelding zetten
        Lidmaatschap b = new Lidmaatschap();
        b.setPersoon("test", "persoon", 1980, 8, 23);
        b.setAanmeldDatum(2005, 11, 12);
        b.setContributie();

        //Lid c en contributie en aamelding zetten
        Lidmaatschap c = new Lidmaatschap();
        c.setPersoon("zoe", "hond", 2019, 9, 27);
        c.setAanmeldDatum(2020, 10, 12);
        c.setContributie();

        //Lid d en contributie en aamelding zetten
        Lidmaatschap d = new Lidmaatschap();
        d.setPersoon("Lorenzo", "Jansen", 1970, 1, 16);
        d.setAanmeldDatum(1990, 11, 2);
        d.setContributie();

        //Zet alle leden in een ArrayList
        Ijsclub.addLeden(a);
        Ijsclub.addLeden(b);
        Ijsclub.addLeden(c);
        Ijsclub.addLeden(d);
        //Bereken de contributie en weergeef deze
        //Ijsclub.getWinst();
        //geef het jongste en oudste lid weer
        Ijsclub.getJongste();
        Ijsclub.getOudste();
        //Geef het korste en langstee ldimaatschap weer
        //Ijsclub.getKorstLid();
        //Ijsclub.getLangstLid();
    }
}
