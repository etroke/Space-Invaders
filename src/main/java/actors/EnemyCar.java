package actors;

import game.Stage;

/**
 * EnemyCar class that extends Actor
 * Instantiates an EnemyCar hazard in Moose: The Game
 */
public class EnemyCar extends Actor {

    /**
     * Constructor for the EnemyCar object
     * Type of car is chosen at random
     * @param canvas
     * @param enemyCarType
     * @param lane
     */
    public EnemyCar(Stage canvas, int enemyCarType, int lane) {
        super(canvas, 145, 73, 145, 73);

        vx = -20;

        switch (enemyCarType) {
            case 0:sprites = new String[]{"enemy_car1.png"};
            break;
            case 1:sprites = new String[]{"enemy_car2.png"};
            break;
            case 2:sprites = new String[]{"enemy_car3.png"};
            break;
            case 3:sprites = new String[]{"enemy_car4.png"};
            break;
            case 4:sprites = new String[]{"enemy_car5.png"};
        }

        posX = 1000;
        if (lane == 0) {
            posY = 40;
        } else {
            posY = 175;
        }
    }

    public void update() {
        super.update();
        posX += vx;
        posY += vy;
    }
}