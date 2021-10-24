package io.lightfeather.springtemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// imports for JSON parsing
import java.nio.file.Paths;
import java.net.URL;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class SupervisorController {

	@GetMapping("/supervisors")
	public Supervisor supervisor() {
        Supervisor supervisor = new Supervisor();

		try {
		    // create object mapper instance
		    ObjectMapper mapper = new ObjectMapper();

		    // convert JSON file to map
		    Map<?, ?> map = mapper.readValue(
		    					new URL("https://jonmorbucket.s3.us-west-2.amazonaws.com/resources/supervisor.json"),
		    					Map.class	
		    				);
		    // print map entries
		    for (Map.Entry<?, ?> entry : map.entrySet()) {
		        supervisor.setId((int) entry.getValue());
		    }
		    System.out.println(supervisor);

		} catch (Exception ex) {
		    ex.printStackTrace();
		}
		return supervisor;
	}
}