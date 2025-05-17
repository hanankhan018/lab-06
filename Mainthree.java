class Mainthree {
    


    public static void main(String[] args) {
    
        Car myCar = new Car("Audi", 180, 2);
        Bike myBike = new Bike("dugatti", 120, "Sports");

        System.out.println("Car Details: ");
        myCar.showDetails();

        System.out.println("\n");
        System.out.println("Bike Details:");
        myBike.showDetails();
    }
}
