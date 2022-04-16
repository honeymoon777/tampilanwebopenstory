package projectakhirOpenStory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import projectakhirOpenStory.repository.UserRepository;

@Controller
public class HomeController {

	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/")
	private String index(Model model) {

		return "index";
	}
	
	@GetMapping("/index")
	private String home(Model model) {

		return "index";
	}
	
	@GetMapping("/contacts")
	private String contacts(Model model) {

		return "contacts";
	}
	
	@GetMapping("/explore")
	private String explore(Model model) {

		return "grid-listing-3";
	}
	
	@GetMapping("/help")
	private String help(Model model) {

		return "help";
	}
	
	@GetMapping("/login")
	private String login(Model model) {

		return "login";
	}
	
	@GetMapping("/register")
	private String register(Model model) {

		return "register";
	}
	
	@GetMapping("/author")
	private String author(Model model) {

		return "author";
	}
	
	@GetMapping("/blog")
	private String blog(Model model) {

		return "blog";
	}
	
	@GetMapping("/detail-page")
	private String detailpage(Model model) {

		return "detail-page";
	}
	
	@GetMapping("/become-author")
	private String becomeauthor(Model model) {

		return "become-author";
	}
	
	@GetMapping("/account-settings")
	private String accountsetting(Model model) {

		return "account-settings";
	}
	
	@GetMapping("/author-edit-profile")
	private String authoreditprofile(Model model) {

		return "author-edit-profile";
	}
	

	@GetMapping("/connect-wallet")
	private String connectwallet(Model model) {

		return "connect-wallet";
	}
	
	
	@GetMapping("/contacts-author")
	private String connectauthor(Model model) {

		return "contacts-author";
	}
	
	@GetMapping("/detail-page2")
	private String detailpage2(Model model) {

		return "detail-page2";
	}
	
	@GetMapping("/explor-author")
	private String explorauthor(Model model) {

		return "explor-author";
	}
	
	@GetMapping("/help-author")
	private String helpauthor(Model model) {

		return "help-author";
	}
	
	
	
	@GetMapping("/index-author")
	private String indexauthor(Model model) {

		return "index-author";
	}
	
	
	@GetMapping("/upload-artwork")
	private String uploadartwork(Model model) {

		return "upload-artwork";
	}
	
	
	
	
	
	
	
	
	
	
	
}
