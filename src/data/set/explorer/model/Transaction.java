/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.set.explorer.model;

/**
 *
 * @author daviddoherty
 */
public class Transaction {
    private final String txnId;
    private final String assetClass;
    private final double units;
    private final double price;
    private final double value;
    private final double fee;
    private final Side side; // "Buy" or "Sell"

    public Transaction(
            String txnId,
            String assetClass,
            double units,
            double price,
            double value,
            double fee,
            Side side
    ) {
        this.txnId = txnId;
        this.assetClass = assetClass;
        this.units = units;
        this.price = price;
        this.value = value;
        this.fee = fee;
        this.side = side;
    }

    public String getTxnId() {
        return txnId;
    }

    public String getAssetClass() {
        return assetClass;
    }

    public double getUnits() {
        return units;
    }

    public double getPrice() {
        return price;
    }

    public double getValue() {
        return value;
    }

    public double getFee() {
        return fee;
    }

    public String getSide() {
        return side;
    }

    @Override
    public String toString() {
        return txnId + " " +
               assetClass + " " +
               units + " " +
               price + " " +
               value + " " +
               fee + " " +
               side;
    }
}
