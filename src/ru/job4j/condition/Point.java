package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double fx = x2-x1;
        double fy = y2-y1;
        double first = Math.pow(fx,2);
        double second = Math.pow(fy, 2);
        double total= first + second;
        double rsl = Math.sqrt (total);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}