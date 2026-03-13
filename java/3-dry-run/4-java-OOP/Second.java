public class Second {
    public static void main (String[] args) {
        Student myStudent = new Student();
        System.out.println("Firstame: " + myStudent.fname);
        System.out.println("Age: " + myStudent.age);
        myStudent.study();
        System.out.println("Graduation year: " + myStudent.graduationYear);
    }
}