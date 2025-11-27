/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.set.explorer.model;

/**
 *
 * @author daviddoherty
 */

import java.util.Map;

public class Statistics {

    private double totalValue;
    private double totalFees;
    private double buyValue;
    private double sellValue;
    private long buyCount;
    private long sellCount;
    private double averagePrice;
    private Map<String, Double> totalUnitsByAssetClass;
    private Transaction highestValueTransaction;
    private Transaction lowestFeeTransaction;

    public Statistics() {}

    // ----- Getters and Setters -----

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }

    public double getBuyValue() {
        return buyValue;
    }

    public void setBuyValue(double buyValue) {
        this.buyValue = buyValue;
    }

    public double getSellValue() {
        return sellValue;
    }

    public void setSellValue(double sellValue) {
        this.sellValue = sellValue;
    }

    public long getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(long buyCount) {
        this.buyCount = buyCount;
    }

    public long getSellCount() {
        return sellCount;
    }

    public void setSellCount(long sellCount) {
        this.sellCount = sellCount;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Map<String, Double> getTotalUnitsByAssetClass() {
        return totalUnitsByAssetClass;
    }

    public void setTotalUnitsByAssetClass(Map<String, Double> totalUnitsByAssetClass) {
        this.totalUnitsByAssetClass = totalUnitsByAssetClass;
    }

    public Transaction getHighestValueTransaction() {
        return highestValueTransaction;
    }

    public void setHighestValueTransaction(Transaction highestValueTransaction) {
        this.highestValueTransaction = highestValueTransaction;
    }

    public Transaction getLowestFeeTransaction() {
        return lowestFeeTransaction;
    }

    public void setLowestFeeTransaction(Transaction lowestFeeTransaction) {
        this.lowestFeeTransaction = lowestFeeTransaction;
    }
}

