package by.lidcode._7_строки;

public class Main__0 {
    public static void main(String[] args) {
        // удалить все гласные и пробел и перевернуть
        String str = "Hello world";
        System.out.println(reversWorld(str));// DLRWLLH
    }

    public static String reversWorld(String str) {
        String res = str.replaceAll("[a,o,i,e,u,y\\s]", "").toUpperCase();

        StringBuilder sb= new StringBuilder(res);
        sb.reverse();// Переворачиваем строку

        return sb.toString();
    }
}
