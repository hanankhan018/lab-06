class Student extends Person {
    String studentID;

    public Student(String name, int age, String studentID) {

        super(name, age);

        this.studentID = studentID;
    }


    public void displayInfo() {

        super.displayInfo();

        System.out.println("Student ID: " + studentID);
    }
}
