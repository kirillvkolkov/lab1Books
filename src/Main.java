public class Main {
    public static void main(String[] args) {

        Publisher prospect = new Publisher();
        prospect.setName("Проспект");
        prospect.setCity("Москва");

        Publisher piter = new Publisher();
        piter.setName("Питер");
        piter.setCity("Санкт-Петербург");

        Publisher bhv = new Publisher();
        bhv.setName("БХВ");
        bhv.setCity("Санкт-Петебург");

        Publisher dialectica = new Publisher();
        dialectica.setName("Диалектика");
        dialectica.setCity("Киев");

        // Создадим массив из двух авторов
        String[] computerScienceAnInterdisciplinaryApproachAuthors = new String[]{"Седжвик Роберт", "Уэйн Кевин"};

        // Создадим книги
        Book computerScienceAnInterdisciplinaryApproach = new Book("Computer Science: основы программирования на Java, " +
                "ООП, алгоритмы и структуры данных", piter, 2018, computerScienceAnInterdisciplinaryApproachAuthors);

        Book softwareRequirementsDeveloperBestPractices = new Book("Разработка требований к програмному обеспечению." +
                "3-е издание, дополненное", bhv, 2019, "Вигерс Карл");

        Book theCompleteReference = new Book("Java. Полное руководство, 10-е издание", dialectica, 2018, "Шилдт Герберт");

        Book cPlusPlusProcedureProgramming = new Book("C/C++. Процедурное программирование", bhv, 2017, "Полубенцева М. И.");

        Book constitutionRF = new Book("Конституция РФ", prospect, 2020);

        // Добавим книги в коллекцию
        Book[] booksCollection = new Book[]{computerScienceAnInterdisciplinaryApproach, softwareRequirementsDeveloperBestPractices,
        theCompleteReference, cPlusPlusProcedureProgramming, constitutionRF};

        // Вот тут название города неверное
        Book.printAll(booksCollection);

        // Вызов изменится для все книг издательства потому, что мы устанавливаем новый город целого издательства, а не одной книги
        bhv.setCity("Санкт-Петербург");

        // Вот тут с Санкт-Петербургом все топчик
        Book.printAll(booksCollection);

        // Раскоментируй код ниже, чтобы проверить работу метода печати одной книги.
        //Book.print(theCompleteReference);
    }
}