package Calandar;

import android.graphics.Point;

//import com.badlogic.gdx.ai.pfa.Heuristic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import Calandar.Creature;

/**
 * Created by Rook on 6/17/2015.
 */
public class PathFinder {

        private ArrayList<Calandar.Point> open;
        private ArrayList<Calandar.Point> closed;
        private HashMap<Calandar.Point, Calandar.Point> parents;
        private  HashMap<Calandar.Point, Integer> totalCost;

    public PathFinder(ArrayList<Calandar.Point> open, ArrayList<Calandar.Point> closed, HashMap<Calandar.Point, Calandar.Point> parents, HashMap<Calandar.Point, Integer> totalCost) {
        this.open = open;
        this.closed = closed;
        this.parents = parents;
        this.totalCost = totalCost;
    }

    private int heuristicCost(Calandar.Point from, Calandar.Point to){
                    return  Math.max(Math.abs(from.x - to.x),Math.abs(from.y - to.y));


        }
        private int costToGetTo(Calandar.Point from){
            return parents.get(from)== null ? 0 :  (1 + costToGetTo(parents.get(from)));

        }
        private int totalCost(Calandar.Point from, Calandar.Point to){
                if(totalCost.containsKey(from))
                    return totalCost.get(from);

                    int cost = costToGetTo(from) + heuristicCost(from, to);
                    totalCost.put(from, cost);




            return cost;

        }
            private void reParent(Calandar.Point child, Calandar.Point parent){
                parents.put(child, parent);
                totalCost.remove(child);

    }

            public ArrayList<Calandar.Point> findPath(Creature creature, Calandar.Point start, Calandar.Point end, int maxTries){

                        open.clear();
                        closed.clear();
                        parents.clear();
                        totalCost.clear();

                        open.add(start);
                for (int tries = 0; tries < maxTries && open.size() > 0; tries++) {

                    Calandar.Point closest = getClosestPoint(end);
                    open.remove(closest);
                    closed.remove(closest);

                    if(closest.equals(end))

                        return createPath(start, closest);

                    else
                        checkNeighbors(creature, end, closest);


                }





                return null;

            }

    private ArrayList<Calandar.Point> createPath(Calandar.Point start, Calandar.Point end) {
        ArrayList<Calandar.Point> path = new ArrayList<Calandar.Point>();
                while(!end.equals(start))  {
                    path.add(end);
                    end = parents.get(end);

                }
                Collections.reverse(path);
                end = parents.get(end);

                    return path;
    }

    private void checkNeighbors(Creature creature, Calandar.Point end, Calandar.Point closest) {
       /*            for(Calandar.Point neighbor : closest.neighbor8()){
                	   			// sub for neihbor instead of creature
                        if(closed.contains(neighbor) || !creature.canEnter(neighbor.x, neighbor.y, neighbor.z)
                         && ! neighbor.equals(end) )continue;

                       if(open.contains(neighbor))
                                reParent(closest, neighbor);
                           else
                                reParent(closest, neighbor);
                       }
*/

                        }

    private Calandar.Point getClosestPoint(Calandar.Point end) {
                 Calandar.Point closest = open.get(0);
                    for(Calandar.Point other: open){
                        if(totalCost(other, end) < totalCost(closest, end)){
                                closest = other;

                        }
                    }


                     return closest;
    }
            private  void reParentNeighborIfNecessary(Calandar.Point closest, Calandar.Point neighbor){
                Calandar.Point originalParent = parents.get(neighbor);
                double currentCost = costToGetTo(neighbor);
                reParent(neighbor, closest);
                double reparentCost = costToGetTo(neighbor);

                if(reparentCost < currentCost )
                    open.remove(neighbor);
                else
                    reParent(neighbor, originalParent);

            }

}
