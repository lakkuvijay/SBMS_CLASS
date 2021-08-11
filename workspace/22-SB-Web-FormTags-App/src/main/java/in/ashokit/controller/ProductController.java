package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.bindings.Product;

@Controller
public class ProductController {

	@GetMapping("/loadForm")
	public String loadForm(Model model) {

		Product pobj = new Product();

		model.addAttribute("product", pobj);

		return "index";
	}

	@PostMapping("/saveProduct")
	public String handleSaveBtnClick(Product product, Model model) {

		System.out.println(product);

		model.addAttribute("msg", "Product Saved Successfully");

		return "dashboard";

	}

}
