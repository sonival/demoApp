package demo.interview.ekan.model;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data

public class Beneficiario implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id long id;
    @NonNull
    @Column(nullable = false)
    private String nome;
    @NonNull
    @Column(nullable = false)
    private String telefone;
    private Date dataNascimento;

    @CreatedDate
    @Column(name = "data_inclusao")
    @CreationTimestamp(source = SourceType.DB)
    private LocalDateTime dataInclusao;

    @LastModifiedDate
    private LocalDateTime dataAtualizacao;

    @OneToMany(mappedBy = "beneficiario")
    private List<Documento> documentos;

    @Override
    public String toString() {
        return "MyObject{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", dataInclusao=" + dataInclusao +
                ", dataAtualizacao=" + dataAtualizacao +
                '}';
    }

    @PrePersist
    protected void onCreate() {

        dataInclusao = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
       
        dataAtualizacao = LocalDateTime.now();
    }
}
