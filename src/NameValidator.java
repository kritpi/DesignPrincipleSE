//6510405300 Kritpiruch Chaiwong

public class NameValidator implements Validation<String> {

    @Override
    public void validate(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name should not be empty");
        }
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Name is in the wrong format");
        }
    }
   
}
