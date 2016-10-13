package apc.entjava.labex1;
import javax.faces.bean.ManagedBean;
/**
 * Created by student on 9/30/2016.
 */
@ManagedBean
public class LanguageForm {
    private String language1;
    private String language2;

    public String getLanguage1() {
        return (language1);
    }

    public String getLanguage2() {
        return (language2);
    }

    public void setLanguage1(String language1) {
        this.language1 = language1.trim();
    }

    public void setLanguage2(String language2) {
        this.language2 = language2.trim();
    }

    private boolean isMissing(String value) {
        return ((value == null) || (value.trim().isEmpty()));
    }

    public String showChoice() {
        if (isMissing(language1)) {
            return ("error");
        }
        else if (isMissing(language2)) {
            return ("error");
        }
        else {
            return ("print");
        }
    }
}



//http://localhost:8080/index.jsf
