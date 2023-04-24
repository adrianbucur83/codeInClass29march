package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {

        int myInt = getIntFromString(null);

    }

    public static int getIntFromString(String input) throws Exception {
        int result = 0;
//        try {
            result = Integer.parseInt(input);
//        } catch (IllegalArgumentException exception) {
//            System.out.println("Input is null");
//        } catch (Exception exception) {
//            System.out.println("Input is not a number. " + exception.getMessage());
//        }
        return result;

    }

}
