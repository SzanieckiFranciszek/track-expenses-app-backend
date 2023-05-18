package pl.byczazagroda.trackexpensesappbackend.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public record WalletCreateDTO(@NotBlank @Size(max = 20) @Pattern(regexp = "[\\w ]+") String name, Long userId) {
}
