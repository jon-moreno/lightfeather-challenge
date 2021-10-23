package io.lightfeather.springtemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupervisorController {

	@GetMapping("/supervisors")
	public Supervisor supervisor() {
		return new Supervisor(1);
	}
}