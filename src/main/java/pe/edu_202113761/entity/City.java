package pe.edu_202113761.entity;

import jakarta.persistence.*;

@Entity
public class City {

    @Id
    private int ID;

    private String Name;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "CountryCode")
    private Country country;

    private String District;

    private int Population;

    public City() {
    }


    public City(int ID, int population, String district, Country country, String name) {
        this.ID = ID;
        Population = population;
        District = district;
        this.country = country;
        Name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", country=" + country +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}