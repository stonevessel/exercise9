abstract class Contacts {
private String name;

    public Contacts(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                '}';
    }

    abstract public void contactInfo();

}
