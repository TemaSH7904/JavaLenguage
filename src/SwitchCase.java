import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        String month = "Ноябр";

        switch (month) {
            case "Декабрь":
                case "Январь":
                    case "Февраль":
                        System.out.println("Зима");
                        break;

            case "Март":
                case "Апрель":
                    case "Май":
                        System.out.println("Весна");
                        break;

            case "Июнь":
                case "Июль":
                    case "Август":
                        System.out.println("Лето");
                        break;

            case "Сентябрь":
                case "Октябрь":
                    case "Ноябрь":
                        System.out.println("Осень");
                        break;

            default:
                System.out.println("Неизвестная строка");
        }
    }
}
