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
        System.out.println("��� ���������� - " + fullName);
    }

    public static void task2() {
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("������ ��� ����������� ��� ���������� ������ - " + fullNameUpper);
    }
    public static void task3() {
        String fullName1 = "������ ���� ��������.";
        String fullName2 = null;
        if (fullName1.contains("�")){
             fullName2 = fullName1.replace('�', '�');
        }
        System.out.println("������ ��� ����������");
        String[] fullName3 = fullName2.split(" ");
        for (int i = 0; i < fullName3.length; i++) {
            System.out.println(" - " + fullName3[i]);
        }
    }
}
