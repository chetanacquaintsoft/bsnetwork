package com.acquaintsoft.bsnetwork.transactions;

import com.acquaintsoft.bsnetwork.Signable;
import com.acquaintsoft.bsnetwork.Transaction;
import com.acquaintsoft.bsnetwork.WithId;

public interface LeaseTransaction extends Transaction, Signable, WithId {
    static final byte LEASE = 8;

    String getRecipient();

    long getAmount();

    long getFee();

    long getTimestamp();
}
