package products.laptops;

public class SamsungLaptop implements Laptop{
    private String brand;
    private String os;

    public SamsungLaptop(String brand, String os) {
        this.brand = brand;
        this.os = os;
    }

    public void created() {
        System.out.println("Crated " + brand + " Laptop with " + os);
    }
}
