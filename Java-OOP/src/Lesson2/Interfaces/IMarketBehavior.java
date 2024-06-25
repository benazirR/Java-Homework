package Lesson2.Interfaces;

import Lesson2.Classes.Actor;
import java.util.List;

public interface IMarketBehavior {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void releaseFromMarket(Actor actor);
    void update(Actor actor);
}
