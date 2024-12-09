import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.print("Enter some letters : ");
            int letters = isr.read();
            while(isr.ready()) {
                System.out.println((char)letters);
                letters = isr.read();
            }
//            isr.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        try(FileReader fr = new FileReader("notes.txt")) {
            int letters = fr.read();
            while(fr.ready()) {
                System.out.println((char)letters);
                letters = fr.read();
            }
            System.out.println();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // byte to char stream and then reading char stream


        // efficient
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("You typed : "+ br.readLine());
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }


        try(BufferedReader br1 = new BufferedReader(new FileReader("notes.txt"))) {
            while(br1.ready()) {
                System.out.println(br1.readLine());
            }
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }



        // output
        OutputStream os = System.out;
//        os.write(😘);   range exceeded

        System.out.println();


        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("HelloWorld");
            osw.write(7);
            osw.write('A');
            osw.write('\n');
            char[] arr = "Hello World".toCharArray();
            osw.write(arr);
//            os.write(😘);
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }


        try(FileWriter fw = new FileWriter("notes.txt")) {
            fw.write("HelloWorld");  // replaces anything written in txt file with this text and can put boolean append true or false in the argument for appending with the already written text in the file
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }

        //efficient
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt"))) {
            bw.write("Hello my name is Ankur Bhowmik");
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }



        // file class
        try{
            File fo = new File("notes-file.txt");
            fo.createNewFile();   // creates a new file
            // deleting
//            if(fo.delete()){
//                System.out.println(fo.getName());
//            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // write in the file
        try{
            FileWriter fw1 = new FileWriter("notes-file.txt");
            fw1.write("we can write in any language here");
            fw1.close();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }

        // read in the file
        try{
            BufferedReader br2 = new BufferedReader(new FileReader("notes-file.text"));
            while(br2.ready()) {
                System.out.println(br2.readLine());
            }
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }


}