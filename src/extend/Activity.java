package extend;

import java.io.Serializable;

public interface Activity extends Serializable, Comparable {
    // mô tả các  tinh năng
    void move();
    void eat();
    void sleep();
}
