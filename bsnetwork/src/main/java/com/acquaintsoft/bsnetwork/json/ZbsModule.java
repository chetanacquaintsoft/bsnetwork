package com.acquaintsoft.bsnetwork.json;

import com.acquaintsoft.bsnetwork.*;
import com.acquaintsoft.bsnetwork.json.deser.*;
import com.acquaintsoft.bsnetwork.json.ser.*;
import com.acquaintsoft.bsnetwork.matcher.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class ZbsModule extends SimpleModule {
    public ZbsModule(byte chainId, ObjectMapper objectMapper) {
        addDeserializer(PublicKeyAccount.class, new PublicKeyAccountDeser(chainId));
        addDeserializer(ByteString.class, new ByteStringDeser());
        addDeserializer(Alias.class, new AliasDeser(chainId));
        addDeserializer(Order.Status.class, new OrderStatusDeser());
        addDeserializer(Transaction.class, new TransactionDeserializer(objectMapper));

        addSerializer(PublicKeyAccount.class, new PublicKeyAccountSer());
        addSerializer(ByteString.class, new ByteStringSer());
        addSerializer(Alias.class, new AliasSer());
        addSerializer(AssetPair.class, new AssetPairSer());
        addSerializer(Order.Type.class, new OrderTypeSer());
    }
}
