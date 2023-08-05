import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {


        System.out.println(ZoneId.systemDefault());
        ZoneId.getAvailableZoneIds().stream().filter(s -> s.startsWith("Asia")).sorted().map(ZoneId::of).forEach(z -> System.out.println(z.getId() + " " + z.getRules()));

    }
}