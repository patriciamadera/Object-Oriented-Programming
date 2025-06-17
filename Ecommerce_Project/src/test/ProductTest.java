package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Model.Product;
import Model.PhysicalProduct;
import Model.DigitalProduct;
import Exceptions.InsufficientInventoryException;

public class ProductTest {

    @Test
    public void testReduceStockSuccess() throws InsufficientInventoryException {
        Product product = new PhysicalProduct(
            1, "P001", "Mouse", "Wireless mouse", 10, 20.0, 1, true,
            0.3, "10x5x4 cm"
        );
        product.reduceStock(5);
        assertEquals(5, product.getStock());
    }

    @Test
    public void testReduceStockThrowsException() {
        Product product = new PhysicalProduct(
            2, "P002", "Keyboard", "Mechanical", 2, 50.0, 1, true,
            0.8, "20x10x5 cm"
        );

        assertThrows(InsufficientInventoryException.class, () -> {
            product.reduceStock(5);
        });
    }

    @Test
    public void testReduceStockWithDigitalProduct() throws InsufficientInventoryException {
        Product product = new DigitalProduct(
            3, "D001", "E-book", "PDF eBook", 100, 5.0, 2, true,
            "PDF", 2.5
        );

        product.reduceStock(10);
        assertEquals(90, product.getStock());
    }
}
