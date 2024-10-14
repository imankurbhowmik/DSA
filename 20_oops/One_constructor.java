import java.util.Arrays;


public class One_constructor {
    public static void main(String[] args) {

        // stores 5 roll nos
        int[] numbers = new int[5];

        // stores five names
        String[] names = new String[5];

        // data of 5 students
        int[] rollnos = new int[5];
        String[] naams = new String[5];
        float[] marks = new float[5];


        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students)); // [null, null,null,null,null,]

        Student Ankur;
        Ankur = new Student(4, "Ankur", 86.4f);


        Student random = new Student(Ankur);

        Student random2 = new Student();
        System.out.println(random2.naams);
//        Ankur.rollnos = 64;
//        Ankur.naams = "Ankur";
//        Ankur.marks = 86.4f;

//        Ankur.changeName("Babu");
//        Ankur.greeting();


        System.out.println(Ankur.rollnos);   // 0  //64
        System.out.println(Ankur.naams);  // null   //Ankur
        System.out.println(Ankur.marks);  // 0.0   //90.0

        System.out.println(random.rollnos);   // 0  //64
        System.out.println(random.naams);  // null   //Ankur
        System.out.println(random.marks);

        Student one = new Student();
        Student two = one;

        one.naams = "Govind";
        System.out.println(two.naams);
     }

    // create a class
    // for every single student

    static class Student {
        int rollnos;
        String naams;
        float marks = 90.0f;


        void changeName(String newName) {
            naams = newName;
        }

        void greeting() {
            System.out.println("Hello my name is" + naams);
        }


        Student(Student other) {
            this.rollnos = other.rollnos;
            this.naams = other.naams;
            this.marks = other.marks;

        }

        // we need a way to add these values of above props object by object

        Student() {
    //        this.naams = "Ankur";
    //        this.rollnos = 64;
    //        this.marks = 86.4f;


            // this is how u call another constructor from a constructor
            // internally : new Student(13, "kuku", 90.9f);
            this(13, "kuku", 90.9f);
        }


        // One_constructor.Student arpit = new One_constructor.Student (56, "Arpit", 90.8f)
        // here this will be replaced by arpit
        Student(int roll, String name, float marks) {
            this.rollnos = roll;
            this.naams = name;
            this.marks = marks;
        }
    }
}