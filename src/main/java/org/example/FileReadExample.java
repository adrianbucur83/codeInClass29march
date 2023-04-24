package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new
                FileReader("text.txt"));
        try {
            String firstLine = r.readLine();
        }
        catch (IOException e) {
            System.out.println("Cannot read first line from text.txt: " +
                    e.getMessage());
        } finally {
            r.close();
        }
    }
}
