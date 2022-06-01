public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static String fullName;

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        fullName = firstName + " " + lastName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудников для заполнения отчета - " + fullNameUpper);
    }
    public static void task3() {
        String fullName1 = "Иванов Семён Семёнович.";
        String fullName2 = fullName1.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName2);
    }
}
