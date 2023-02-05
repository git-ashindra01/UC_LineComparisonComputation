package com.bridgelabz.lineComparisonComputatuion;

import java.util.Scanner;

public class LineComparisonComputation implements Comparable<LineComparisonComputation> {
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



    public int compareTo(LineComparisonComputation line) {
        if (this.length() < line.length()) {
            return -1;
        }
        if (this.length() > line.length()) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2 for Line 1:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        LineComparisonComputation line1 = new LineComparisonComputation(x1, y1, x2, y2);

        System.out.println("Enter x1, y1, x2, y2 for Line 2:");
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        x2 = scan.nextInt();
        y2 = scan.nextInt();
        LineComparisonComputation line2 = new LineComparisonComputation(x1, y1, x2, y2);

        int result = line1.compareTo(line2);
        if (result == 0) {
            System.out.println("Line 1 and Line 2 are equal.");
        } else if (result == -1) {
            System.out.println("Line 1 is less than Line 2.");
        } else {
            System.out.println("Line 1 is greater than Line 2.");
        }
    }
}
