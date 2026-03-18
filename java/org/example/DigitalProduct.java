package org.example;

public class DigitalProduct  extends Product{
    private double size;

    public DigitalProduct(String id, String name, double price, double size) {
        super(id, name, price);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    @Override
    public void displayInfo(){
        System.out.println("[Digital] id="+id+" name= "+name+" price= "+price+" size="+size+"MB");
    }
}
