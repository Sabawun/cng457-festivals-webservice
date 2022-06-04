package entities;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance (strategy = InheritanceType.JOINED)
public class concert extends event {

    private String performerName;

}
