package zl.demo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class ControllerPrueba {

  @GetMapping
  public ResponseEntity<String> hetPrueba() {
    return ResponseEntity.ok("Esta es una prueba");
  }

}
