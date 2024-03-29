package com.acquaintsoft.bsnetwork.json.deser;

import com.acquaintsoft.bsnetwork.Base64;
import com.acquaintsoft.bsnetwork.ByteString;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class ByteStringDeser extends JsonDeserializer<ByteString> {
    @Override
    public ByteString deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String str = jsonParser.getValueAsString();
        if (str.startsWith("base58:")) {
            return new ByteString(str.substring(7));
        } else if (str.startsWith("base64:")) {
            return new ByteString(Base64.decode(str.substring(7)));
        } else return new ByteString(str);
    }
}
