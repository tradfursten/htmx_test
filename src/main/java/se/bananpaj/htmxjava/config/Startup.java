package se.bananpaj.htmxjava.config;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import se.bananpaj.htmxjava.entities.AuthGrantedAuthority;
import se.bananpaj.htmxjava.entities.AuthUserDetails;
import se.bananpaj.htmxjava.repositories.AuthGrantedAuthorityRepository;
import se.bananpaj.htmxjava.repositories.AuthUserDetailsRepository;

@Configuration
public class Startup {
  
  @Autowired
  private AuthUserDetailsRepository authUserDetailsRepository;

  @Autowired
  private AuthGrantedAuthorityRepository authGrantedAuthorityRepository;

  @Autowired
  private PasswordEncoder passwordEncoder;


  // initialize the user in DB
  @Bean
  public CommandLineRunner initializeJpaData() {
    return (args)->{
      System.out.println("application started");

      //uncomment if required

      AuthUserDetails user2 = new AuthUserDetails();
      user2.setUsername("user");
      user2.setPassword(passwordEncoder.encode("password"));
      user2.setEnabled(true);
      user2.setCredentialsNonExpired(true);
      user2.setAccountNonExpired(true);
      user2.setAccountNonLocked(true);

      AuthGrantedAuthority grantedAuthority = new AuthGrantedAuthority();
      grantedAuthority.setAuthority("USER");
      grantedAuthority.setAuthUserDetail(user2);
      authUserDetailsRepository.save(user2);
      authGrantedAuthorityRepository.save(grantedAuthority);
      user2.setAuthorities(Collections.singleton(grantedAuthority));
    };

  }
}
