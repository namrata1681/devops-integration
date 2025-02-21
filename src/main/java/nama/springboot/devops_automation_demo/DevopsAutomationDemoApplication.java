package nama.springboot.devops_automation_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopsAutomationDemoApplication {


	@GetMapping
	public String getMessage()
	{
		return "devops spingboot rest demo-using ci/cd pipeline!";
	}
	public static void main(String[] args) {
		SpringApplication.run(DevopsAutomationDemoApplication.class, args);
	}

}
