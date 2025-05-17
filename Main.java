class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Puppy", 3);

        System.out.println("Name: " + myDog.name);

        System.out.println("Age: " + myDog.age);

        myDog.makeSound();
    }
}
