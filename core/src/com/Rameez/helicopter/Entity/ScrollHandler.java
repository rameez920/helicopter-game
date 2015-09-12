package com.Rameez.helicopter.Entity;

/**
 * Created by Rameez on 8/23/2015.
 */
public class ScrollHandler {
    private Walls wall1, wall2, wall3;

    public static final int SCROLL_SPEED = -59;
    public static final int WALL_GAP = 49;

    public ScrollHandler(float yPos) {
        wall1 = new Walls(850, 0, 22, 60, SCROLL_SPEED);
        wall2 = new Walls(wall1.getTailX() +WALL_GAP, 0, 22, 70, SCROLL_SPEED );
        wall3 = new Walls(wall2.getTailX() +WALL_GAP, 0, 22, 70, SCROLL_SPEED);

    }

    public void update(float delata) {
        wall1.update(delata);
        wall2.update(delata);
        wall3.update(delata);

        if (wall1.isScrolledLeft()) {
            wall1.reset(wall3.getTailX() + WALL_GAP);
        } else if (wall2.isScrolledLeft()) {
            wall2.reset(wall1.getTailX() + WALL_GAP);
        } else if (wall2.isScrolledLeft()) {
            wall3.reset(wall2.getTailX() + WALL_GAP);
        }
    }

    public Walls getWall1() {
        return wall1;
    }

    public Walls getWall2() {
        return wall2;
    }

    public Walls getWall3() {
        return wall3;
    }
}
