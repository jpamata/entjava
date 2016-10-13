package apc.entjava.labex2.model;

/**
 * Created by John on 10/13/2016.
 */
public class HealthPlan {
    private String plans;
    private String premiumBonus;
    private String contactNum;

    public HealthPlan(){}
    public HealthPlan(String plans, String premiumBonus, String contactNum){
        this.plans = plans;
        this.premiumBonus = premiumBonus;
        this.contactNum = contactNum;

    }
    public String getPlans() {
        return plans;
    }

    public void setPlans(String plans) {
        this.plans = plans;
    }

    public String getPremiumBonus() {
        return premiumBonus;
    }

    public void setPremiumBonus(String premiumBonus) {
        this.premiumBonus = premiumBonus;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
}
