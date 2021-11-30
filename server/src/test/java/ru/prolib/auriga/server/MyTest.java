package ru.prolib.auriga.server;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ru.prolib.auriga.server.service.AccountingService;

@SpringBootTest
class MyTest {
    @Autowired
    private AccountingService accountingService;

    @Test
    void test() {
        accountingService.listAll().forEach(x -> System.err.println("WWBEG-XX currency=" + x));
    }

}
