package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.entity.BookNew;
import demo.entity.MagazineNew;
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
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		BookNew theBook=new BookNew();
		model.addAttribute("book", theBook);
		MagazineNew theMagazine=new MagazineNew();
		model.addAttribute("magazine", theMagazine);
		return "literature-form";
	}
	
	@PostMapping("/addBook")
	public String addCustomer(@ModelAttribute("book") BookNew theBook) {
		literatureService.addLiterature(theBook);
		return "redirect:/";
	}
	
	@PostMapping("/addMagazine")
	public String addCustomer(@ModelAttribute("magazine") MagazineNew theMagazine) {
		literatureService.addLiterature(theMagazine);
		return "redirect:/";
	}
	
	@RequestMapping("/delete")
	public String deleteCustomer(@RequestParam("literatureId") int theId, Model model) {
		literatureService.deleteLiterature(theId);
		return "redirect:/form";
	}
	
}
