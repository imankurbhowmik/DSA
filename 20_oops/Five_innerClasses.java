

// outside classes cannot be static
public class Five_innerClasses {
    class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }


    }

    static class imp {
        String name;

        public imp(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
//        Test a = new Test("Ankur");   this is an error since it is from a class which is dependent on another class i.e it is dependent on objects of outer class

        imp a = new imp("Ankur");
        imp b = new imp("Rahul");

        System.out.println(a.name);  // Ankur
        System.out.println(b.name);  // Rahul
        // this happens bcz imp and main classes are not dependent on objects of outer class that is Five_innerClasses but can have instances of each other


        System.out.println(a.name);
    }
}