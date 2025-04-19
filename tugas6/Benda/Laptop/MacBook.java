package Benda.Laptop;

public class MacBook implements Laptop {
    private int volume;
    private boolean isOn;

    public MacBook() {
        this.volume = 30;
        this.isOn = false;
    }
    public void powerOn() {
        isOn = true;
        System.out.println("Macbook is ON");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("MacBook is OFF.");
    }

    public void volumeUp() {
        if (isOn) {
            volume++;
            System.out.println("MacBook volume: " + volume);
        } else {
            System.out.println("Turn on the MacBook first.");
        }
    }

    public void volumeDown() {
        if (isOn) {
            volume--;
            System.out.println("MacBook volume: " + volume);
        } else {
            System.out.println("Turn on the MacBook first.");
        }
    }
    @Override
    public void VolumeUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'VolumeUp'");
    }
    @Override
    public void VolumeDown() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'VolumeDown'");
    }

}
