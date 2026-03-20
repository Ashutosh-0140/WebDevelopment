import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

abstract class Room {
    public abstract void enter(Player player);
}

class TreasureRoom extends Room {
    private final String treasure;

    public TreasureRoom(String treasure) {
        this.treasure = treasure;
    }

    @Override
    public void enter(Player player) {
        System.out.println(" You found treasure: " + treasure);
        player.addItem(treasure);
    }
}

class MonsterRoom extends Room {
    private final String monster;

    public MonsterRoom(String monster) {
        this.monster = monster;
    }

    @Override
    public void enter(Player player) {
        System.out.println("A wild " + monster + " appears!");
        System.out.println("Do you want to fight (f) or run (r)?");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        Optional<String> action = Optional.ofNullable(choice);
        action.filter(c -> c.equalsIgnoreCase("f"))
              .ifPresentOrElse(c -> {
                  System.out.println("You defeated the " + monster);
                  player.addItem("Trophy of " + monster);
              }, () -> System.out.println("🏃 You ran away safely."));
    }
}

class EmptyRoom extends Room {
    @Override
    public void enter(Player player) {
        System.out.println("The room is empty...");
    }
}

class Player {
    private final List<String> inventory = new ArrayList<>();

    public void addItem(String item) {
        inventory.add(item);
    }

    public void showInventory() {
        System.out.println("\n Inventory:");
        inventory.stream()
                 .distinct()
                 .sorted()
                 .forEach(System.out::println);
    }
}

public class DungeonGame {
    public static void main(String[] args) {
        Player player = new Player();
        List<Room> dungeon = Arrays.asList(
                new TreasureRoom("Golden Sword"),
                new MonsterRoom("Dragon"),
                new EmptyRoom(),
                new TreasureRoom("Magic Potion"),
                new MonsterRoom("Goblin")
        );

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            try {
                Thread.sleep(20000); // 20 seconds chase timer
                System.out.println("\nThe dungeon collapses! Game Over.");
                System.exit(0);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Scanner sc = new Scanner(System.in);
        for (Room room : dungeon) {
            System.out.println("\nEnter next room? (y/n)");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                room.enter(player);
            } else {
                System.out.println("You stopped exploring.");
                break;
            }
        }

        player.showInventory();
        executor.shutdownNow();
    }
}