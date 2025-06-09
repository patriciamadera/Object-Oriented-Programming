package Model;


public class EntityFactory {
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("digital")) {
            return new DigitalProduct(2, "D001", "Ebook", "Libro digital de Java", 100, 10.0, 102, true, "PDF", 5.0);
        } else if (type.equalsIgnoreCase("physical")) {
            return new PhysicalProduct(1, "P001", "Laptop", "Laptop profesional", 5, 1200, 101, true, 2.5, "35x25x3");
        } else {
            throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }

    public static Client createUser(String type) {
        if (type.equalsIgnoreCase("client")) {
            return new RegularClient(100, "Ana", "Gomez", "ana@mail.com", "123", "Calle Falsa", "555-1234", "F");
        } else if (type.equalsIgnoreCase("admin")) {
            return new Administrator(101, "Patricia", "Madera", "admin@mail.com", "admin", "Oficina", "555-0000", "F");
        } else {
            throw new IllegalArgumentException("Unknown user type: " + type);
        }
    }
}

