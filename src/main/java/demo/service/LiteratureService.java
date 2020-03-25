package demo.service;

import java.util.List;

import demo.entity.LiteratureNew;

public interface LiteratureService {
	
	public List<LiteratureNew> getLiterature();
	public void addLiterature(LiteratureNew theLiterature);
	public void deleteLiterature(int theId);

}
