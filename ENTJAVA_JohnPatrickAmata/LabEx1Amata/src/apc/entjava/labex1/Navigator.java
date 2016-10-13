package apc.entjava.labex1;
import javax.faces.bean.ManagedBean;
import java.util.Random;

/**
 * Created by student on 9/30/2016.
 */

@ManagedBean
public class Navigator {

    private String[] index =
            { "a"};

    private String[] resultPages =
            { "b", "defeat",};

    private String[] b =
            { "c"};

    private String[] c =
            { "defeat", "victory"};

    private String[] three =
            { "3"};

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Action Controller Method
    public String index() {
        Random r = new Random();
        return index[r.nextInt(1)];
    }

    public String choosePage() {
        Random r = new Random();
        return resultPages[r.nextInt(2)];
    }

    public String choosePageC() {
        Random r = new Random();
        return c[r.nextInt(2)];
    }
    public String b() {
        Random r = new Random();
        return b[r.nextInt(1)];
    }

    public String three() {
        Random r = new Random();
        return three[r.nextInt(1)];
    }
}