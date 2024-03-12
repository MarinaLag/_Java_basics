package by._java_SE._6_enum;

public class Main {
    public static void main(String[] args) {
        System.out.println(DayOfWeek.MONDAY);

        DayOfWeek myDay = DayOfWeek.THURSDAY;
        System.out.println(myDay);

        System.out.println(Colors.RED);

    //    DayOfWeek dayOfWeek = new DayOfWeek(); ошибка создавать объект нельзя
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        System.out.println(dayOfWeek);

        System.out.println("-----------методы-----------");
        System.out.println(dayOfWeek.name());  //MONDAY
        System.out.println(dayOfWeek.ordinal());  // 0
        for(DayOfWeek elem : DayOfWeek.values()){
            System.out.println(elem);  // выведет все элементы
        }


    }

}
enum Colors{
    RED,
    WRIGHT,
    ROSE
}
