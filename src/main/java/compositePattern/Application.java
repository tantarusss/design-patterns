package compositePattern;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Folder root = new Folder(new ArrayList<>());
        Folder firstSubFolder = new Folder(new ArrayList<>());
        firstSubFolder.add(new File());
        firstSubFolder.add(new File());
        firstSubFolder.add(new File());
        root.add(firstSubFolder);
        root.add(new File());
        System.out.println(root.getSize());
    }
}
