package java_homework3;

import java.util.*;

public class Main {
//1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.
//Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}

//    public static void main(String[] args) {
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Яблоко");
//        list.add("11");
//        list.add("13");
//        list.add("Апельсин");
//        list.add("Дыня");
//        list.add("17");
//
//        System.out.println("Исходный список: " + list);
//
//        list.removeIf(str -> {
//            try {
//                Integer.parseInt(str);
//                return true;
//            } catch (NumberFormatException e) {
//                return false;
//            }
//        });
//
//        System.out.println("Список после удаления чисел: " + list);
//    }
//___________________________________________________________________________________________________


//2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
// что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
// Напишите метод для заполнения данной структуры(можно через консоль).
//Пример:
//"Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
//"Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
//"Детектив", "Десять негритят".
//"Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".

//    public static void main(String[] args) {
//        List<ArrayList<String>> catalog = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Введите название жанра (или \"exit\" для выхода):");
//            String genre = scanner.nextLine();
//
//            if (genre.equals("exit")) {
//                break;
//            }
//            ArrayList<String> genreBooks = new ArrayList<>();
//
//            while (true) {
//                System.out.println("Введите название книги (или \"exit\" для выхода):");
//                String book = scanner.nextLine();
//
//                if (book.equals("exit")) {
//                    break;
//                }
//
//                genreBooks.add(book);
//            }
//            genreBooks.add(0, genre);
//            catalog.add(genreBooks);
//        }
//
//        for (ArrayList<String> genreBooks : catalog) {
//            System.out.println(genreBooks);
//        }
//    }
//___________________________________________________________________________________________________

    public static void main(String[] args) {

        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
        System.out.println(randomSolarSystem);

        Iterator<String> iterator = randomSolarSystem.iterator();
        while (iterator.hasNext()) {
            String currentElement = iterator.next();
            int occurrences = Collections.frequency(randomSolarSystem, currentElement);
            if (occurrences > 1) {
                iterator.remove();
            }
        }
        System.out.println(randomSolarSystem);

    }

}

