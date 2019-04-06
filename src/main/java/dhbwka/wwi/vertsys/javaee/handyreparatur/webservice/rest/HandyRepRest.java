package dhbwka.wwi.vertsys.javaee.handyreparatur.webservice.rest;


import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import javafx.stage.Stage;
import javax.ws.rs.ApplicationPath;


/**
 *
 * @author m.ihly
 */
@ApplicationPath("api")
public class HandyRepRest extends Application {
    
   
    
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();

        // Hier für jede Webservice-Klasse eine Zeile hinzufügen
        resources.add(TaskResource.class);

        return resources;
    }

   
}
