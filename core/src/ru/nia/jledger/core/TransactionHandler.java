package ru.nia.jledger.core;

public interface TransactionHandler {
    void setYear(String year);
    void start(String date, String description);
    void addPosting(String account, String amount);
    void finish();
}
