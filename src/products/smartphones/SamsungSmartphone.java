package products.smartphones;

public class SamsungSmartphone implements Smartphone{
    private String brand;
    private String os;

    public SamsungSmartphone(String brand, String os) {
        this.brand = brand;
        this.os = os;
    }

    public void created() {
        System.out.println("Crated " + brand + " Smartphone with " + os);
    }
}
