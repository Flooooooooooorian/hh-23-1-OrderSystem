public class ShopService {

    private ProductRepository productRepository;

    public ShopService() {
        productRepository = new ProductRepository();
    }

    public void listProducts() {
        System.out.println(productRepository.list());
    }

    public void getProduct(String id) {
        System.out.println(productRepository.get(id));
    }
}
