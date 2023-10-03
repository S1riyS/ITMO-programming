package lab2;

import lab2.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        // Fighters
        Sharpedo p1 = new Sharpedo("Fish", 1);
        Cascoon p2 = new Cascoon("Bug", 1);
        Articuno p3 = new Articuno("BIG BIRD", 1);
        Ralts p4 = new Ralts("Smol caterpillar", 1);
        Kirlia p5 = new Kirlia("Medium caterpillar", 1);
        Gardevoir p6 = new Gardevoir("HUGE caterpillar wtf", 1);

        // Team 1
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);

        // Team 2
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);

        // The battle begins (Дело в шляпе)
        b.go();
    }
}