package demo.interview.ekan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.interview.ekan.model.Beneficiario;

public interface IDocumentoRepository  extends JpaRepository<Beneficiario,Long> {
    
}
