public class Publisher {
    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
    }

    public void setCity(String city) {
        if (city == null) {
            throw new IllegalArgumentException();
        } else {
            this.city = city;
        }
    }
}
