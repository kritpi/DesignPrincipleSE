//6510405300 Kritpiruch Chaiwong

import java.util.regex.Pattern;

public class EmailValidator implements Validation<String> {
    String EMAIL_PATTERN = "^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-\n" + //
                "Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$";
    Pattern valiEmailPattern = Pattern.compile(EMAIL_PATTERN);

    @Override
    public void validate(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email should not be empty");
        }
        if (!valiEmailPattern.matcher(email).matches()) {
            throw new IllegalArgumentException("Email is in the wrong format");
        }
    }
}
