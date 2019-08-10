package com.acquaintsoft.bsnetwork.transactions;

import com.acquaintsoft.bsnetwork.ByteString;
import com.acquaintsoft.bsnetwork.Signable;
import com.acquaintsoft.bsnetwork.Transaction;
import com.acquaintsoft.bsnetwork.WithId;

public interface TransferTransaction extends Transaction, Signable, WithId {
    static final byte TRANSFER = 4;

    String getRecipient();

    long getAmount();

    String getAssetId();

    String getFeeAssetId();

    ByteString getAttachment();
}
