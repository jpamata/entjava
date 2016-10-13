package apc.entjava.labex2;

import apc.entjava.labex2.model.HealthPlan;
import apc.entjava.labex2.businesslogic.HealthPlanLookUp;
import apc.entjava.labex2.dao.HealthPlanHash;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 10/13/2016.
 */

@ManagedBean

public class FormBean {
    public FormBean() {
        healthPlanOptions = new ArrayList<>();
        healthPlanOptions.add("example1");
        healthPlanOptions.add("example2");
    }
    private String eName;
    private String eID;
    private String hPlan;
    //drop down list
    List<String> healthPlanOptions;
    public List<String> gethealthPlanOptions(){
        return healthPlanOptions;
    }
    //Getters & Setters
    public String geteName() {
        return eName;
    }
    public void seteName(String eName) {
        this.eName = eName.trim();
    }
    public String geteID() {
        return eID;
    }
    public void seteID(String eID) {
        this.eID = eID.trim();
    }
    public String gethPlan() {
        return hPlan;
    }
    public void sethPlan(String hPlan) {
        this.hPlan = hPlan.trim();
    }

    //Missing Values
    private boolean isMissing(String value) {
        return ((value == null) || (value.trim().isEmpty()));
    }

    public String showChoice() {
        if (isMissing(eName)) {
            return ("missing");
        }
        else if (isMissing(eID)) {
            return ("missing");
        }
        else if (isMissing(hPlan)) {
            return ("missing");
        }
        else {
            return ("confirmation");
        }
    }
    public void sethHPlan(String hPlan) {
        this.hPlan = hPlan.trim();
        if(this.hPlan.isEmpty()) {
            this.hPlan = "(none entered)";
        }
    }
    //For Forms 2 and 3
    private static HealthPlanLookUp lookupService = new HealthPlanHash();

    public String showhealthPlans(){
    healthPlan = lookupService.findHealthPlan(hPlan);
        if (isMissing(eName)) {
            return ("missing");
        }
        else if (isMissing(eID)) {
            return ("missing");
        }
        else if (isMissing(hPlan)) {
            return ("missing");
        }
        else {
            if (healthPlan == null) { //c
                return ("noplanerror");
            } else if (hPlan == "example1") {
                return ("confirmationNew");
            } else {
                return ("confirmationNew");
            }
        }

    }
    private HealthPlan healthPlan;
    public HealthPlan getHealthPlan(){
        return this.healthPlan;
    }
}



