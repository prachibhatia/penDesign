package org.example;

public abstract class Pen {
    private String brand;
    private String name;
    private PenType pen;
    private double price;

    protected Pen(String brand, String name, PenType pen, double price) {
        this.brand = brand;
        this.name = name;
        this.pen = pen;
        this.price = price;
    }

    public void write(){
        WritingStrategy strategy = WritingStrategyFactory.getWritingStrategy(pen);
        strategy.write();
    }
}
