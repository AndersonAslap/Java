package br.com.andersonpaiva.gestao_vagas.modules.candidate.controllers;

import br.com.andersonpaiva.gestao_vagas.exceptions.UserFoundException;
import br.com.andersonpaiva.gestao_vagas.modules.candidate.models.CandidateEntity;
import br.com.andersonpaiva.gestao_vagas.modules.candidate.repository.ICandidateRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private ICandidateRepository candidateRepository;

    @PostMapping
    public CandidateEntity create(@Valid @RequestBody CandidateEntity candidateEntity) {
        this.candidateRepository
                .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });

        return this.candidateRepository.save(candidateEntity);
    }
}
