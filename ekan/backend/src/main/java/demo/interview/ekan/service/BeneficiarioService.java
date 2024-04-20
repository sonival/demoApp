package demo.interview.ekan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.interview.ekan.model.Beneficiario;
import demo.interview.ekan.repository.IBeneficiarioRepository;

@Service
public class BeneficiarioService {
    @Autowired
    private IBeneficiarioRepository repository;

    public BeneficiarioService() {
        super();
    }

    public Beneficiario cadastrarNovoBeneficiario(Beneficiario novoBeneficiario){
        return repository.save(novoBeneficiario);
    
    }
}
