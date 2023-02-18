package org.example;

public class Client {
    public static void main(String[] args) {
        Pen pen = new GelPen("Renolds","DancingPen",PenType.GEL_PEN,12.5);
        pen.write();
    }
}
