package game;

public interface Actions {
    void attack(Character target);
    void defend();
    void dodge();
    void rest();
    void run();
    void skipTurn();
}
