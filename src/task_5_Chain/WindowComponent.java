package task_5_Chain;

import java.util.HashMap;

public abstract class WindowComponent {
    protected String name;
    protected HashMap<String, WindowComponent> nestedComponents = new HashMap<>();

    public void draw(){
        for (WindowComponent component:
             nestedComponents.values()){
             component.draw();
            
        }
    }
    public void addComponent(WindowComponent component){
        nestedComponents.put(component.name, component);
    }
    public void removeComponent(String name){
        nestedComponents.remove(name);
    }
}
