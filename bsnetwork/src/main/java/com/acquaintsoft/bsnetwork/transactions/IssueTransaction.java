package com.acquaintsoft.bsnetwork.transactions;

import com.acquaintsoft.bsnetwork.Signable;
import com.acquaintsoft.bsnetwork.Transaction;
import com.acquaintsoft.bsnetwork.WithId;

public interface IssueTransaction extends Transaction, Signable, WithId {
    static final byte ISSUE = 3;

    String getName();

    String getDescription();

    long getQuantity();

    byte getDecimals();

    boolean isReissuable();
}
