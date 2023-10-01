package task2;

//            Создайте класс Студент, имеющий поля имя, фамилия и номер группы.
//            1 Напишите минимум 2 конструктора для класса Студент.
//            2 Реализуйте геттеры и сеттеры для класса Студент.
//            В сеттере сделайте проверку, что номер группы положительный.
//            В противном случае бросьте исключение throw new
//            RuntimeException(“Номер группы должен быть положительным”);
//            3 Создайте метод «перейти в следующую группу». При вызове метода студент
//            переводится в следующую по номеру группу (чтобы не сдавать экзамены).
//            4 Создайте в программе объект студента.
//            5 Добавьте клонирующий конструктор к классу Студент. В программе склонируйте
//            созданный ранее объект. Проверьте с помощью ==, что объекты имеют разные ссылки в памяти.
//            Затем измените одно из полей оригинального студента. Изменилось ли то же поле у клона?
public class Student {
    private String firstName;
    private String lastName;
    private int numberOfGroup;

    public Student(String lastName, int numberOfGroup) {
        this.lastName = lastName;
        this.numberOfGroup = numberOfGroup;
    }

    public Student(String firstName, String lastName, int numberOfGroup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfGroup = numberOfGroup;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        if (numberOfGroup <= 0) {
            throw new RuntimeException("Номер группы должен быть положительным");
        }
        this.numberOfGroup = numberOfGroup;
    }

    public void goToTheNextGroup () {
        numberOfGroup++;
    }
    public Student (Student originalStudent) {
        this.firstName = originalStudent.firstName;
        this.lastName = originalStudent.lastName;
        this.numberOfGroup = originalStudent.numberOfGroup;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ilon", "Mask", 67);
        Student student2 = new Student(student1);
        System.out.println("Student №1: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Student №2: " + student2.getFirstName() + " " + student2.getLastName());
        System.out.print("The students have the same links: " );
        System.out.println(student1==student2);
        System.out.println("Number of group: " + student1.getNumberOfGroup());
        student1.goToTheNextGroup();
        System.out.println("Your next group is: " + student1.getNumberOfGroup());
        student1.setFirstName("Antonio");
        student1.setLastName("Banderas");
        System.out.println("Student №1: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Student №2: " + student2.getFirstName() + " " + student2.getLastName());
    }

}
