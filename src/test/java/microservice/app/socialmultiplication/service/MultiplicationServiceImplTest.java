package microservice.app.socialmultiplication.service;

import microservice.app.socialmultiplication.domain.Multiplication;
import microservice.app.socialmultiplication.domain.MultiplicationResultAttempt;
import microservice.app.socialmultiplication.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

public class MultiplicationServiceImplTest {
    private MultiplicationServiceImpl multiplicationService;

    @Mock
    private RandomGeneratorService randomGeneratorService;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        multiplicationService = new MultiplicationServiceImpl(randomGeneratorService);
    }

    @Test
    public void createRandomMultiplicationTest(){
        given(randomGeneratorService.generateRandomFactor()).willReturn(50,30);

        Multiplication multipliication = multiplicationService.createRandomMultiplication();

        assertThat(multipliication.getFactorA()).isEqualTo(50);
        assertThat(multipliication.getFactorB()).isEqualTo(30);
        assertThat(multipliication.getResult()).isEqualTo(1500);



    }

    @Test
    public void checkCorrectAttemptTest(){
        // given
        Multiplication multiplication = new Multiplication(50, 60);
        User user = new User("john_doe");
    MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3000);
        // when
    boolean attemptResult = multiplicationService.checkAttempt(attempt);
        // assert
        assertThat(attemptResult).isTrue();
    }

    @Test
    public void checkWrongAttemptTest() {
        // given
        Multiplication multiplication = new Multiplication(50, 60);
        User user = new User("john_doe");
    MultiplicationResultAttempt attempt = new MultiplicationResultAttempt(user, multiplication, 3010);
        // when
    boolean attemptResult = multiplicationService.checkAttempt(attempt);
        // assert
        assertThat(attemptResult).isFalse();
    }
}
