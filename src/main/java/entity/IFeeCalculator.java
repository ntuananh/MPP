package main.java.entity;

public interface IFeeCalculator {

    public abstract double calcFee(Shipment s, Discount d);
}
