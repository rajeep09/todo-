//package serviceLayers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import entities.Product;
//import repository.ProductRepository;
//
//@Service
//public class ProductService {
//
//	@Autowired
//	ProductRepository productrepository;
//
//	public Product saveProduct(Product product) {
//		// TODO Auto-generated method stub
//		return productrepository.save(product);
//	}
//
//	public List<Product> getAllProduct() {
//
//		return productrepository.findAll();
//
//	}
//
//	public List<Product> getAllProductsByCategoryId(int categoryId) {
//		return productrepository.findByCategoryId(categoryId);
//	}
//
//}
