import java.util.List;
import java.util.Set;
import java.util.*;
public class Main implements BlacklistFilter {
    public static void main(String[] args) {
     //Создаём список с комментариями
        List comments = new ArrayList<>(List.of("Козёл" ,
                "Спасибо",
                "Класс",
                "обожаю",
                "Слово"));

        //Создаём список запретных cлов
        Set black_list = new HashSet<>();
        black_list.add("Козёл");
        black_list.add("Ненавижу");

        BlacklistFilter example = new Main();
        example.filterComments(comments, black_list);
    }
    //Просматриваем список с комментариями , если нахолим запрещённые комментраии ,то удаляем
    @Override
    public void filterComments(List<String> comments, Set<String> black_list) {

        System.out.println(comments);
        int Size = comments.size();

        Iterator<String> iterator = comments.iterator();
        while (iterator.hasNext()) {
            String comment = iterator.next();
            if (black_list.contains(comment)) {
                iterator.remove();
            }
        }
        System.out.println(comments);

    }
}




