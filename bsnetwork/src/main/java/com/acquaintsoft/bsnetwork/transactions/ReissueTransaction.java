package com.acquaintsoft.bsnetwork.transactions;

import com.acquaintsoft.bsnetwork.Signable;
import com.acquaintsoft.bsnetwork.Transaction;
import com.acquaintsoft.bsnetwork.WithId;

public interface ReissueTransaction extends Transaction, Signable, WithId {
    public static final byte REISSUE = 5;

    String getAssetId();

    long getQuantity();

    boolean isReissuable();
}
