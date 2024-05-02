package factories;

import products.laptops.Laptop;
import products.laptops.SamsungLaptop;
import products.smartphones.SamsungSmartphone;
import products.smartphones.Smartphone;
import products.tablets.SamsungTablet;
import products.tablets.Tablet;

public class SamsungFactory implements DeviceFactory{
    @Override
    public Laptop createLaptop() {
        Laptop samsungLaptop = new SamsungLaptop("Samsung","Windows");
        samsungLaptop.created();
        return samsungLaptop;
    }

    @Override
    public Smartphone createSmartphone() {
        Smartphone samsungSmartphone = new SamsungSmartphone("Samsung","Android");
        samsungSmartphone.created();
        return samsungSmartphone;
    }

    @Override
    public Tablet createTablet() {
        Tablet samsungTablet = new SamsungTablet("Samsung","Android");
        samsungTablet.created();
        return samsungTablet;
    }
}
