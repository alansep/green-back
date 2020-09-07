package br.com.green.core.repository;

import br.com.green.core.domain.model.GreenUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<GreenUser, Integer> {
}
