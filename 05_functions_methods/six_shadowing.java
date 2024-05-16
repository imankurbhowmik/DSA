public class six_shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); //90

        // int x;
        // System.out.println(x);  scope will begin when value is initialised
        // x = 40;

        int x = 40;   // class variable at line 2 is shadowed by this
        System.out.println(x);  // 40
        func();
    }

    static void func(){
        System.out.println(x); //90
    }
}


// Class-level static variable aur method-level local variable ke case mein shadowing ho sakti hai. Method ke andar jo local variable declare kiya gaya hai, woh method ke scope mein class-level variable ko shadow karega. Yeh different scopes ke concept ki wajah se possible hota hai.
