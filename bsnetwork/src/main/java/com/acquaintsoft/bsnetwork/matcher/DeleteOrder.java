package com.acquaintsoft.bsnetwork.matcher;

import com.acquaintsoft.bsnetwork.AssetPair;
import com.acquaintsoft.bsnetwork.ByteString;
import com.acquaintsoft.bsnetwork.PrivateKeyAccount;
import com.acquaintsoft.bsnetwork.PublicKeyAccount;

public class DeleteOrder extends CancelOrder {
    public DeleteOrder(PrivateKeyAccount sender, AssetPair assetPair, String orderId) {
        super(sender, assetPair, orderId);
    }

    public DeleteOrder(PrivateKeyAccount sender, AssetPair assetPair, long timestamp) {
        super(sender, assetPair, timestamp);
    }

    public DeleteOrder(PublicKeyAccount sender, AssetPair assetPair, String orderId, ByteString signature) {
        super(sender, assetPair, orderId, signature);
    }

    public DeleteOrder(PublicKeyAccount sender, AssetPair assetPair, long timestamp, ByteString signature) {
        super(sender, assetPair, timestamp, signature);
    }
}
