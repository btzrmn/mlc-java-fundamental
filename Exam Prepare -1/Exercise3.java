package org.example;

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.valueOf(scanner.nextLine());

        Map<String, List<Integer>> listMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] lines = scanner.nextLine().split(" ");
            String heroName = lines[0];
            Integer hp = Integer.valueOf(lines[1]);
            Integer mp = Integer.valueOf(lines[2]);
            listMap.put(heroName, Arrays.asList(hp, mp));
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commands = command.split(" - ");
            String heroName = commands[1];
            switch (commands[0]) {
                case "CastSpell":
                    Integer mpNeeded = Integer.parseInt(commands[2]);
                    String spellName = commands[3];
                    Integer currentMp = listMap.get(heroName).get(1);
                    if (currentMp < mpNeeded) {
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                    } else {
                        currentMp = currentMp - mpNeeded;
                    }
                    listMap.get(heroName).set(1, currentMp);
                    System.out.printf("%s has successfully cast %s and now has %d MP\n", heroName, spellName, currentMp);
                    break;
                case "TakeDamage":
                    Integer damage = Integer.parseInt(commands[2]);
                    String attacker = commands[3];
                    Integer currentHp = listMap.get(heroName).get(0);
                    currentHp = currentHp - damage;
                    if (currentHp > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName, damage, attacker, currentHp);
                        listMap.get(heroName).set(0, currentHp);
                    } else {
                        System.out.printf("%s has been killed by %s!", heroName, attacker);
                        listMap.remove(heroName);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> mapValue : listMap.entrySet()) {
            System.out.println(mapValue.getKey() + ": " + mapValue.getValue());
        }
    }
}
