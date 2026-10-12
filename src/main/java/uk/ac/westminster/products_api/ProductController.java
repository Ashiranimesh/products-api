package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    // Spring creates the ProductService and hands it over.
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product>getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getByid(@PathVariable Long id) {
        return new Product(id, "llaptop", 999.99);
    }
}
