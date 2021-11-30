package ru.prolib.auriga.server.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


@Entity
@Getter
@ToString
@EqualsAndHashCode
public class Currency {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String code;
    
    @Enumerated(EnumType.ORDINAL)
    private CurrencyType type;
    
}
