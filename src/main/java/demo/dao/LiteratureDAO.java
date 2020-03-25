package demo.dao;

import java.util.List;

import demo.entity.LiteratureNew;

public interface LiteratureDAO {
	
	public List<LiteratureNew> getLiterature();
	public void addLiterature(LiteratureNew theLiterature);
	public void deleteLiterature(int theId);

}
