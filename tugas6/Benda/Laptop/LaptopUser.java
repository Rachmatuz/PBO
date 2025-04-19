package Benda.Laptop;

public class LaptopUser {
    private Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }

    public void turnOnLaptop () {
        laptop.powerOn();
    }

    public void turnOffLaptop () {
        laptop.powerOff();
    }

    public void makeLaptopLouder () {
        laptop.VolumeUp();
    }

    public void makeLaptopSilence () {
        laptop.VolumeDown();
    }
}
