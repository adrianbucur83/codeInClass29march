package org.example;

public class ExampleFromSlide {
    public static void main(String[] args) {
        try {
            ageInMonths(Integer.parseInt(args[0]));
        } catch (NumberFormatException e) {
            System.out.println("first program argument needs to be an int");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Have a nice day!");
        }
    }

    static int ageInMonths(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age should be >= 0");
        }
        return age * 12;
    }
}
