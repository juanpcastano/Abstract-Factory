package factories;

import products.laptops.HpLaptop;
import products.laptops.Laptop;
import products.smartphones.HpSmartphone;
import products.smartphones.Smartphone;
import products.tablets.HpTablet;
import products.tablets.Tablet;

public class HpFactory implements DeviceFactory{
    @Override
    public Laptop createLaptop() {

        Laptop hpLaptop = new HpLaptop("HP", "Windows");
        hpLaptop.created();
        return hpLaptop;
    }

    @Override
    public Smartphone createSmartphone() {
        Smartphone hpSmartphone = new HpSmartphone("HP", "Android");
        hpSmartphone.created();
        return hpSmartphone;
    }

    @Override
    public Tablet createTablet() {
        Tablet hpTablet = new HpTablet("HP", "Android");
        hpTablet.created();
        return hpTablet;
    }
}
