package com.acquaintsoft.bsnetwork.json.ser;

import com.acquaintsoft.bsnetwork.ByteString;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class ByteStringSer extends JsonSerializer<ByteString> {
    public ByteStringSer() {
    }

    @Override
    public void serialize(ByteString byteString, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(byteString.getBase58String());
    }
}
