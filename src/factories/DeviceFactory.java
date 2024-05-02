package factories;

import products.laptops.Laptop;
import products.smartphones.Smartphone;
import products.tablets.Tablet;

public interface DeviceFactory {
    Laptop createLaptop();
    Smartphone createSmartphone();
    Tablet createTablet();
}
