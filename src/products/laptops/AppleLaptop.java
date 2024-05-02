package products.laptops;

public class AppleLaptop implements Laptop{
    private String brand;
    private String os;

    public AppleLaptop(String brand, String os) {
        this.brand = brand;
        this.os = os;
    }

    public void created() {
        System.out.println("Crated " + brand + " Laptop with " + os);
    }
}
