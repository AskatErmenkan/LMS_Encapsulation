public class Person {
    //
    private String name;
    private String surname;
    private int age;
    private String national;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }
    public String getPerson(){
        return String.format("""
                name: = %s
                surname: = %s
                age: = %s
                national: = %s
                """, name, surname, age, national);
    }
}
