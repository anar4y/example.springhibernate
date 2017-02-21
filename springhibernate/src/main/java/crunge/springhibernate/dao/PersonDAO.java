package crunge.springhibernate.dao;

import java.util.List;

import crunge.springhibernate.model.Person;

public interface  PersonDAO {
	public void insertPerson(Person person);
	public Person getPerson(int id);
	public List<Person> getPersons();
}
