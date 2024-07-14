//6510405300 Kritpiruch Chaiwong

public class AgeVaildator implements Validation{Integer} {
    @Override
    public void validate(Integer age){
        if(age < 20){
            throw new IllegalArgumentException("Age should more than 20 years");
        }
    }
}
