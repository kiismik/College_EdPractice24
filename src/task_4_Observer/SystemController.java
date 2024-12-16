package task_4_Observer;

import java.util.ArrayList;

public class SystemController extends Observable{
    private ArrayList<SystemAlert> alertHistory = new ArrayList<>();
    public SystemController() {
    }
    public void infoAlert(){
        if (!alertHistory.isEmpty()){
            for (SystemAlert sysAl:
                    alertHistory) {
                notify(sysAl);
            }
            alertHistory.clear();
        } else {
            System.out.println("History empty");
        }
    }
    public void addAlert(SystemAlert alert){
        alertHistory.add(alert);
    }
}
