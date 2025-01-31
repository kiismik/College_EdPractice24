package task_8_Store;

class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String postalCode;

    public Address(String country, String region, String city, String street, String postalCode) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
