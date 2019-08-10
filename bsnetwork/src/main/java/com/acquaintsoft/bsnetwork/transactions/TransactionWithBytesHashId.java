package com.acquaintsoft.bsnetwork.transactions;

import com.acquaintsoft.bsnetwork.ByteString;
import com.acquaintsoft.bsnetwork.Transaction;

import static com.acquaintsoft.bsnetwork.ByteUtils.hash;

public abstract class TransactionWithBytesHashId implements Transaction {
    public ByteString getId() {
        return new ByteString(hash(getBytes()));
    }
}
