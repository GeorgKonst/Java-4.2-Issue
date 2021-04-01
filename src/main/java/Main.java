import ru.netology.domain.Issue;
import ru.netology.manager.Manager;
import ru.netology.repository.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);

        Issue issue1 = new Issue(1, true, "Georg", 6,
                new HashSet<>(Arrays.asList("Юность", "Детство", "Отцы")),
                new HashSet<>(Arrays.asList("Lermontov", "Esenin", "Nekrasov")));
        Issue issue2 = new Issue(2, false, "Georg", 5,
                new HashSet<>(Arrays.asList("Юность", "Детство", "Отцы")),
                new HashSet<>(Arrays.asList("Lermontov", "Esenin", "Nekrasov")));
        Issue issue3 = new Issue(3, true, "Georg", 3,
                new HashSet<>(Arrays.asList("Юность", "Детство", "Отцы")),
                new HashSet<>(Arrays.asList("Lermontov", "Esenin", "Nekrasov")));

        manager.issueAddAll(List.of(issue1, issue2, issue3));
        manager.getAll();


    }
}
