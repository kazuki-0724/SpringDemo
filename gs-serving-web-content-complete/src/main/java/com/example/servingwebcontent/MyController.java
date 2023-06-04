package com.example.servingwebcontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

	//こっからSessionを拾う
	@Autowired User user;
	
	
	@GetMapping("/sample1")
	public String sample1(Model model) {
		
		//先にgreetings.htmlに行ってるから
		//System.out.println("dokokokokoko " + user.getTheme());
		model.addAttribute("type", "test");
		user.setTheme("test");
		
		return "temp";
	}
	
	
	@GetMapping("/sample2")
	public String sample2(Model model) {
		
		//先にgreetings.htmlに行ってるから
		//System.out.println("dokokokokoko " + user.getTheme());
		model.addAttribute("type", "test2");
		user.setTheme("test2");
		
		return "temp";
	}
	
	
	
	@GetMapping("/temp")
	public String showTemp(Model model) {
		
		//先にgreetings.htmlに行ってるから
		System.out.println("dokokokokoko " + user.getTheme());
		model.addAttribute("type", user.getTheme());
		
		return "temp";
	}
	
	
	@GetMapping("/index2")
	public String showIndex(Model model) {
		
		//先にgreetings.htmlに行ってるから
		model.addAttribute("type", user.getTheme());
		return "index2";
	}
	
	
	@GetMapping("/list")
	public String showList(Model model) {
		
		//先にgreetings.htmlに行ってるから
		System.out.println("dokokokokoko [" + user.getTheme());
		model.addAttribute("type", user.getTheme());
		return "list";
	}
	
	
	@GetMapping("/creationForm")
	public String showCreationForm(Model model/*, @ModelAttribute MilestoneForm milestoneForm*/) {
		
		//先にgreetings.htmlに行ってるから
		model.addAttribute("type", user.getTheme());
		model.addAttribute("milestoneForm", new MilestoneForm());
		System.out.println("kokokokokoko");
		return "creationForm";
	}
	
	
	@GetMapping("/edit")
	public String showEdit(Model model) {
		
		//先にgreetings.htmlに行ってるから
		model.addAttribute("type", user.getTheme());
		return "edit";
	}
	
	
	@PostMapping("/createForm")
	public String createForm(MilestoneForm milestoneForm) {
		
		System.out.println("createForm");
		
		System.out.println(milestoneForm.getMilestone());
		System.out.println(milestoneForm.getDescription());
		System.out.println(milestoneForm.getDeadline());
		System.out.println(milestoneForm.getTag());
		System.out.println(milestoneForm.getPriority());
		
		
		return "index2";
	}
	
	
	
	
}
