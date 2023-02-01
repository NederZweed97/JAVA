//Sarah Vogelzang
package w3;
import java.time.LocalDate;
import java.time.Period;

public class Lidmaatschap{
    protected Persoon persoon;
    private double contributie;
    private LocalDate aanmelding;



    public Lidmaatschap() {
    
    }
    
    public void setPersoon(String vnaam, String anaam, int jaar, int maand, int dag){
        this.persoon = new Persoon(vnaam, anaam, jaar, maand, dag);


    }

    public Persoon getPersoon(){
        return this.persoon;
    }
    public int getAge(){
        LocalDate nu = LocalDate.now();
        return(Period.between(persoon.getGeboorteDatum(), nu).getYears());
    }

    public void setContributie(){
        int lt = this.persoon.getAge();
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
    }
    public int getJarenActief(){
        LocalDate nu = LocalDate.now();
        return(Period.between(this.aanmelding, nu).getYears());
    }




}
