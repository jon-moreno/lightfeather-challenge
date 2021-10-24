package io.lightfeather.springtemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// imports for JSON parsing
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class SupervisorController {

	@GetMapping("/supervisors")
	public ArrayList<Supervisor> supervisor() {
        ArrayList<Supervisor> supervisors = new ArrayList<Supervisor>();

		try {
		    // create object mapper instance
		    ObjectMapper mapper = new ObjectMapper();

		    // convert JSON file to List
		    supervisors = (ArrayList<Supervisor>) mapper.readValue(
		    		new URL("https://jonmorbucket.s3.us-west-2.amazonaws.com/resources/supervisors.json"),
		    		new TypeReference<List<Supervisor>>() {}
                );

		} catch (Exception ex) {
		    ex.printStackTrace();
		}
		return supervisors;
	}

}