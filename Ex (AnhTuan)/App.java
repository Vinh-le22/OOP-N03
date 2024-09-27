package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        // DisruptLecture
        DisruptLecture disruptLecture = new DisruptLecture();
        disruptLecture.disrupt();

        // TestArithmetic
        TestArithmetic arithmetic = new TestArithmetic();
        int sum = arithmetic.add(10, 5);
        int difference = arithmetic.subtract(10, 5);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        // GlyphTest
        GlyphTest glyphTest = new GlyphTest(5);
        
        // Transmogrify
        Transmogrify transmogrify = new Transmogrify();
        transmogrify.perform();  // HappyActor acts
        transmogrify.change();   // Switch to SadActor
        transmogrify.perform();  // SadActor acts
    }
}
