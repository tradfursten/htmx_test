package se.bananpaj.htmxjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import se.bananpaj.htmxjava.entities.AuthGrantedAuthority;

public interface AuthGrantedAuthorityRepository extends JpaRepository<AuthGrantedAuthority, Long> {
}
