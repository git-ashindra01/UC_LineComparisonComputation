package com.bridgelabz.lineComparisonComputatuion;

import java.lang.Math;

public class LineComparisonComputation {
    public static void main(String[] args) {
        int x1 = 0, y1 = 0, x2 = 3, y2 = 4;
        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of Line: " + length);
    }
}
