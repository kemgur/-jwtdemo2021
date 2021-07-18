package jwt21;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping("/students")
	public String firstPage() {
		return "Hi students, we are leraning JWT...";
		
	
	
	}
}
