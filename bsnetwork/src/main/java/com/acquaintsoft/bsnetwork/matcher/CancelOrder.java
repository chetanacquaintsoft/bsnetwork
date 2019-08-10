package com.acquaintsoft.bsnetwork.matcher;

import com.acquaintsoft.bsnetwork.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.nio.ByteBuffer;

import static com.acquaintsoft.bsnetwork.ByteUtils.KBYTE;

public class CancelOrder extends ObjectWithSignature implements ApiJson {
    private final PublicKeyAccount sender;
    private final AssetPair assetPair;
    private final String orderId;
    private final Long timestamp;

    public CancelOrder(PrivateKeyAccount sender, AssetPair assetPair, String orderId) {
        this.sender = sender;
        this.assetPair = assetPair;
        this.orderId = orderId;
        this.timestamp = null;
        this.signature = new ByteString(sender.sign(getBytes()));
    }

    public CancelOrder(PrivateKeyAccount sender, AssetPair assetPair, long timestamp) {
        this.sender = sender;
        this.assetPair = assetPair;
        this.orderId = null;
        this.timestamp = timestamp;
        this.signature = new ByteString(sender.sign(getBytes()));
    }

    public CancelOrder(PublicKeyAccount sender, AssetPair assetPair, String orderId, ByteString signature) {
        this.sender = sender;
        this.assetPair = assetPair;
        this.orderId = orderId;
        this.timestamp = null;
        this.signature = signature;
    }

    public CancelOrder(PublicKeyAccount sender, AssetPair assetPair, long timestamp, ByteString signature) {
        this.sender = sender;
        this.assetPair = assetPair;
        this.orderId = null;
        this.timestamp = timestamp;
        this.signature = signature;
    }

    public PublicKeyAccount getSender() {
        return sender;
    }

    @JsonIgnore
    public AssetPair getAssetPair() {
        return assetPair;
    }

    public String getOrderId() {
        return orderId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    @Override
    public byte[] getBytes() {
        ByteBuffer buf = ByteBuffer.allocate(KBYTE);
        buf.put(sender.getPublicKey());
        if (orderId != null) {
            buf.put(Base58.decode(orderId));
        } else {
            buf.putLong(timestamp);
        }
        return ByteArraysUtils.getOnlyUsed(buf);
    }

    @Override
    public PublicKeyAccount getSenderPublicKey() {
        return sender;
    }
}
