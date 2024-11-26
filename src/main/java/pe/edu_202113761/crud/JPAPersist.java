package pe.edu_202113761.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu_202113761.entity.City;
import pe.edu_202113761.entity.Country;
import pe.edu_202113761.entity.CountryLanguage;

import java.util.ArrayList;
import java.util.List;

public class JPAPersist {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        Country country = new Country("ZEW","Granola","Asia","CEREAL",193.21,200,20,40,32,"Noc",899.32,"Angel","Angeles2",123,"32");
        List<City>cities = new ArrayList<>();
        City city = new City(999999, 200,"dire",country,"kiid");
        cities.add(city);
        City city2 = new City(999998, 300,"Radiant",country,"kids");
        cities.add(city2);
        City city3 = new City(999997, 300,"dorams",country,"dabu");
        cities.add(city3);
        List<CountryLanguage>countryLanguages = new ArrayList<>();
        CountryLanguage countryLanguage = new CountryLanguage(country,3.32,"F","Spanish");
        countryLanguages.add(countryLanguage);
        CountryLanguage countryLanguage2 = new CountryLanguage(country,3.36,"F","English");
        countryLanguages.add(countryLanguage2);

        country.setCities(cities);
        em.getTransaction().begin();
        em.persist(country);
        em.getTransaction().commit();
    }
}