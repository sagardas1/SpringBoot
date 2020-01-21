package io.sagar.springBootStart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topic")
	public List<Topic> topic() {
		return Arrays.asList(
			new Topic("C-course",1,"programming language")	,
			new Topic("core jave",2,"opps concept")	
				);
	}

}
