package ro.ubb.dp1819.lab2.exercises.implementorBridge;

import ro.ubb.dp1819.lab2.exercises.Car;
import ro.ubb.dp1819.lab2.exercises.component.CarComponent;
import ro.ubb.dp1819.lab2.exercises.implementorBridge.Manufacturer;

import java.util.List;

public class SportsCar extends Car {
    private List<CarComponent> components;

    public SportsCar(List<CarComponent> components, Manufacturer manufacturer){
        super(manufacturer);
        this.components = components;
    }

    @Override
    public void show() {
        this.manufacturer.showCar(this.components);
    }

    public List<CarComponent> getComponents() {
        return components;
    }
}
