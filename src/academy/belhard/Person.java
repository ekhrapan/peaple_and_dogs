package academy.belhard;

public class Person implements FullNameAvailable {
    private String firstName;
    private String lastName;
    private String patronymic;

    public Person(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    @Override
    public String getFullName() {
        return lastName + FULL_NAME_DELIMITER + firstName + FULL_NAME_DELIMITER + patronymic;
    }
}
