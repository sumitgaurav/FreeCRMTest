package com.crm.qa.Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	int counter = 0;
	int retryLimit =3;
	
/**
 *  Here we are overriding retry method from IRetryAnalyzer Interface,
 *  Because RetryAnalyzer class is implementing IRetryAnalyzer Interface
 */
	public boolean retry(ITestResult result){
		if(counter < retryLimit){
			counter++;
			return true;
		}
		return false;
	}
}
