package apc.entjava.labex1;

/**
 * Created by student on 9/30/2016.
 */

import javax.faces.bean.ManagedBean;
import java.util.Random;
@ManagedBean
public class LabEx1 {
    private String[] resultPages =
            {"a", "b"};

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String choosePage() {
        Random r = new Random();
        return resultPages[r.nextInt(2)];
    }
}
