//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//    todo Университет, Школа, Автомобиль жана Человек деген класс тузунуз
//     Алардын свойстваларын ойлоп табыныз
//     Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//     Ар бир класска 3-4 тона объект туп жана аларга маанилерин бериниз
//     Ар бир класстын объектилерин оз-озунчо массивный салып, аларды консольного чыгарыныза


//   Todo Adam _______________________________
        Person person = new Person();
        person.setName("Atai");
        person.setSurname("Abdurazakov");
        person.setAge(19);
        person.setNational("Kyrgyz");

        Person person2 = new Person();
        person2.setName("Adilet");
        person2.setSurname("Jumabekov");
        person2.setAge(20);
        person2.setNational("Kyrgyz");

        Person person3 = new Person();
        person3.setName("Babakhan");
        person3.setSurname("Narynbek uulu");
        person3.setAge(30);
        person3.setNational("Kyrgyz");

        Person[] man = {person, person2,person3};
        for (Person pers : man) {
            System.out.println("_________________");
            System.out.println(pers.getPerson());


//     Todo University_______________________________
        University university = new University();
        university.setName("AGUPKR");
        university.setAddress("Panfilova 38");

        University university2 = new University();
        university2.setName("National University");
        university2.setAddress("Frunze 45");

        University[] san = {university,university2};
            for (University univer : san) {
            System.out.println("_________________");
                System.out.println(univer.getUniversity());

            }
        }
//   Todo Adam _______________________________

        Car car = new Car();
        car.setBrand ("Toyota");
        car.setModel("Camry");
        car.setYear(2023);
        car.setColor("White");

        Car car2 = new Car();
        car2.setBrand ("Honda");
        car2.setModel("Inspire");
        car2.setYear(2022);
        car2.setColor("Yellow");

        Car car3 = new Car();
        car3.setBrand ("BMW");
        car3.setModel("X7");
        car3.setYear(2020);
        car3.setColor("Black");

        Car[] cars = {car, car2, car3};
        for (Car car1 : cars) {
        System.out.println("_________________");
            System.out.println(car1.getcar());
        }

        School school = new School();
        school.setName("Chyngyz Aitmatov");
        school.setAddress ("Kurenkeev 35");
        school.setLyceum("state");

        School school1 = new School();
        school1.setName("Alykul Ocmonov");
        school1.setAddress ("Tynystanov 178");
        school1.setLyceum("state");

        School school2 = new School();
        school2.setName("Baiymbet");
        school2.setAddress ("Togolok Voldo 247");
        school2.setLyceum("state");

        School[] schools = {school, school2,school2};
        for (School school3 : schools) {
        System.out.println("_________________");
            System.out.println(school3.getSchool());

        }
    }
}