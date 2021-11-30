package ru.prolib.auriga.server.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CurrencyTest {
    private Currency service;

    @BeforeEach
    void setUp() throws Exception {
        service = new Currency(159L, "RUB", CurrencyType.FIAT_MONEY);
    }

    @Test
    void testCtor_NoArgs() {
        service = new Currency();
        
        assertNull(service.getId());
        assertNull(service.getCode());
        assertNull(service.getType());
    }

    @Test
    void testCtor_AllArgs() {
        service = new Currency(123L, "USD", CurrencyType.FIAT_MONEY);
        
        assertEquals(123L, service.getId());
        assertEquals("USD", service.getCode());
        assertEquals(CurrencyType.FIAT_MONEY, service.getType());
    }

    @SuppressWarnings("unlikely-arg-type")
    @Test
    void testEquals() {
        assertTrue(service.equals(service));
        assertTrue(service.equals(new Currency(159L, "RUB", CurrencyType.FIAT_MONEY)));
        assertFalse(service.equals(null));
        assertFalse(service.equals(Integer.valueOf(15)));
        assertFalse(service.equals(new Currency(200L, "RUB", CurrencyType.FIAT_MONEY)));
        assertFalse(service.equals(new Currency(159L, "USD", CurrencyType.FIAT_MONEY)));
        assertFalse(service.equals(new Currency(159L, "RUB", CurrencyType.CRYPTOCURENCY)));
        assertFalse(service.equals(new Currency(111L, "USD", CurrencyType.CRYPTOCURENCY)));
    }

    @Test
    void testToString() {
        assertEquals("Currency(id=159, code=RUB, type=FIAT_MONEY)", service.toString());
    }

}
