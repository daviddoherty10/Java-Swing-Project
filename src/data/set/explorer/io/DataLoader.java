/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.set.explorer.io;

/**
 *
 * @author daviddoherty
 */

import data.set.explorer.model.Transaction;
import data.set.explorer.model.Side;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {
    public List<Transaction> load(String filePath) throws IOException {

        List<Transaction> transactions = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line = reader.readLine();
            if (line == null) {
                return transactions;
            }

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                // Split by ANY amount of whitespace
                String[] parts = line.trim().split("\\s+");

                if (parts.length != 7) {
                    System.err.println("Skipping invalid line: " + line);
                    continue;
                }

                String id = parts[0];
                String assetClass = parts[1];
                double units = Double.parseDouble(parts[2]);
                double price = Double.parseDouble(parts[3]);
                double value = Double.parseDouble(parts[4]);
                double fee = Double.parseDouble(parts[5]);
                Side side = Side.valueOf(parts[6]);  // BUY or SELL enum

                Transaction t = new Transaction(
                        id,
                        assetClass,
                        units,
                        price,
                        value,
                        fee,
                        side
                );

                transactions.add(t);
            }
        }

        return transactions;
    }
}

