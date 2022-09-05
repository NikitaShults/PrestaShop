package com.prestashop.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    private int attempt = 1;
    private static final int MAX_RETRY = 4;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            if (attempt < MAX_RETRY) {
                attempt++;
                iTestResult.setStatus(iTestResult.FAILURE);
                System.out.println("Retrying...");
                return true;
            } else {
                iTestResult.setStatus(iTestResult.FAILURE);
            }
        } else {
            iTestResult.setStatus(iTestResult.SUCCESS);
        }
        return false;
    }
}