package data.set.explorer.ui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daviddoherty
 */


import data.set.explorer.model.Transaction;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DatasetTableModel extends AbstractTableModel {

    private final String[] columns = {
            "Txn_ID", "Asset_Class", "Units", "Price", "Value", "Fee", "Side"
    };

    private final List<Transaction> transactions = new ArrayList<>();

    public DatasetTableModel() {}

    // ---------------- TableModel Required Methods ---------------- //

    @Override
    public int getRowCount() {
        return transactions.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int col) {
        return columns[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        Transaction t = transactions.get(row);

        return switch (col) {
            case 0 -> t.getTxnId();
            case 1 -> t.getAssetClass();
            case 2 -> t.getUnits();
            case 3 -> t.getPrice();
            case 4 -> t.getValue();
            case 5 -> t.getFee();
            case 6 -> t.getSide();
            default -> null;
        };
    }

    // ---------------- Custom Methods for UI Interaction ---------------- //

    public void addTransaction(Transaction t) {
        transactions.add(t);
        fireTableRowsInserted(transactions.size() - 1, transactions.size() - 1); // refresh UI
    }

    public void removeRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < transactions.size()) {
            transactions.remove(rowIndex);
            fireTableRowsDeleted(rowIndex, rowIndex);
        }
    }

    public Transaction getTransactionAt(int rowIndex) {
        return transactions.get(rowIndex);
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }
}

