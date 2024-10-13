package by.lidcode._2_инициализация_И_кодревью.scopy.scopy_2;

//@Configuration
public class AppConfig {
 //   @Bean
 //   @Scope("singleton") // Синглтон - один экземпляр на все приложение
    public MySingletonBean mySingletonBean() {
        return new MySingletonBean();
    }

 //   @Bean
  //  @Scope("prototype") // Прототип - каждый раз новый экземпляр
    public MyPrototypeBean myPrototypeBean() {
        return new MyPrototypeBean();
    }

}


