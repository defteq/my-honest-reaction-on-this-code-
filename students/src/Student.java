import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int curse;
    private String group;

    public Student(String name, String surname, int age, int curse, String group) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.curse = curse;
        this.group = group;
    }

    static Scanner scanner = new Scanner(System.in);

    @Override
    public String toString() {
        return "Студент " +
                "\n имя - " + name + '\'' +
                "\n Фамилия - " + surname + '\'' +
                "\n Возраст - " + age + '\'' +
                "\n Курск - " + curse + '\'' +
                "\n Группа - " + group + '\''
                ;
    }

    static Student[] students = new Student[1];


    public static void newStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Введите новое имя:");
            String name = scanner.next();

            System.out.println("Введите новую фамилию:");
            String surname = scanner.next();

            System.out.println("Введите новый возраст:");
            int age = scanner.nextInt();

            System.out.println("Введите новый курс:");
            int curse = scanner.nextInt();

            System.out.println("Введите новую группу:");
            String group = scanner.next();

            students[i] = new Student(name, surname, age, curse, group);
        }
    }
    public static void redInf(Student[] students){
        System.out.println("Введите номер ученика которого хотите редактироватьж:");
        int index = scanner.nextInt();
        if (index == 1)
            index = 0;

        System.out.println("Выберите поле для редактирования:\n" +
                "1. Имя\n" +
                "2. Фамилия\n" +
                "3. Возраст\n" +
                "4. Курс\n" +
                "5. Группа");
        System.out.println("Выберите строчку:");
        int nameInfo = scanner.nextInt();

        if (nameInfo == 1){
            System.out.println("Введите новое имя");
            String newName = scanner.next();

            students[index].name = newName;
        }
        if (nameInfo == 2){
            System.out.println("Введите новую фамилию");
            String newSurname= scanner.next();

            students[index].surname = newSurname;
        }
        if (nameInfo == 3){
            System.out.println("Введите новый возраст");
            int newAge = scanner.nextInt();

            students[index].age = newAge;
        }
        if (nameInfo == 4){
            System.out.println("Введите новое имя");
            int newCurse = scanner.nextInt();

            students[index].curse = newCurse;
        }
        if (nameInfo == 5){
            System.out.println("Введите новую группу");
            String newGroup = scanner.next();

            students[index].group = newGroup;
        }
        System.out.println("Информация успешна обновлена.");
    }

    public static Student[] delInfo(Student[] students) {
        System.out.println("Введите номер ученика:");
        int delIndex = scanner.nextInt();
        if (delIndex == 1)
            delIndex = 0;

        Student[] newStudents = new Student[students.length - 1];

        int newIndex = 0;
        for (int i = 0; i < students.length; i++) {
            if (i != delIndex) {
                newStudents[newIndex] = students[i];
                newIndex++;
            }
        }

        return newStudents;
    }


    public static void getInf(int indexStudent, String searchType) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите номер ученика чтобы получить инофрмацию о нём:");
            indexStudent = scanner.nextInt();
            if (indexStudent == 1)
                indexStudent = 0;
            System.out.println(students[indexStudent].toString());

        }
    }

        public static void main (String[] args){
            newStudents(students);
            //getInf(0, "");
            //students = delInfo(students);
            redInf(students);
            System.out.println(Arrays.toString(students));
        }
    }