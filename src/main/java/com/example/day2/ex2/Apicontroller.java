package com.example.day2.ex2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller {
	@Value("${varname}")
	private String name;
@GetMapping("name")
public String display()
{
	return name;
}
}
