package Calandar;

//import com.badlogic.gdx.ai.pfa.PathFinder;

import java.util.List;

/**
 * Created by Rook on 6/17/2015.
 */
public class Path {

                public static Calandar.PathFinder pf;
                private List<Point> points;
                private List<Point> points(){ return points;}

    public Path(Creature creature, int x, int y) {

                points = pf.findPath( creature, new Point(creature.x, creature.y, creature.z),
                        new Point(x, y , creature.z ) , 300);


            }
}
