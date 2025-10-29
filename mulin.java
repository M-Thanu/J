class Vehicle{
    String brand;
    int speed;

    public void displayVehicleInfo(){
        System.out.println("Brand: "+brand+"Speed: "+speed);
    }
}

class Car extends Vehicle{
    int doors;
    String fuelType;

    public void displayCarInfo(){
        System.out.println("Doors: "+doors+"Fuel: "+fuelType);
    }
}

class ElectricCar extends Car{
    int bc;
    int range;

    public void displayElectricCarInfo(){
        System.out.println("Battery: "+bc+" Range: "+range+"km");
    }
}

class Bike extends Vehicle{
    String type;
    int engineCC;

    public void displayBikeInfo(){
        System.out.println("Type: "+type+"Engine: "+engineCC);
    }
}

public class mulin{
    public static void main(String[] args){
        ElectricCar e = new ElectricCar();
        e.brand = "Tesla";
        e.speed = 200;
        e.doors = 4;
        e.fuelType = "Electric";
        e.bc=100;
        e.range=450;

        e.displayVehicleInfo();
        e.displayCarInfo();
        e.displayElectricCarInfo();

        Bike b = new Bike();
        b.brand = "Yamaha";
        b.speed=150;
        b.type="Sports";
        b.engineCC=600;

        b.displayVehicleInfo();
        b.displayBikeInfo();
    }
}