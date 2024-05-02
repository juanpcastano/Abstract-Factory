import factories.AppleFactory;
import factories.DeviceFactory;
import factories.HpFactory;
import factories.SamsungFactory;
import products.laptops.Laptop;
import products.smartphones.Smartphone;
import products.tablets.Tablet;

public class Main {
    public static void main(String[] args) {

        DeviceFactory appleFactory = new AppleFactory();
        DeviceFactory samsungFactory = new SamsungFactory();
        DeviceFactory hpFactory = new HpFactory();

        Smartphone iPhone = appleFactory.createSmartphone();
        Tablet iPad = appleFactory.createTablet();
        Laptop macBook = appleFactory.createLaptop();

        Smartphone galaxy = samsungFactory.createSmartphone();
        Tablet galaxyTab = samsungFactory.createTablet();
        Laptop samsungLaptop = samsungFactory.createLaptop();

        Smartphone hpPhone = hpFactory.createSmartphone();
        Tablet hpTablet = hpFactory.createTablet();
        Laptop HPPavilionGamingLaptop15dk1xxx = hpFactory.createLaptop();
    }
}