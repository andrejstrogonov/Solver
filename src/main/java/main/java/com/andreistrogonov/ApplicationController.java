package main.java.com.andreistrogonov;


import main.java.com.andreistrogonov.basicstructures.LPStructure;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

  @GetMapping("/sum")
  public boolean sumResult(){
      return LPStructure.sum(true,false);
  }
  @GetMapping("/multiplication")
    public boolean multiplicationResult(){
      return LPStructure.multiplication(true,false);
  }
  @GetMapping("/implication")
    public boolean implicationResult(){
      return LPStructure.implication(true,false);
  }

}
