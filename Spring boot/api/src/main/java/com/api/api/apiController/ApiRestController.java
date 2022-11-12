package com.api.api.apiController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiRestController {
    @RequestMapping("/hello")
	public String sayHi()
    {
		return "Hi";
    }

    @RequestMapping("/")
    public String sayHome() {
    return "Home";
    }

    @RequestMapping("callJokeApi")
    public String callJokeApi(){
        String uri="https://v2.jokeapi.dev/joke/Any";
        RestTemplate restTemplate=new RestTemplate();
        String result=restTemplate.getForObject(uri, String.class);
        System.out.println(result);
        return result;
    }
}
