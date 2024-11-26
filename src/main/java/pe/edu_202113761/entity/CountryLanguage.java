package pe.edu_202113761.entity;

import jakarta.persistence.*;

@Entity
public class CountryLanguage {

    @Id
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "CountryCode")
    private Country country;
    @Id
    private String language;

    private String lsOfficial;

    private double percentage;

    public CountryLanguage() {
    }

    public CountryLanguage(Country countryCode, double percentage, String lsOfficial, String language) {
        country = countryCode;
        this.percentage = percentage;
        this.lsOfficial = lsOfficial;
        this.language = language;
    }

    @Override
    public String toString() {
        return "countryLanguage{" +
                "CountryCode='" + country + '\'' +
                ", language='" + language + '\'' +
                ", lsOfficial='" + lsOfficial + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    public Country getCountryCode() {
        return country;
    }

    public void setCountryCode(Country countryCode) {
        country = countryCode;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getLsOfficial() {
        return lsOfficial;
    }

    public void setLsOfficial(String lsOfficial) {
        this.lsOfficial = lsOfficial;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
