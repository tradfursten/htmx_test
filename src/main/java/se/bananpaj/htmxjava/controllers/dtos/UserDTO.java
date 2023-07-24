package se.bananpaj.htmxjava.controllers.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class UserDTO {
  @NotEmpty
  @NotNull
  private String firstName;
  
  @NotEmpty
  @NotNull
  private String lastName;
  
  @NotEmpty
  @NotNull
  private String password;
  private String matchingPassword;
  
  @NotEmpty
  @NotNull
  private String email;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getMatchingPassword() {
    return matchingPassword;
  }

  public void setMatchingPassword(String matchingPassword) {
    this.matchingPassword = matchingPassword;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  // standard getters and setters
  
}