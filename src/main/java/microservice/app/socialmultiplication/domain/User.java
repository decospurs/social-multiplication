package microservice.app.socialmultiplication.domain;


import java.util.Objects;

public final class User {
    private final String alias;

    public User(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(alias, user.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }
}
