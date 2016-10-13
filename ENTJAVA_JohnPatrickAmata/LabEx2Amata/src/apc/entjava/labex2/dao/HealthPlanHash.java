package apc.entjava.labex2.dao;

import apc.entjava.labex2.businesslogic.HealthPlanLookUp;
import apc.entjava.labex2.model.HealthPlan;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by John on 10/13/2016.
 */
public class HealthPlanHash implements HealthPlanLookUp{

    private Map<String,HealthPlan> healthPlans;

    public HealthPlanHash() {
        healthPlans = new HashMap<>();
        addHealthPlan (new HealthPlan("example1", "mega", "6969-691" ));
        addHealthPlan (new HealthPlan("example2", "sale","0969-0969"));

    }
    @Override
    public HealthPlan findHealthPlan(String plans) {
        if(plans!=null)
            return healthPlans.get(plans.toLowerCase());
        else
            return null;
    }

    private void addHealthPlan(HealthPlan healthPlan) {
        this.healthPlans.put(healthPlan.getPlans(),healthPlan);
    }
}
