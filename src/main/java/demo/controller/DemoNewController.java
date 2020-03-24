package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import demo.service.LiteratureService;

@Controller
public class DemoNewController {
	
	@Autowired
	LiteratureService literatureService;

	@GetMapping("/")
	public String showStart() {
		return "start";
	}
	
	@GetMapping("/form")
	public String showForm(Model model) {
		List theLiterature=literatureService.getLiterature();
		model.addAttribute("literature", theLiterature);
		return "form";
	}
	
	
}
