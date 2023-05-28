package com.pvt;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//	Создать класс, который будет хранить в себе коллекцию животных из зоопарка,
//	являющимися наследниками класса Animal.
//	Реализовать удаление и добавление животных по следующим правилам:
//	добавляется всегда в конец, а удаляется всегда из начала (использовать параметризацию)

        AnimalList<Animal> animalList = new AnimalList<>();
        animalList.makeAnimalList();
        Animal crocodile = new Animal("Dundee", 25);
        Animal monkey = new Animal("Dust", 5);
        Animal gorilla = new Animal("Frank", 13);
        animalList.animalList.addFirst(crocodile);
        animalList.animalList.addFirst(monkey);
        animalList.animalList.addLast(gorilla);
        animalList.makeAnimalIterator();
        for (Animal animal : animalList.animalList) {
            System.out.println(animal.name + " " + animal.age);
        }
        animalList.printAnimalListIteratorName();
        animalList.makeAnimalIterator();
        animalList.printAnimalListIteratorAge();

//	Создать программу, которая позволяет пользователю вводить месяц и число его рождения, используя enum.
//	Взамен выдает его знак зодиака.
//	Создать такое количество классов и методов, которое необходимо для корректной работы программы.
//	(важно: в феврале дней не больше 29 и т.д.)

        ZodiacSigns.Aries.getLink();
        ZodiacSigns.Taurus.getLink();
        ZodiacSigns.Gemini.getLink();
        ZodiacSigns.Cancer.getLink();
        ZodiacSigns.Leo.getLink();
        ZodiacSigns.Virgo.getLink();
        ZodiacSigns.Libra.getLink();
        ZodiacSigns.Scorpio.getLink();
        ZodiacSigns.Sagittarius.getLink();
        ZodiacSigns.Capricorn.getLink();
        ZodiacSigns.Aquarius.getLink();
        ZodiacSigns.Pisces.getLink();

        TimeIntervalList timeIntervalList_s = new TimeIntervalList();
        timeIntervalList_s.makeTimeIntervalList();
        HashMapMonth hashMapMonth = new HashMapMonth();
        hashMapMonth.makeHashMapMonth();

        String month_birth = "null";
        Integer year_birth = 2020;
        Integer date_birth = 0;
        Integer month_your_birth = 0;
        Scanner scanner_date = new Scanner(System.in);
        System.out.println("Enter your date of birth");
        String date_birthday = scanner_date.nextLine();
        String[] words = date_birthday.split(" ");
        for (String word : words) {
            if (word.matches("\\d{1,2}")) {
                date_birth = Integer.valueOf(word);
            }
            if (word.matches("[a-zA-Z]+")) {
                month_birth = word;
            }
        }
        System.out.println(month_birth + " " + date_birth);
//        Iterator mapMonthIterator = hashMapMonth.MapMonth.entrySet().iterator();
//        while (mapMonthIterator.hasNext()) {
//            HashMap.Entry<Integer, String> entry_1 = (HashMap.Entry<Integer, String>) mapMonthIterator.next();}
        Set<Map.Entry<Integer, String>> set_1 = hashMapMonth.MapMonth.entrySet();
        for (Map.Entry<Integer, String> month : set_1) {
            if (month.getValue().equalsIgnoreCase(month_birth)) {
                System.out.println("month the birthday " + month.getKey());
                month_your_birth = month.getKey();
            }
        }

        Calendar DateBirthDay = new GregorianCalendar(year_birth, month_your_birth, date_birth);
//        default_all.format(Aries_date);
//        Date date_1 = DateBirthDay.getTime();

        String Zodiac_name = "this is name your zodiac";

//        Iterator<Time_Interval> timeIntervalIterator_s = timeIntervalList_s.timeIntervalList_s.iterator();
        for (Time_Interval time_interval : timeIntervalList_s.timeIntervalList_s) {
            System.out.println(time_interval.first_date.compareTo(DateBirthDay) + " " + time_interval.last_date.compareTo(DateBirthDay));
            System.out.println(time_interval.first_date.after(DateBirthDay) + " " + time_interval.last_date.before(DateBirthDay));
            if (time_interval.first_date.before(DateBirthDay) & time_interval.last_date.after(DateBirthDay)) {
                Zodiac_name = time_interval.name;
            }
        }
        //       {
        //            if (time_interval.first_date.compareTo(DateBirthDay) == 1 & time_interval.last_date.compareTo(DateBirthDay) == 1) {
        //               Zodiac_name = time_interval.name;
        //           }
        //       }
        //       System.out.println(Zodiac_name);

        ZodiacSigns zodiacSigns = ZodiacSigns.valueOf(Zodiac_name);
        System.out.println(zodiacSigns.getLink());
        ArrayList<ZodiacSigns> ZodiacSignsList = new ArrayList<>();
        ZodiacSignsList.add(ZodiacSigns.Aries);
//        Овен Aries 21 March – 20 April
//        Телец	Taurus 21 April – 21 May
//        Близнецы Gemini 22 May – 21 June
//        Рак Cancer 22 June – 22 July
//        Лев Leo 23 July – 21 August
//        Дева Virgo 22 August – 23 September
//        Весы Libra 24 September – 23 October
//        Скорпион Scorpio 24 October – 22 November
//        Стрелец Sagittarius 23 November – 22 December
//        Козерог Capricorn 23 December – 20 January
//        Водолей Aquarius 21 January – 19 February
//        Рыбы Pisces 20 February – 20 March
// Строгое соответствие должно возвращать -1 и 1;

//  Дополнительно:
//     Сделать так, чтобы в зависимости от текущей даты выводилось предсказание для конкретного знака зодиака.
//     (при помощи WebDriver, Api и т.д., любым доступным способом). За выполнение этого задание оценка - 15
        boolean b1 = false;
        int i = 1/3;
        System.out.println(i);
    }
}

