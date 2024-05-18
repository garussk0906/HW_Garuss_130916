package Timus2Sem.task_1585;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().solve();
    }

    private void solve() {
        HashMap<String, Integer> penguinHashMap = new HashMap<>();
        penguinHashMap.put("Emperor Penguin", 0);
        penguinHashMap.put("Little Penguin", 0);
        penguinHashMap.put("Macaroni Penguin", 0);

        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n; i++) {
            String penguin = in.nextLine().trim();
            // Считаем, что строка может содержать только одно из трёх возможных названий пингвинов
            if (penguinHashMap.containsKey(penguin)) {
                penguinHashMap.put(penguin, penguinHashMap.get(penguin) + 1);
            }
        }

        String winner = "";
        int maxCount = 0;

        for (HashMap.Entry<String, Integer> entry : penguinHashMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                winner = entry.getKey();
            }
        }

        // Выводим название пингвина-победителя
        System.out.println(winner);
    }
}
