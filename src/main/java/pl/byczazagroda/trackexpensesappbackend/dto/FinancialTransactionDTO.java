package pl.byczazagroda.trackexpensesappbackend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import pl.byczazagroda.trackexpensesappbackend.model.FinancialTransactionType;

import java.math.BigDecimal;
import java.time.Instant;

public record FinancialTransactionDTO(Long id, BigDecimal amount, @JsonInclude(JsonInclude.Include.ALWAYS) String description,
                                      FinancialTransactionType type, Instant date, @JsonInclude(JsonInclude.Include.ALWAYS) Long categoryId) {
}
