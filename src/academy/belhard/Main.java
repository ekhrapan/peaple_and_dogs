package academy.belhard;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("Леонид", "Акопян", "Юрьевич");
        Dog d = new Dog("Шарик", "Бультерьер");

        FullNameAvailable[] items = new FullNameAvailable[3];
        items[0] = p;
        items[1] = d;
        items[2] = new Dog("Красавчик", "Пикинес");

        for (FullNameAvailable item : items) {
            System.out.println(item.getFullName());
        }
    }
}
