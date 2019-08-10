package com.acquaintsoft.bsnetwork.transactions;

import com.acquaintsoft.bsnetwork.Signable;
import com.acquaintsoft.bsnetwork.Transaction;
import com.acquaintsoft.bsnetwork.WithId;

public interface LeaseCancelTransaction extends Transaction, Signable, WithId {
    public static final byte LEASE_CANCEL = 9;

    public String getLeaseId();
}
