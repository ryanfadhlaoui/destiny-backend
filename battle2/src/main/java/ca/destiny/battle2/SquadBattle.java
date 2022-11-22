package ca.destiny.battle2;


import java.util.*;

public class SquadBattle {

    private final Squad squad1;
    private final Squad squad2;

    private final Map<Position, SquadFighter> squadFighterByPosition = new HashMap<>();
    private boolean isOver = false;

    public SquadBattle(Squad squad1, Squad squad2) {
        this.squad1 = squad1;
        this.squad2 = squad2;
        buildMap(squad1, squad2);
    }

    private void buildMap(Squad squad1, Squad squad2) {
        squad1.getFighterByPosition()
                .forEach((key, value) -> squadFighterByPosition.put(key, new SquadFighter(1, value, key)));
        squad2.getFighterByPosition()
                .forEach((key, value) -> {
                    Position position = moveUp(key);
                    squadFighterByPosition.put(position, new SquadFighter(2, value, position));
                });
    }

    private Position moveUp(Position key) {
        return new Position(key.getX(), key.getY() - 1);
    }

    public boolean isOver() {
        return isOver;
    }

    public void setOver(boolean over) {
        isOver = over;
    }

    public Collection<SquadFighter> getSquadFighters() {
        return squadFighterByPosition.values();
    }
}