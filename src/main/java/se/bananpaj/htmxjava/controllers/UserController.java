package se.bananpaj.htmxjava.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

import se.bananpaj.htmxjava.controllers.dtos.UserDTO;

@Controller
public class UserController {

  @GetMapping("/user/registration")
  public String showRegistrationForm(WebRequest request, Model model) {
    UserDTO userDto = new UserDTO();
    model.addAttribute("user", userDto);
    return "registration";
  }

  
}
