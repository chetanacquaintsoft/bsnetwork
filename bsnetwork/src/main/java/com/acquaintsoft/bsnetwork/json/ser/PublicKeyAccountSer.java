package com.acquaintsoft.bsnetwork.json.ser;

import com.acquaintsoft.bsnetwork.Base58;
import com.acquaintsoft.bsnetwork.PublicKeyAccount;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class PublicKeyAccountSer extends JsonSerializer<PublicKeyAccount> {
    public PublicKeyAccountSer() {
    }

    @Override
    public void serialize(PublicKeyAccount publicKeyAccount, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(Base58.encode(publicKeyAccount.getPublicKey()));
    }
}
