package products.smartphones;

public class HpSmartphone implements Smartphone{
    private String brand;
    private String os;

    public HpSmartphone(String brand, String os) {
        this.brand = brand;
        this.os = os;
    }

    public void created() {
        System.out.println("Crated " + brand + " Smartphone with " + os);
    }
}
