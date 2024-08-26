package main.java.com.andreistrogonov;


import main.java.com.andreistrogonov.basicstructures.FunctionalLPStructure;
import main.java.com.andreistrogonov.basicstructures.LPStructure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonComponent;

public class LoggingController {
    private static Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @Autowired
    FunctionalLPStructure functionalLPStructure;

    @JsonComponent
    public void run(String... args){
        logger.info(LPStructure.sum(true,false));
    }
}
