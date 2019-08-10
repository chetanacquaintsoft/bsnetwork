package com.acquaintsoft.bsnetwork.transactions;

import com.acquaintsoft.bsnetwork.Signable;
import com.acquaintsoft.bsnetwork.Transaction;
import com.acquaintsoft.bsnetwork.WithId;

public interface BurnTransaction extends Transaction, Signable, WithId {
    static final byte BURN = 6;

    String getAssetId();

    long getAmount();
}
