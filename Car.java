class Car extends Vehicle {
    int Doors;

    public Car(String brand, int speed, int Doors) {
        super(brand, speed);
        this.Doors = Doors;
    }


    public void showDetails() {
        super.showDetails();
        System.out.println("Number of Doors: " + Doors);
    }
}
