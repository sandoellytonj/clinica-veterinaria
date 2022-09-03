package academy.gama.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tutor {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String nome;

    private String telefone;

    private String endereco;

    // todo : criar relação com a tabela pacientes
}
