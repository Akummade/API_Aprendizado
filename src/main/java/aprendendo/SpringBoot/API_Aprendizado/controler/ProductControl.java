package aprendendo.SpringBoot.API_Aprendizado.controler;

import aprendendo.SpringBoot.API_Aprendizado.model.Products;
import aprendendo.SpringBoot.API_Aprendizado.repository.ProductsRepository;
import org.hibernate.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController//essa classe vai receber requisições REST
@RequestMapping("Products")
public class ProductControl {

    private ProductsRepository productsRepository;

    public ProductControl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @PostMapping//Post --> Salvar dados , criar recurso sem exibição na URL
    public List<Products> SavePR(@RequestBody List<Products> pr){//Produto -> recurso
        for(Products i: pr){
            System.out.println("Product Recive -> " + i);
            var id = UUID.randomUUID().toString();
            i.setID(id);
            productsRepository.save(i);
        }
        return pr;
    }
    @GetMapping("/{id}")
    public Products getProduct(@PathVariable("id") String id){
        return productsRepository.findById(id).orElse(null);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        productsRepository.deleteById(id);
    }
    @PutMapping("/{id}")
    public void refresh(@PathVariable("id") String id,
                        @RequestBody Products pr){
        pr.setID(id);
        productsRepository.save(pr);
    }
    @GetMapping
    public List<Products> searchPr(@RequestParam("name") String pr){
        return productsRepository.findByname(pr);
    }
}
