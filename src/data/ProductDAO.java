package data;

import data.dao.Product;

import java.util.Vector;

public interface ProductDAO {

    boolean newProduct(Product product);

    boolean delProduct(int prcode);

    boolean updateProduct(Product product);

    Product getProduct(int index);

    Vector<String> getPrcodeLists();


}
