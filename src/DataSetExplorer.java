/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daviddoherty
 */

import data.set.explorer.ui.*;
	
	
public class DataSetExplorer {
	public static void main(String[] args){
		DatasetTableModel datasetTableModel = new DatasetTableModel("/Users/daviddoherty/TUD/2nd Year/OOPs/Data Set Explorer/Doherty_David.txt");
		MainFrame mainFrame = new MainFrame(datasetTableModel);
		mainFrame.setVisible(true);
	}
}
