package by.lidcode._2_инициализация_И_кодревью;

public class Main_1 {
    public static String str = "ABC";

    public static void reverse(String s){  // сюда передается копия
        s ="CBA";
    }

    public static void main(String[] args) {
        System.out.println(str);   //ABC
        reverse(str);  // находиться копия,
        System.out.println(str);  //ABC

// если бы наш метод возвращал значение - и мы его вернули, тогда выводя это новое значение мы бы получили CBA
      //  String strResult  = reverse(str);
       // System.out.println(strResult);  //СВА
    }
}
