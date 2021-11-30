package ru.prolib.auriga.server.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@Entity
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Currency {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @NonNull
    private String code;
    
    @Enumerated(EnumType.ORDINAL)
    @NonNull
    private CurrencyType type;
    
}
