//Sarah Vogelzang
package w3;
import java.time.LocalDate;
import java.time.Period;

public class Lidmaatschap{
    public Persoon persoon;
    private double contributie;
    LocalDate aanmelding;
    public int jarenActief;

    public Lidmaatschap() {
    
    }
    
    public void setPersoon(String vnaam, String anaam, int jaar, int maand, int dag){
        Persoon p = new Persoon(vnaam, anaam);
        this.persoon = p;
        this.persoon.setLeeftijd(jaar, maand, dag);        
    }

    public void getPersoon(){
        System.out.println(this.persoon);
    }

    public void setContributie(){
        int lt = this.persoon.getLeeftijd();
        if(lt > 0 && lt < 12){
            this.contributie = 5.0;
        } else if (lt > 11 && lt < 18) {
            this.contributie = 7.5;
        } else if (lt  > 17 && lt < 66){
            this.contributie = 10.0;
        } else if(lt > 65){
            this.contributie = 30.35;
        } else{
            System.out.println("Ongeldige leeftijd");
        }
    }

    public double getContributie(){
        return this.contributie;
    }

    public void setAanmeldDatum(int jaar, int maand, int dag){
        this.aanmelding = LocalDate.of(jaar, maand, dag);
        LocalDate nu = LocalDate.now();
        this.jarenActief = Period.between(this.aanmelding, nu).getYears();
    }

    public void getAanmelding(){
        System.out.println(this.aanmelding);
    }

    public int getJarenActief(){
        return this.jarenActief;
    }
}
