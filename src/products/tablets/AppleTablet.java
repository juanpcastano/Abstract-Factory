package products.tablets;

public class AppleTablet implements Tablet {
    private String brand;
    private String os;

    public AppleTablet(String brand, String os) {
        this.brand = brand;
        this.os = os;
    }

    public void created() {
        System.out.println("Crated " + brand + " Tablet with " + os);
    }
}
