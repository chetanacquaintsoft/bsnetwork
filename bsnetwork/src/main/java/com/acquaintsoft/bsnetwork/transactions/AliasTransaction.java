package com.acquaintsoft.bsnetwork.transactions;

import com.acquaintsoft.bsnetwork.Alias;
import com.acquaintsoft.bsnetwork.Signable;
import com.acquaintsoft.bsnetwork.Transaction;
import com.acquaintsoft.bsnetwork.WithId;

public interface AliasTransaction extends Transaction, Signable, WithId {
    static final byte ALIAS = 10;

    Alias getAlias();
}
