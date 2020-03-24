package demo.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.dao.LiteratureDAO;

@Controller
public class DemoNewController {
	
	@Autowired
	LiteratureDAO literature;

	@GetMapping("/")
	public String showStart() {
		return "start";
	}
	
	@GetMapping("/form")
	public String showForm(Model model) {
		Student theStudent = new Student();
		model.addAttribute("student", theStudent);
		List list=literature.getCustomers();
		System.out.println(literature);
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		return "form";
	}
	
	@RequestMapping("/process")
	public String processForm(@ModelAttribute ("student") Student theStudent) {
		System.out.println(theStudent.getName());
		return "processForm";
	}
}
