package functionalinterfaces;

public class FunctionExample {

    private static int countLetters(String str) {
        return Functions.sizeOf.apply(str);
    }

    public static void main(String[] args) {
        System.out.println("Size of word 'Hellooooooooooooo' is: " + countLetters("Hellooooooooooooo"));
    }
}
