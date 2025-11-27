package data.set.explorer.model;

import java.util.*;

import data.set.explorer.model.Transaction;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daviddoherty
 */
public class SummaryCalculator {
	private List<Transaction> transactions;	

    public SummaryCalculator(List<Transaction> transactions) {
        this.transactions = transactions;
    }

	public void addRecord(Transaction t){

	}
	
	public List<Transaction> getAllRecords(){
		return this.transactions;
	}

	public List<Transaction> search(String term) {
		return this.transactions;
	}

	public void getStatisics() {

	}
}
