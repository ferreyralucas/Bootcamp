package com.Globant.RestApplication;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


@GetMapping("/welcome/{name}")
public String welcome(@PathVariable(value="name")String name, @RequestParam(value="enterprise")String enterprise)
{
return "Hola "+name+" bienvenido a "+enterprise;
}
@PostMapping("/post")
public String post(@RequestBody String body)
{
return body;
}

}
