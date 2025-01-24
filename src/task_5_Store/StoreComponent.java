package task_5_Store;

import java.util.HashMap;

public abstract class StoreComponent {
    protected String name;
    protected HashMap<String, StoreComponent> nestedComponents = new HashMap<>();

    public void display() {
        for (StoreComponent component : nestedComponents.values()) {
            component.display();
        }
    }

    public void addComponent(StoreComponent component) {
        nestedComponents.put(component.name, component);
    }

    public void removeComponent(String name) {
        nestedComponents.remove(name);
    }
}
