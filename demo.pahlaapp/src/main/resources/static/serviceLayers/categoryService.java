//package serviceLayers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import entities.Category;
////import entities.Product;
//import repository.CategoryRepository;
//
//@Service
//public class categoryService {
//	@Autowired
//	private CategoryRepository categoryrepository;
//
//	public Category saveProduct(Category product) {
//		// TODO Auto-generated method stub
//		return categoryrepository.save(product);
//	}
//
//	public List<Category> getAllCategory() {
//		return categoryrepository.findAll();
//
//	}
//	public Category getCategoryById(int id) {
//        return categoryrepository.findById(id).orElse(null);
//    }
//}
