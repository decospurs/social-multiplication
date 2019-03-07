package microservice.app.socialmultiplication.controller;

import microservice.app.socialmultiplication.service.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicationController {
    private final MultiplicationService multiplicationService;
    @Autowired
    public MultiplicationController(final MultiplicationService
                                             multiplicationService) {
        this.multiplicationService = multiplicationService;
    }
}
