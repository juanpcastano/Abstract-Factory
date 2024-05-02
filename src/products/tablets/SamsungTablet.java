package products.tablets;

public class SamsungTablet implements Tablet{
    private String brand;
    private String os;

    public SamsungTablet(String brand, String os) {
        this.brand = brand;
        this.os = os;
    }

    public void created() {
        System.out.println("Crated " + brand + " Tablet with " + os);
    }
}
