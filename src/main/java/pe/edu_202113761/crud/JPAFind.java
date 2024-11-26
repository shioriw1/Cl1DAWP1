package pe.edu_202113761.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu_202113761.entity.City;
import pe.edu_202113761.entity.Country;

import java.util.List;

public class JPAFind {

    public static void main(String[] args){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        //City city = em.find(City.class, 1);
        //System.out.println(city.toString());

        Country country = em.find(Country.class, "PER");
        List<City> cities = country.getCities();
                cities.stream()
                                .filter(city -> city.getPopulation() > 700000)
                                        .forEach(city -> System.out.println(city.getName()));
        System.out.println(country.toString());
    }
}
