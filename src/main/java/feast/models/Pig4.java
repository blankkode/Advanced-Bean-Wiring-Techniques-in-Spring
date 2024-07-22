package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pig4 {

    private Lamb5 lamb;

    @Override
    public String toString() {
        return "which is stuffed inside a lamb, "+lamb.toString();
    }

    @Autowired
    public void setFish(Lamb5 lamb) {
        this.lamb = lamb;
    }
}
