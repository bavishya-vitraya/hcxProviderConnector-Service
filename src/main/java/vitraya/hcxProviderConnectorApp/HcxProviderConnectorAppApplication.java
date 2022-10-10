package vitraya.hcxProviderConnectorApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HcxProviderConnectorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcxProviderConnectorAppApplication.class, args);
	}

	@RequestMapping("/")
	public String checkHcxProviderConnector() {
		return "Greetings from Provider Connector";
	}
}
