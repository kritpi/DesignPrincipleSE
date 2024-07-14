//6510405300 Kritpiruch Chaiwong

class DomainValidator implements Validation<String> {
    private static final List<String> notAllowDomains = Arrays.asList("dom1.cc", "dom2.cc", "dom3.cc");

    @Override
    public void validate(String email) {
        String domain = email.split("@")[1];
        if (notAllowDomains.contains(domain)) {
            throw new IllegalArgumentException("Domain Email is not allowed");
        }
    }
}
