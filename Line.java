package Aufgabe1;

public class Line {
    // Attribute
	Point p1;
	Point p2;
	// Konstruktor
	Line ( Point p1, Point p2 ) {
		this.p1 = p1;
		this.p2 = p2;
	} 
    
	double lenght () {
	    return Math.sqrt(square(p2.x-p1.x) + square(p2.y-p1.y));
	}
	
	private double square (double x) {
		return x*x;
		
	}
    Point intersection (Line other) {
		return null;
	// Zur Berechnung des Schnittpunktes 	
	}
    
}   // class Line

// Schnittpunkt

// Test Henrik