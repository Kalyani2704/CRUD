package com.application.serviceInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import com.application.dto.ProductDTO;
import com.application.model.Product;

public interface ProductServiceInterface {
	public boolean addProductDetails(ProductDTO productDTO);

	public List<Product> viewProductList();
	
	public Page<Product> getProducts(int pageSize);

	public Optional<Product> findByProductId(long id);

	public boolean deleteProductById(long id);

	boolean updateProductById(ProductDTO productDTO, long id); 
}
