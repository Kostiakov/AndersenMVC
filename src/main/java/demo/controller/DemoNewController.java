package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoNewController {

	@GetMapping("/")
	public String showStart() {
		return "start";
	}
	
	@GetMapping("/form")
	public String showForm(Model model) {
		Student theStudent = new Student();
		model.addAttribute("student", theStudent);
		return "form";
	}
	
	@RequestMapping("/process")
	public String processForm(@ModelAttribute ("student") Student theStudent) {
		System.out.println(theStudent.getName());
		return "processForm";
	}
}
