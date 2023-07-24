package se.bananpaj.htmxjava.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se.bananpaj.htmxjava.entities.AuthUserDetails;

@Repository
public interface AuthUserDetailsRepository extends JpaRepository<AuthUserDetails, Long> {

  Optional<AuthUserDetails> findByUsername(String username);
  Optional<AuthUserDetails> findByPassword(String password);

}
