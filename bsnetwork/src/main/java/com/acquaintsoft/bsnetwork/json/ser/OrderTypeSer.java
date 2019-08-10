package com.acquaintsoft.bsnetwork.json.ser;

import com.acquaintsoft.bsnetwork.matcher.Order;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class OrderTypeSer extends JsonSerializer<Order.Type> {
    @Override
    public void serialize(Order.Type type, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(type.toJson());
    }
}
