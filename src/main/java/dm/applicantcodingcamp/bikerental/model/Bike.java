package dm.applicantcodingcamp.bikerental.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bike {
    public String manufacturer;
    public int rimSize;
    public int frameSize;
    public String color;
    public boolean rented;

    @Override
    public String toString() {
        return "Bike{" + manufacturer +
                ", rimSize=" + rimSize +
                ", frameSize=" + frameSize +
                ", color='" + color + '\'' +
                ", rented=" + rented +
                '}';
    }
}
