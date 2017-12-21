package com.atsistemas;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/api/**")
@RestController
public class MessageController {

    private Message message = new Message("Hello world");

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Message index() {
        return this.message;
    }
    @RequestMapping(method = RequestMethod.POST,
        produces = {MediaType.APPLICATION_JSON_VALUE},
        consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Message persist(@RequestBody Message message) {
        this.message = message;
        return this.message;
    }
}
