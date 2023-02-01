//Sarah Vogelzang
package w3;
import java.time.LocalDate;
import java.time.Period;

public class Persoon {

    private String voornaam;
    private String achternaam;
    private LocalDate geboorteDatum;
    private int jaar;
    private int dag;
    private int maand;


    public Persoon(String voornaam, String achternaam, int jaar, int maand, int dag) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboorteDatum = LocalDate.of(jaar, maand, dag);
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

    public void setGeboorteDatum(int gjaar, int gmaand, int gdag){
        this.geboorteDatum = LocalDate.of(gjaar, gmaand, gdag);
    }

    public LocalDate getGeboorteDatum(){
        return this.geboorteDatum;
    }

    public int getAge(){
        LocalDate nu = LocalDate.now();
        return(Period.between(this.geboorteDatum, nu).getYears());
    }
}
