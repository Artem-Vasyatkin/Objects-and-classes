public class Main {
    public static void main(String[] args) {
        String nameJohn = "John";
        int ageJohn = 13;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Имя - " + names[i] + " Возраст - " + ages[i]);
        }

        Person sarah = new Person("Sarah", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());

        Person john = new Person("John", 13);
        System.out.println("john.name = " + john.getName());
        System.out.println("john.age = " + john.getAge());
        john.setAge(14);
        System.out.println("john.getName() = " + john.getAge());

        System.out.println("Homework");

        Author sagan = new Author("Carl", "Sagan");
        Author deutsch = new Author("David", "Deutsch");

        Book book1 = new Book("A world full of demons",
                2022, sagan);
        Book book2 = new Book("The beginning of infinity",
                2021, deutsch);
        book2.setYearOfPublicationOfTheBook(2011);

        System.out.println("Название книги - " + book1.getName() + "," +
                " Год выпуска - " + book1.getYearOfPublicationOfTheBook() + "," +
                " Автор книги - " + sagan.getName() + " " + sagan.getSurname());

        System.out.println("Название - " + book2.getName() + "," +
                " Год выпуска - " + book2.getYearOfPublicationOfTheBook() + "," +
                " Автор книги - " + deutsch.getName() + " " + deutsch.getSurname());

    }



}


