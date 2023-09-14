package com.csc205.project1;

/* Here is what I put into chat GPT to get this:

in java, write a class that represents a point on a cartesian plane. include the following methods:

setX(double x), setY(double y), setPoint(double x, double y) - set the coordinates of the point.

shiftX(double n), shiftY(double n) - shift a point by a given amount along one of the axes.

distance(Point p2) - finds the distance to point p2.

rotate(double angle) - rotates the point by a specified angle around the origin. The formula for rotation is as follows:
x′=xcos(θ)−ysin(θ)
y′=xsin(θ)+ycos(θ)

*/

public class Point {
    private double x;
    private double y;

    public Point() {
        // Default constructor initializes the point at the origin (0, 0)
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {
        double deltaX = p2.x - this.x;
        double deltaY = p2.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public void rotate(double angle) {
        double cosTheta = Math.cos(angle);
        double sinTheta = Math.sin(angle);
        double newX = this.x * cosTheta - this.y * sinTheta;
        double newY = this.x * sinTheta + this.y * cosTheta;
        this.x = newX;
        this.y = newY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void shiftX(double n) {
        this.x += n;
    }

    public void shiftY(double n) {
        this.y += n;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}


