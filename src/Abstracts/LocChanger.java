package Abstracts;

import Abstracts.Location;
import Abstracts.canChangeLoc;

public class LocChanger {
    public void changeLocation(canChangeLoc obj, Location location) {
        obj.setLocation(location);
    }
}
