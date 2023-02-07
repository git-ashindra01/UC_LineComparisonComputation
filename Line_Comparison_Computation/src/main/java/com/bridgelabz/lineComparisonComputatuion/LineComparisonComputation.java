package com.bridgelabz.lineComparisonComputatuion;

import java.util.Scanner;

public class LineComparisonComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = input.nextInt();
        System.out.print("Enter y1: ");
        int y1 = input.nextInt();
        System.out.print("Enter x2: ");
        int x2 = input.nextInt();
        System.out.print("Enter y2: ");
        int y2 = input.nextInt();

        Point start = new Point(x1, y1);
        Point end = new Point(x2, y2);
        Line line = new Line(start, end);

        System.out.println("Length: " + line.length());
    }
}
