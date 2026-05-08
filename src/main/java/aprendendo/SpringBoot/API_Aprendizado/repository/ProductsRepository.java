package aprendendo.SpringBoot.API_Aprendizado.repository;

import aprendendo.SpringBoot.API_Aprendizado.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products , String> { }
