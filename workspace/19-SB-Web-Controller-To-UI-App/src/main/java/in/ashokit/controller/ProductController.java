package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.pojo.Product;

@Controller
public class ProductController {

	@GetMapping("/productdata")
	public ModelAndView getProductData() {
		ModelAndView mav = new ModelAndView();

		Product pobj = new Product();
		pobj.setProductId(101);
		pobj.setProductName("Keyboard");
		pobj.setProductPrice(1500.00);

		mav.addObject("product", pobj); // adding product obj to model in Key-value format
		
		mav.setViewName("product-data"); // setting logical view name

		return mav;
	}

}
