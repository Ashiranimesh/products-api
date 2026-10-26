package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.Override;

@RestController
//@RequestMapping("/products")
public class ProductController {
    //    // Spring creates the ProductService and hands it over.
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {

        return productService.getAllProducts();

    }

//    @GetMapping("/{id}")
//    public Product getByid(@PathVariable Long id) {
//        return new Product(id, "llaptop", 999.99);
//    }
//
    @GetMapping("/products/{id}")
    public Product getProductByid(@PathVariable Long id) {
        return productService.getProductById(id).orElse(null);}

    @PostMapping("/products")
    public Product addProduct (@RequestBody DigitalProduct product) {
        return productService.addProduct(product);
    }

@DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
    productService.deleteProduct(id);
}

@GetMapping ("/products/search")
    public List<Product> search(@RequestParam String name) {
        return productService.findByName(name);
}


}
