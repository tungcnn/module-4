package controllers;

import models.entities.Product;
import models.services.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Random;

@Controller
public class ProductController {
    @Autowired
    private IProduct productService;
    @GetMapping("/")
    public String showList(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "index";
    }
    @GetMapping("/product/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }
    @PostMapping("/product/save")
    public String saveProduct(Product product, RedirectAttributes redirect) {
        product.setId(new Random().nextInt(10000));
        productService.save(product);
        redirect.addFlashAttribute("message", "Added new product!");
        return "redirect:/";
    }
    @GetMapping("/product/{id}/edit")
    public String showEdit(@PathVariable("id") int id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "edit";
    }
    @PostMapping("/product/edit")
    public String editProduct(Product product, RedirectAttributes redirect) {
        productService.update(product.getId(), product);
        redirect.addFlashAttribute("message", "Modified product " + product.getName());
        return "redirect:/";
    }
    @GetMapping("/product/{id}/delete")
    public String showDelete(@PathVariable("id") int id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "delete";
    }
    @PostMapping("/product/delete")
    public String deleteProduct(Product product, RedirectAttributes redirect) {
        productService.remove(product.getId());
        redirect.addFlashAttribute("message", "Removed product " + product.getId());
        return "redirect:/";
    }
    @GetMapping("/product/{id}/view")
    public String showView(@PathVariable("id") int id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "view";
    }
}
