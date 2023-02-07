package com.bridgelabz.lineComparisonComputatuion;

class Line implements Comparable<Line> {
    Point start;
    Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
 
    double length() {
        int xDiff = end.x - start.x;
        int yDiff = end.y - start.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Line)) {
            return false;
        }
        Line other = (Line) obj;
        return start.equals(other.start) && end.equals(other.end);
    }

    @Override
    public int compareTo(Line other) {
        return Double.compare(this.length(), other.length());
    }
}
