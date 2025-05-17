class Bike extends Vehicle {
    String helmetType;

    public Bike(String brand, int speed, String helmetType) {
        super(brand, speed);
        this.helmetType = helmetType;
    }


    public void showDetails() {
        super.showDetails();
        System.out.println("Helmet Type: " + helmetType);
    }
}
