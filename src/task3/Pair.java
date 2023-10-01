package task3;
//        Создайте класс для хранения пары строк (Pair). В классе создайте приватные поля
//        first и second. Создайте геттеры для этих полей. Создайте блок инициализации,
//        в котором выведите в консоль значение полей first и second, а затем присвойте
//        полю first значение “one”, а полю second значение «two».
//        Создайте конструктор по умолчанию (без входных параметров). Внутри конструктора
//        выведите в консоль значение полей first и second.
//        Создайте конструктор, который принимает параметры first и second и обновляет
//        значения соответствующих полей. Внутри конструктора выведите в консоль значение полей
//        first и second.
//        В программе создайте объект Pair двумя разными конструкторами.
public class Pair {
    private String first;
    private String second;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }
    {
        System.out.println("Значение полей first и second");
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        first = "one";
        second = "two";
    }
    public Pair(){
        System.out.println("Значение полей first и second");
        System.out.println("first: " + first);
        System.out.println("second: " + second);
    }

    public Pair(String first, String second) {
        this.first = first;
        this.second = second;
        System.out.println("Значение полей first и second");
        System.out.println("first: " + first);
        System.out.println("second: " + second);
    }

    public static void main(String[] args) {
        Pair pair1 = new Pair();
        Pair pair2 = new Pair("eleven", "twelve");
    }
}
