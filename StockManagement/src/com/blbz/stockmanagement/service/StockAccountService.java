package com.blbz.stockmanagement.service;

import java.io.File;

import com.blbz.stockmanagement.model.CompanyShare;

public interface StockAccountService {

	void addCompanyDetails(File file, CompanyShare companyDetails);

	void buyShare(double amount, String symbol, File file2);

	void sellShare(double amount, String symbol, File file2);

	void printReport();

	void removeCompanyDetails(String symbol);

	void printTransactionDetails();

}
