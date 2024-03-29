package com.acquaintsoft.bsnetwork.json.deser;

import com.acquaintsoft.bsnetwork.Alias;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class AliasDeser extends JsonDeserializer<Alias> {
    private byte chainId;

    public AliasDeser(byte chainId) {
        this.chainId = chainId;
    }

    @Override
    public Alias deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return Alias.fromRawString(jsonParser.getValueAsString(), chainId);
    }
}
