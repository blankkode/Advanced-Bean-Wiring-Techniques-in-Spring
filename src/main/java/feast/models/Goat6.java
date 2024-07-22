package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Goat6 {

    private final Horse7 horse;

    public Goat6(Horse7 horse){
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "which is stuffed inside a horse, " + horse.toString();
    }
}
