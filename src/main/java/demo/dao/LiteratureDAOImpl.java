package demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import demo.entity.LiteratureNew;

@Repository
public class LiteratureDAOImpl implements LiteratureDAO {
	
	@Autowired
	private SessionFactory factory;

	@Transactional
	@Override
	public List<LiteratureNew> getCustomers() {

				//get session
				Session currSession = factory.getCurrentSession();
				//create query
				Query<LiteratureNew> theQuery = currSession.createQuery("from LiteratureNew", LiteratureNew.class);
				//execute query
				List<LiteratureNew> customers = theQuery.getResultList();
				//return results
				return customers;
	}

}
