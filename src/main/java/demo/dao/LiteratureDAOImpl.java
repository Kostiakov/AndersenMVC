package demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.entity.LiteratureNew;

@Repository
public class LiteratureDAOImpl implements LiteratureDAO {
	
	@Autowired
	private SessionFactory factory;

	@Override
	public List<LiteratureNew> getLiterature() {
		Session currSession = factory.getCurrentSession();
		Query<LiteratureNew> theQuery = currSession.createQuery("from LiteratureNew", LiteratureNew.class);
		List<LiteratureNew> customers = theQuery.getResultList();
		return customers;
	}

	@Override
	public void addLiterature(LiteratureNew theLiterature) {
		Session currSession = factory.getCurrentSession();
		currSession.saveOrUpdate(theLiterature);
		
	}

	@Override
	public void deleteLiterature(int theId) {
		Session currSession = factory.getCurrentSession();
		LiteratureNew theLiterature=currSession.get(LiteratureNew.class, theId);
		currSession.delete(theLiterature);
	}

}
