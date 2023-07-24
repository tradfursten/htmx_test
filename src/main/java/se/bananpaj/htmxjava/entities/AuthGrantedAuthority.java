package se.bananpaj.htmxjava.entities;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AuthGrantedAuthority implements GrantedAuthority {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  private String authority;

  @ManyToOne
  @JoinColumn(name = "auth_user_detail_id")
  private AuthUserDetails authUserDetails;

  public AuthUserDetails getAuthUserDetail() {
    return authUserDetails;
  }

  public void setAuthUserDetail(AuthUserDetails authUserDetails) {
    this.authUserDetails = authUserDetails;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public String getAuthority() {
    return null;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }

}