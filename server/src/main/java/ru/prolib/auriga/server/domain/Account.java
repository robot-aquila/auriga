package ru.prolib.auriga.server.domain;

import java.util.Objects;

public enum Account {

    A01_ASSETS(AccountType.REAL),
    A99_REST(AccountType.NOMINAL)

    ;

    private final AccountType type;

    Account(AccountType type) {
        this.type = Objects.requireNonNull(type);
    }

    public AccountType getType() {
        return type;
    }
}
