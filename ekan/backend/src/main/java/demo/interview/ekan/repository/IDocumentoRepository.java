package demo.interview.ekan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import demo.interview.ekan.model.Beneficiario;


public interface IDocumentoRepository  extends JpaRepository<Beneficiario,Long> {
    
}
