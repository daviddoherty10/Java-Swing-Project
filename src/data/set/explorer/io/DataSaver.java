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
import java.io.*;
import java.util.List;

public class DataSaver {

    public static void saveToTxt(String filePath, List<Transaction> transactions) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // Write header
            bw.write("Txn_ID Asset_Class Units Price Value Fee Side");
            bw.newLine();

            for (Transaction t : transactions) {
                bw.write(String.format("%s %s %.2f %.2f %.2f %.2f %s",
                        t.getTxnId(),
                        t.getAssetClass(),
                        t.getUnits(),
                        t.getPrice(),
                        t.getValue(),
                        t.getFee(),
                        t.getSide()
                ));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
