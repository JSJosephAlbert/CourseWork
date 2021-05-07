/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author zach
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        width = 0.0;
        height = 0.0;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        String output = "\nWidth: " + width;
        output += "\nHeight: " + height;
        output += "\nArea: " + getArea();
        output += "\nPerimeter: " + getPerimeter();
        return output;
    }
    
    
}
