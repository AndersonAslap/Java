package br.com.andersonpaiva.gestao_vagas.modules.candidate.usecases;

import br.com.andersonpaiva.gestao_vagas.exceptions.UserFoundException;
import br.com.andersonpaiva.gestao_vagas.modules.candidate.models.CandidateEntity;
import br.com.andersonpaiva.gestao_vagas.modules.candidate.repository.ICandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidateUseCase {

    @Autowired
    private ICandidateRepository candidateRepository;

    public CandidateEntity execute(CandidateEntity candidateEntity) {
        this.candidateRepository
                .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });

        return this.candidateRepository.save(candidateEntity);
    }
}
