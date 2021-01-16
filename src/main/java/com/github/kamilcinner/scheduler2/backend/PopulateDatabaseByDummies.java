package com.github.kamilcinner.scheduler2.backend;

import com.github.kamilcinner.scheduler2.backend.activities.models.Activity;
import com.github.kamilcinner.scheduler2.backend.shopping.models.ShoppingList;
import com.github.kamilcinner.scheduler2.backend.shopping.models.ShoppingListItem;
import com.github.kamilcinner.scheduler2.backend.shopping.repositories.ShoppingListItemRepository;
import com.github.kamilcinner.scheduler2.backend.shopping.repositories.ShoppingListRepository;
import com.github.kamilcinner.scheduler2.backend.tasks.models.Task;
import com.github.kamilcinner.scheduler2.backend.users.models.User;
import com.github.kamilcinner.scheduler2.backend.activities.repositories.ActivityRepository;
import com.github.kamilcinner.scheduler2.backend.tasks.repositories.TaskRepository;
import com.github.kamilcinner.scheduler2.backend.users.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Configuration
@Slf4j
class PopulateDatabaseByDummies {

    @Bean
    CommandLineRunner initDatabase(
        TaskRepository taskRepository,
        ActivityRepository activityRepository,
        ShoppingListRepository shoppingListRepository,
        ShoppingListItemRepository shoppingListItemRepository,
        UserRepository userRepository,
        PasswordEncoder passwordEncoder
    ) {
        return args -> {
            // Add Users.
            log.info("Preloading " + userRepository.save(
                new User(
                    "testowo",
                    passwordEncoder.encode("pass"),
                    "testowo@testowo.test",
                    true,
                    "ROLE_USER"
                )));

            // Add Tasks.
            log.info("Preloading " + taskRepository.save(
                new Task(
                    "testowo",
                    "TAI",
                    Timestamp.valueOf("2021-1-19 17:00:00"),
                    "Budowanie projektu i wypełnienie danymi",
                    true,
                    false,
                    'h'
                )));
            log.info("Preloading " + taskRepository.save(
                new Task(
                    "testowo",
                    "Angielski",
                    Timestamp.valueOf("2021-1-18 23:59:00"),
                    "hw",
                    false,
                    false,
                    'n'
                )));
            log.info("Preloading " + taskRepository.save(
                new Task(
                    "testowo",
                    "BSI",
                    Timestamp.valueOf("2021-1-19 23:59:00"),
                    "przygotowac vmki najlepiej na dysku zewn.",
                    false,
                    false,
                    'n'
                )));
            log.info("Preloading " + taskRepository.save(
                new Task(
                    "testowo",
                    "EGZAMIN 0",
                    Timestamp.valueOf("2021-1-22 16:15:00"),
                    "sieci teams forms",
                    false,
                    true,
                    'h'
                )));
            log.info("Preloading " + taskRepository.save(
                new Task(
                    "testowo",
                    "bazki",
                    Timestamp.valueOf("2021-1-26 23:59:00"),
                    "projekt",
                    false,
                    false,
                    'h'
                )));
            log.info("Preloading " + taskRepository.save(
                new Task(
                    "testowo",
                    "BSI ZADANIE",
                    Timestamp.valueOf("2021-1-26 23:59:00"),
                    "z blokowania polaczen",
                    false,
                    false,
                    'h'
                )));
            log.info("Preloading " + taskRepository.save(
                new Task(
                    "testowo",
                    "EGZAMIN",
                    Timestamp.valueOf("2021-2-1 12:00:00"),
                    "bazy danych",
                    false,
                    true,
                    'h'
                )));

            // Add Activities.
            log.info("Preloading " + activityRepository.save(
                new Activity(
                    "testowo",
                    "Tworzenie aplikacji internetowych - proj.",
                    "dr Mariusz Dzieńkowski",
                    Time.valueOf("08:15:00"),
                    Time.valueOf("10:00:00"),
                    Date.valueOf("2021-01-12"),
                    true,
                    true
                )));
            log.info("Preloading " + activityRepository.save(
                    new Activity(
                            "testowo",
                            "Język angielski",
                            "mgr Izabella Dzieńkowska",
                            Time.valueOf("12:15:00"),
                            Time.valueOf("14:00:00"),
                            Date.valueOf("2021-01-12"),
                            true,
                            true
                    )));
            log.info("Preloading " + activityRepository.save(
                    new Activity(
                            "testowo",
                            "Sieci rozproszone - lab (15h)",
                            "mgr Jacek Tanaś",
                            Time.valueOf("14:15:00"),
                            Time.valueOf("16:00:00"),
                            Date.valueOf("2021-01-12"),
                            false,
                            true
                    )));
            log.info("Preloading " + activityRepository.save(
                    new Activity(
                            "testowo",
                            "Technika mikroprocesorowa - WY",
                            "dr inż. Wojciech Surtel",
                            Time.valueOf("16:15:00"),
                            Time.valueOf("18:00:00"),
                            Date.valueOf("2021-01-12"),
                            true,
                            true
                    )));
            log.info("Preloading " + activityRepository.save(
                    new Activity(
                            "testowo",
                            "Tworzenie aplikacji internetowych (TAI) - WY",
                            "dr Beata Pańczyk",
                            Time.valueOf("08:15:00"),
                            Time.valueOf("10:00:00"),
                            Date.valueOf("2021-01-13"),
                            true,
                            true
                    )));
            log.info("Preloading " + activityRepository.save(
                    new Activity(
                            "testowo",
                            "Inżynieria oprogramowania (IO) - WY",
                            "dr inż. Marek Miłosz, prof. PL",
                            Time.valueOf("12:15:00"),
                            Time.valueOf("14:00:00"),
                            Date.valueOf("2021-01-13"),
                            true,
                            true
                    )));
            log.info("Preloading " + activityRepository.save(
                    new Activity(
                            "testowo",
                            "Bezpieczeństwo systemów informatycznych - lab",
                            "dr inż. Sławomir Przyłucki",
                            Time.valueOf("14:15:00"),
                            Time.valueOf("16:00:00"),
                            Date.valueOf("2021-01-13"),
                            true,
                            true
                    )));
            log.info("Preloading " + activityRepository.save(
                    new Activity(
                            "testowo",
                            "Bazy danych - lab",
                            "mgr inż. M.Tokovarov",
                            Time.valueOf("16:15:00"),
                            Time.valueOf("18:00:00"),
                            Date.valueOf("2021-01-13"),
                            true,
                            true
                    )));
            log.info("Preloading " + activityRepository.save(
                    new Activity(
                            "testowo",
                            "Bazy danych (BD) - WY",
                            "dr inż. Piotr Muryjas",
                            Time.valueOf("08:15:00"),
                            Time.valueOf("10:00:00"),
                            Date.valueOf("2021-01-14"),
                            true,
                            true
                    )));
            log.info("Preloading " + activityRepository.save(
                    new Activity(
                            "testowo",
                            "Bezpieczeństwo systemów informatycznych (BSI) - WY",
                            "dr inż. Grzegorz Kozieł",
                            Time.valueOf("12:15:00"),
                            Time.valueOf("14:00:00"),
                            Date.valueOf("2021-01-14"),
                            true,
                            true
                    )));
            log.info("Preloading " + activityRepository.save(
                    new Activity(
                            "testowo",
                            "Inżynieria oprogramowania - lab",
                            "dr inż. Maria Skublewska-Paszkowska",
                            Time.valueOf("10:15:00"),
                            Time.valueOf("12:00:00"),
                            Date.valueOf("2021-01-15"),
                            true,
                            true
                    )));
            log.info("Preloading " + activityRepository.save(
                    new Activity(
                            "testowo",
                            "Sieci rozproszone - lab - WY",
                            "dr hab inż. Konrad Gromaszek, profesor uczelni",
                            Time.valueOf("16:15:00"),
                            Time.valueOf("18:00:00"),
                            Date.valueOf("2021-01-15"),
                            true,
                            true
                    )));


            // Add Shopping List.
            shoppingListRepository.save(
                new ShoppingList(
                    "testowo",
                    "Example Shopping List"
                ));

            // Add Items to Shopping List
            for (int i = 0; i < 10; i++) {
                shoppingListItemRepository.save(
                    new ShoppingListItem(
                        shoppingListRepository.findByOwnerUsername(
                                "testowo",
                                Sort.by(Sort.Direction.ASC, "lastEditDateTime")
                        ).get(0),
                        "Test Item " + i,
                        (i > 7)
                    ));
            }
        };
    }
}
