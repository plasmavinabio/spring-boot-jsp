package training.spring.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SpringBootJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJspApplication.class, args);
	}
	@RequestMapping("/hehe")
	public String hehe() {
		return "index";
	}
}
