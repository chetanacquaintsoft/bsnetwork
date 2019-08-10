package com.acquaintsoft.bsnetwork.json.ser;

import com.acquaintsoft.bsnetwork.Asset;
import com.acquaintsoft.bsnetwork.AssetPair;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class AssetPairSer extends JsonSerializer<AssetPair> {
    @Override
    public void serialize(AssetPair assetPair, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("amountAsset", Asset.toJsonObject(assetPair.getAmountAsset()));
        jsonGenerator.writeStringField("priceAsset", Asset.toJsonObject(assetPair.getPriceAsset()));
        jsonGenerator.writeEndObject();
    }
}
