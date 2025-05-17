class GraduateStudent extends Student {

    String researchTopic;

    public GraduateStudent(String name, int age, String studentID, String researchTopic) {

        super(name, age, studentID);

        this.researchTopic = researchTopic;
    }


    public void displayInfo() {

        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}
