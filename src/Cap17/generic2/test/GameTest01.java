package Cap17.generic2.test;

import Cap17.generic2.domain.*;

public class GameTest01 {
    public static void main(String[] args) {
        Player player = new Player("Luiz");
        Tree tree = new Tree();
        Item item = new Item("Mana");
        Enemy enemy = new Enemy("Goblin");

        DrawObjects drawObjects = new DrawObjects();

        drawObjects.draw(player);
        drawObjects.draw(tree);
    }
}
