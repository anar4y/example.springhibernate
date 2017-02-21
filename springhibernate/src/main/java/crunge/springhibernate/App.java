package crunge.springhibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import crunge.springhibernate.dao.PersonDAO;
import crunge.springhibernate.dao.PersonDAOImpl;
import crunge.springhibernate.entity.Entity;
import crunge.springhibernate.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
                new ClassPathXmlApplicationContext("spring.xml");

    	PersonDAO obj = (PersonDAO) context.getBean("PersonDAOImpl");
         Person person = new Person("Ivan", "Ivanov","Ostrava", "Ostrava-Poruba");
        // obj.insertPerson(person);
         System.out.println(obj.getPersons().get(0).getId());
    }
}
