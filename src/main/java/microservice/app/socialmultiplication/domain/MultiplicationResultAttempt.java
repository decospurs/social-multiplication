package microservice.app.socialmultiplication.domain;


import java.util.Objects;

public final class MultiplicationResultAttempt {
    private final User user;
    private final Multiplication multiplication;
    private final int resultAttempt;

    public MultiplicationResultAttempt(User user, Multiplication multiplication, int resultAttempt) {
        this.user = user;
        this.multiplication = multiplication;
        this.resultAttempt = resultAttempt;
    }

    public User getUser() {
        return user;
    }

    public Multiplication getMultiplication() {
        return multiplication;
    }

    public int getResultAttempt() {
        return resultAttempt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationResultAttempt that = (MultiplicationResultAttempt) o;
        return resultAttempt == that.resultAttempt &&
                Objects.equals(user, that.user) &&
                Objects.equals(multiplication, that.multiplication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, multiplication, resultAttempt);
    }
}
