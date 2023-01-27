//Sarah Vogelzang
package w3;
import java.time.LocalDate;
import java.time.Period;

public class Persoon {

    private String voornaam;
    private String achternaam;
    private LocalDate geboorteDatum;
    private int leeftijd;

    public Persoon(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public String getVoornaam() {
        return this.voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return this.achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public void setLeeftijd(int gjaar, int gmaand, int gdag){
        this.geboorteDatum = LocalDate.of(gjaar, gmaand, gdag);
        LocalDate vandaag = LocalDate.now();
        this.leeftijd = Period.between(this.geboorteDatum, vandaag).getYears();
    }

    public int getLeeftijd(){
        return this.leeftijd;
    }

    public LocalDate getGeboorteDatum(){
        return this.geboorteDatum;
    }
}
