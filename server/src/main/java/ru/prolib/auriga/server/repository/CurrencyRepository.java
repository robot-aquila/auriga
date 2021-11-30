package ru.prolib.auriga.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.prolib.auriga.server.domain.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {

}
