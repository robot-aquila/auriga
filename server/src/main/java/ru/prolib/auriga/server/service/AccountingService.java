package ru.prolib.auriga.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.prolib.auriga.server.domain.Currency;
import ru.prolib.auriga.server.repository.CurrencyRepository;

@Service
public class AccountingService {
    @Autowired private CurrencyRepository currencyRepository;

    public List<Currency> listAll() {
        return currencyRepository.findAll();
    }

}
