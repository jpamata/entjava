package apc.entjava.labex3;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by John on 10/14/2016.
 */

@ManagedBean
//@SessionScoped
//@ApplicationScoped
public class CountingBean {

    public CountingBean(){}
    private int count = 0;

    public int getCount() {
        return count;
    }

    //increment
    public String incrementCount(){
        count++;

        return "incrementpage";
    }
}
