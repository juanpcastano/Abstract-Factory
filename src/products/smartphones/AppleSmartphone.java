package products.smartphones;

public class AppleSmartphone implements Smartphone{
    private String brand;
    private String os;

    public AppleSmartphone(String brand, String os) {
        this.brand = brand;
        this.os = os;
    }

    public void created() {
        System.out.println("Crated " + brand + " Smartphone with " + os);
    }
}
