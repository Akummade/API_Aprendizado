package aprendendo.SpringBoot.API_Aprendizado.controler;

import aprendendo.SpringBoot.API_Aprendizado.model.Products;
import aprendendo.SpringBoot.API_Aprendizado.repository.ProductsRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController//essa classe vai receber requisições REST
@RequestMapping("Products")
public class ProductControl {

    private ProductsRepository productsRepository;

    public ProductControl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @PostMapping//Post --> Salvar dados , criar recurso sem exibição na URL
    public Products SavePR(@RequestBody Products pr){//Produto -> recurso
        System.out.println("Product Recive -> " + pr);
        var id = UUID.randomUUID().toString();
        pr.setID(id);
        productsRepository.save(pr);
        return pr;
    }

}
