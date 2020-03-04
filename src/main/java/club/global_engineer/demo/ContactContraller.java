package club.global_engineer.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContactContraller {

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	@ResponseBody
	public String check() {
		return "AAAAAAA";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	@ResponseBody
	public String confirm() {
		return "BBBBBB";
	}

}
