public class Two_customStackMain {
    public static void main(String[] args) throws Two_stackException{
        Two_customStack stack = new Two_customStack(5);

        stack.push(67);
        stack.push(63);
        stack.push(62);
        stack.push(61);
        stack.push(66);
        stack.push(68);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}