package org.p2p.solanaj.rpc.types.config;

import lombok.Setter;

@Setter
public class TransactionConfig {

    private String encoding = "json";

    private int maxSupportedTransactionVersion = 0;

    private String commitment;
}
