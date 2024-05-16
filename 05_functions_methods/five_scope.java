public class five_scope {
    public static void main(String[] args) {
        int a = 34;
        int b = 32;
        // System.out.println(marks);

        {
            //int a = 598; already initialised outside the block in the same function so cant be initialised again

            a =100; 

            int c = 99;
            // values initialised in this block will remain in this block
        }

        //System.out.println(c); // cannot use outside the block

        System.out.println(a); // 100 original value is changed
    }

    static void random(int marks){
        int num = 78;
        System.out.println(num);
        System.out.println(marks);
    }
}

// anything initialised outside can be used inside the block (can be updated and change would be made in the original) but anything initialised inside cannot be used outside the block

// anything initialised outside the block cannot be initialised again inside the block but anything initialised inside the block can be initialised outside the block

// every variable is valid inside its scope only