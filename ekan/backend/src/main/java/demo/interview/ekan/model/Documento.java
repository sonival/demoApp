package demo.interview.ekan.model;

import java.sql.Date;

import org.apache.tomcat.jni.Library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Documento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id long id;
    private long tipoDocumento;
    private String descrição;
    private Date dataInclusao;
    private Date dataAtualizacao;

     @ManyToOne
    // @JoinColumn(name="beneficiario_id")
    private Beneficiario beneficiario;
}
