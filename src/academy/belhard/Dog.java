package academy.belhard;

public class Dog implements FullNameAvailable {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String getFullName() {
        return name + FULL_NAME_DELIMITER + breed;
    }
}
