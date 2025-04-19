package Benda.Laptop;

public class Toshiba implements Laptop {
    private int volume;
    private boolean isOn;
    
    public Toshiba() {
        this.volume = 50;
        this.isOn = false;
    }

    public void powerOn() {
        isOn = true;
        System.out.println("Toshiba is ON");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("Toshiba is OF");
    }

    public void VolumeUp() {
        if (isOn) {
            volume++;
            System.out.println("Toshiba volume:" +volume);
        } else {
            System.out.println("Turn on the Toshiba laptop first");
        }
    }

    public void VolumeDown() {
        if (isOn) {
            volume--;
            System.out.println("Toshiba volume:" +volume);
        } else {
            System.out.println("Turn on the Toshiba laptop first");
        }
    }
}
