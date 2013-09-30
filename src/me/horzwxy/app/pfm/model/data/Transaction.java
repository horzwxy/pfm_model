package me.horzwxy.app.pfm.model.data;

import me.horzwxy.app.pfm.model.data.PFMData;
import me.horzwxy.app.pfm.model.data.User;

public class Transaction implements PFMData {

    public int id;
    public User borrower;
    public User lender;
    public int cost;
    public TransactionState state;

    public enum TransactionState {
        NOT_APPROVED,
        APPROVED,
        REJECTED,
        CLEAR;
    }
}
