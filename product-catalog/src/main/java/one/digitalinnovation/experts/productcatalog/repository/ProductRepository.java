package one.digitalinnovation.experts.productcatalog.repository;

import one.digitalinnovation.experts.productcatalog.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {

    List<Product> findByName(String name);

}