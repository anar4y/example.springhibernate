package crunge.springhibernate.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import crunge.springhibernate.model.Person;

public class PersonDAOImpl extends HibernateDaoSupport implements PersonDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	@Transactional(readOnly = false)
	public void insertPerson(Person person) {
		getHibernateTemplate().save(person);
	}

	public Person getPerson(int id) {
		return null;
	}

	@Override
	public String toString() {
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Person> getPersons() {
		return (List<Person>) getHibernateTemplate().find("FROM Person E  WHERE E.id = 3");
	}

}
