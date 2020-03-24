package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.dao.LiteratureDAO;
import demo.entity.LiteratureNew;

@Service
public class LiteratureServiceImpl implements LiteratureService {
	
	@Autowired
	LiteratureDAO literatureDAO;

	@Transactional
	@Override
	public List<LiteratureNew> getLiterature() {
		return literatureDAO.getLiterature();
	}

}
