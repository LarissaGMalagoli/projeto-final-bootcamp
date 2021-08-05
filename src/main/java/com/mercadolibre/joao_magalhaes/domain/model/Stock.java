package com.mercadolibre.joao_magalhaes.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Stock {
    @Id
    private Long number;
    @ManyToOne
    private Product product;
    private Float currentTemperature;
    private Float minimumTemperature;
    private int initialQuantity;
    private int currentQuantity;
    private String manufacturingDate;
    private String manufacturingTime;
    private String dueDate;

    public Stock(Long number,
                 Product product,
                 Float currentTemperature,
                 Float minimumTemperature,
                 int initialQuantity,
                 int currentQuantity,
                 String manufacturingDate,
                 String manufacturingTime,
                 String dueDate) {
        this.number = number;
        this.product = product;
        this.currentTemperature = currentTemperature;
        this.minimumTemperature = minimumTemperature;
        this.initialQuantity = initialQuantity;
        this.currentQuantity = currentQuantity;
        this.manufacturingDate = manufacturingDate;
        this.manufacturingTime = manufacturingTime;
        this.dueDate = dueDate;
    }
}
