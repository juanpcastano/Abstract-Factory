package factories;

import products.laptops.AppleLaptop;
import products.laptops.Laptop;
import products.smartphones.AppleSmartphone;
import products.smartphones.Smartphone;
import products.tablets.AppleTablet;
import products.tablets.Tablet;

public class AppleFactory implements DeviceFactory{

    @Override
    public Laptop createLaptop() {
        AppleLaptop appleLaptop = new AppleLaptop("Apple", "macOS");
        appleLaptop.created();
        return appleLaptop;
    }

    @Override
    public Smartphone createSmartphone() {
        AppleSmartphone appleSmartphone = new AppleSmartphone("Apple", "iOS");
        appleSmartphone.created();
        return appleSmartphone;
    }

    @Override
    public Tablet createTablet() {
        AppleTablet appleTablet = new AppleTablet("Apple", "iOS");
        appleTablet.created();
        return appleTablet;
    }
}
