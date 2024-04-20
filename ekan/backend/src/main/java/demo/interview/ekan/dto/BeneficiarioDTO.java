package demo.interview.ekan.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BeneficiarioDTO {
    private String nome;
    private LocalDateTime dataNascimento;
}
