package compositePattern;

import java.util.ArrayList;

public class Folder implements FileSystemComponent {
    private ArrayList<FileSystemComponent> components;

    public Folder(ArrayList<FileSystemComponent> components) {
        this.components = components;
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }
    public ArrayList<FileSystemComponent> getChildren() {
        return components;
    }
    @Override
    public int getSize() {
        int sum = 0;
        for (FileSystemComponent component: components) {
            sum += component.getSize();
        }
        return sum;
    }
}
