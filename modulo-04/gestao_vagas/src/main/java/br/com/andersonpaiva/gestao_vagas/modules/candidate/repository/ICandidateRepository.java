package br.com.andersonpaiva.gestao_vagas.modules.candidate.repository;

import br.com.andersonpaiva.gestao_vagas.modules.candidate.models.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ICandidateRepository extends JpaRepository<CandidateEntity, UUID> {
}
