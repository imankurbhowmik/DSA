public class Seven_main {
    public static void main(String[] args) {
        Seven_inheritanceBox box = new Seven_inheritanceBox();
//        Seven_inheritanceBox box2 = new Seven_inheritanceBox();
//
//        System.out.println(box.l + " " + box.h + " " + box.w + " ");

        Seven_boxWeight box3 = new Seven_boxWeight();
        System.out.println(box3.h + " " + box3.weight);


        //
        Seven_inheritanceBox box4 = new Seven_boxWeight();
//        System.out.println(box4.weight);
    //  it is actually the type of ref variable and not the type of object that determines what members can be accessed


        // there are many variables in both parent and child classes
        // we are givem acces to variables that are in ref type i.e. boxweight
        // hence we should have access to weight variable
        // this also means that the ones we are trying to access should be initialised
        // but here when the object itself is of parent type,how will we call the constructor of child class
//      so error
//        Seven_boxWeight box5 = new Seven_inheritanceBox();




        Seven_boxPrice box6 = new Seven_boxPrice();

        box.greeting();

        box4.greeting();


    }


}