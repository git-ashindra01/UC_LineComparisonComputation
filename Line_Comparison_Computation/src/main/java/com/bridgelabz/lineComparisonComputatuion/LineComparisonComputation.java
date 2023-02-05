package com.bridgelabz.lineComparisonComputatuion;

import java.lang.Math;
import java.util.Scanner;

public class LineComparisonComputation {
    int x1, y1, x2, y2;

    public LineComparisonComputation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LineComparisonComputation)) {
            return false;
        }
        LineComparisonComputation line = (LineComparisonComputation) obj;
        return this.length() == line.length();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2 for Line 1:");
        System.out.println("Enter  the x1 Co-ordinate : ");
        int x1 = scan.nextInt();
        System.out.println("Enter  the y1 Co-ordinate : ");
        int y1 = scan.nextInt();
        System.out.println("Enter  the x2 Co-ordinate : ");
        int x2 = scan.nextInt();
        System.out.println("Enter  the y2 Co-ordinate : ");
        int y2 = scan.nextInt();
        LineComparisonComputation line1 = new LineComparisonComputation(x1, y1, x2, y2);


        System.out.println("Enter x1, y1, x2, y2 for Line 2:");
        System.out.println("Enter  the x1 Co-ordinate : ");
        x1 = scan.nextInt();
        System.out.println("Enter  the y1 Co-ordinate : ");
        y1 = scan.nextInt();
        System.out.println("Enter  the x2 Co-ordinate : ");
        x2 = scan.nextInt();
        System.out.println("Enter  the y2 Co-ordinate : ");
        y2 = scan.nextInt();
        LineComparisonComputation line2 = new LineComparisonComputation(x1, y1, x2, y2);

        System.out.println("Line 1 and Line 2 are equal: " + line1.equals(line2));
    }
}
