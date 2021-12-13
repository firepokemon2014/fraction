/**
 * Anna Staib
 * December 3, 2021
 * CSC 144
 * Fraction Class
 */

// TO−DO: Add a package statement.
package edu.cornellcollege.fraction;

public class Fraction {

    // TO−DO: The numerator of the fraction.
    private final int numerator;

    // TO−DO: The denominator of the fraction.
    private final int denominator;

    // TO−DO: Creating a Fraction class.
    public Fraction(int numerator, int denominator) {
        // TO−DO: Complete the definition of this constructor.
        // Represent the fraction in the simplest form:
        // for example, 2/3 instead of 4/6 or 18/27.
        // Reduce a fraction to its simplest form by
        // dividing the numerator and denonimator by
        // the greatest common divisor of the two
        // numbers. Use the gcd () method ( defined below )
        // to compute the greatest common divisor.
        
        int cd = gcd(numerator, denominator);
        
        this.numerator = numerator / cd;
        this.denominator = denominator / cd;
        
    } // Fraction ( int, int )

    // Do not define getters or setters for this exercise.
    
    // TO−DO: Adding two fractions together. Looked at the code for this on the website 
    // https://codippa.com/how-to-work-with-fractions-in-java/
    public Fraction add(Fraction otherFraction) {
        // This is a stub method.
        
        // TO−DO: Complete the definition of this method.
        
        int num = (this.numerator * otherFraction.denominator) + (otherFraction.numerator * this.denominator);
        int denom = this.denominator * otherFraction.denominator;        
        
        // For example : a/b + c/d = ( ad + cb ) / ( bd )
        return new Fraction(num, denom);
    } // add (Fraction)
    
    // Do not define methods for subtraction, multiplication,
    // or division−−−but convince yourself that doing this
    // would not be hard.
    
    // TO−DO: How to print a Fraction class.
    @Override
    public String toString() {
        // This is a stub method.
        
        // TO−DO: Complete the definition of this method.
        
        return numerator + "/" + denominator;
    } // toString( )
    
    // TO−DO: Getting the greatest common divisor.
    private int gcd(int a, int b) {
        // This is a ”helper” method.
        // It helps constructors or other methods within
        // the class do their jobs.
        // Because all calls to this method will
        // be within this class, the method can be
        // private.
    
        // Compute the greatest common divisor
        // of a and b recursively.
    
        // For example: gcd ( 12, 8) = 4
    
        // A recursive method has an if statement
        // and a call to itself.
    
        if (b == 0) {
            // Here is where the recursion stops.
            return a;
        } // if
        else {
            // Here is where the gcd ( ) method
            // calls the gcd ( ) method−−−this is
            // the recursive call.
            return gcd(b, a % b);
        } // else
    } // gcd ( int , int )

    public static void main(String[] args) {
        // Test the methods of the Fraction class.
        Fraction a = new Fraction(12, 20);
        Fraction b = new Fraction(6, 20);
        
        // TO−DO: Add code to produce the sum of a and b.
        Fraction c = a.add(b);
        // TO−DO: Add code to print a, b, and the sum of a and b.
        System.out.println("Fraction a");
        System.out.println(a);
        System.out.println("Fraction b");
        System.out.println(b);
        System.out.println("Fraction c");
        System.out.println(a + " + " + b + " = " + c);
    } // main( String [])

} // Fraction
