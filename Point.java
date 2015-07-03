package Calandar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Rook on 6/17/2015.
 */
public class Point {
                public int x;
                public int y;
                public int z;

    public Point(int x, int y, int z) {

    }


    public List neighbor8() {

        List<Point> points = new ArrayList<Point>();

        for (int ox = -1; ox < 2; ox++) {
            for (int oy = -1; ox < 2; ox++) {
                if (ox == 0 && oy == 0)
                continue;

            points.add(new Point(x + ox, y + oy,z));
                }

            }


        Collections.shuffle(points);

             return  points;
    }
   


} 
