package pe.edu_202113761.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu_202113761.entity.City;
import pe.edu_202113761.entity.Country;
import pe.edu_202113761.entity.CountryLanguage;

public class JPARemove {

    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();


        Country country = em.find(Country.class, "ZEW");
        City city = em.find(City.class, 999999);
        em.remove(city);
        City city2 = em.find(City.class, 999998);
        em.remove(city2);
        City city3 = em.find(City.class, 999997);
        em.remove(city3);
        CountryLanguage countryLanguage = em.find(CountryLanguage.class, "F");
        em.remove(countryLanguage);
        em.getTransaction().begin();
        em.remove(country);

        em.getTransaction().commit();

    }

}
