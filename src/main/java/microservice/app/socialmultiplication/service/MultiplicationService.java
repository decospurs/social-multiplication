package microservice.app.socialmultiplication.service;

import microservice.app.socialmultiplication.domain.Multiplication;
import microservice.app.socialmultiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationService {
    Multiplication createRandomMultiplication();

    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
}
