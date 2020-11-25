package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

// main entry point: how someone will interact with our API
// annotation: this class defines some request mapping
// does not return a view, just data
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    // we need a way to set the ID for that greeting
    private final AtomicLong counter = new AtomicLong();

    // the RequestParam annotation helps us to pass the query parameter 'name' to the API, so it is user defined
    // like so /greeting?name=Desmond returns "Hello Desmond"
    @GetMapping("/greeting")    // GET request to this route/entry point
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        // we return a Greeting class, and jackson converts the class into a JSON containing both id and content keys
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
