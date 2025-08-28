package auth.domain.service;

public interface PasswordEncoderService {
    String encode(String rawPassword);

    boolean matches(String rawPassword, String encodedPassword);
}
