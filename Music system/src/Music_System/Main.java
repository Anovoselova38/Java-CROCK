package Music_System;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
     //Принимаем строку пользователя с названием звуковоспроизводящего устройства
     Scanner in = new Scanner(System.in);
     String user_input=in.nextLine();
     in.close();

     Music song_1=new Music();
     song_1.name="Love you like a love song ";
     song_1.creator_name="Selena Gomez";
     song_1.sound_producing_device="Универсальный плеер";
     song_1.storage_device="sd карта";

     Music song_2=new Music();
     song_2.name="Bad Romance";
     song_2.creator_name="Lady Gaga";
     song_2.sound_producing_device="Внешние динамики";
     song_2.storage_device="жёский диск ";

     Music song_3 = new Music();
     song_3.name="Billie Jean";
     song_3.creator_name="Michael Joseph Jackson";
     song_3.sound_producing_device="музыкальная колонка";
     song_3.storage_device="флешка";

     Music song_4 = new Music();
     song_4.name="Rain";
     song_4.creator_name="The Beatles";
     song_4.sound_producing_device="виниловая вершушка";
     song_4.storage_device="пластинка";



     if (user_input.equals("Love you like a love song")) {
      System.out.println("Название музыкальной композиции:" + song_1.name + " Исполнитель: " + song_1.creator_name + " Носитель: " + song_1.storage_device + " Звуковоспроизводящее устройство:" + song_1.sound_producing_device);
     }

     if (user_input.equals("Bad Romance")) {
      System.out.println(" Название музыкальной композиции:" + song_2.name + " Исполнитель: " + song_2.creator_name + " Носитель: " + song_2.storage_device + " Звуковоспроизводящее устройство: " + song_2.sound_producing_device);
     }

     if (user_input.equals("Billie Jean")) {
      System.out.println(" Название музыкальной композиции:" + song_3.name + " Исполнитель: " + song_3.creator_name + " Носитель: " + song_3.storage_device + " Звуковоспроизводящее устройство: " + song_4.sound_producing_device);
     }


     if (user_input.equals("Rain")) {
      System.out.println(" Название музыкальной композиции:" + song_4.name + " Исполнитель: " + song_4.creator_name + " Носитель: " + song_4.storage_device + " Звуковоспроизводящее устройство: " + song_4.sound_producing_device);
     }






    }
}