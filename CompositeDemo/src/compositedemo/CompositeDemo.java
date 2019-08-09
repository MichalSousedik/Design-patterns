package compositedemo;

import java.util.stream.IntStream;

public class CompositeDemo {

    public static void main(String[] args) {
        
        Folder root = new Folder("root");
        Folder a = new Folder("a");
        Folder b = new Folder("b");
        File f = new File("f");
        File g = new File("g");
        Folder c = new Folder("c");
        root.addChildFileSystemItem(a);
        root.addChildFileSystemItem(c);
        a.addChildFileSystemItem(b);
        b.addChildFileSystemItem(f);
        b.addChildFileSystemItem(g);
        IntStream.range(1, 10).forEach(i -> root.addChildFileSystemItem(new Folder(i + "folder"))); 
        IntStream.range(1, 5).forEach(i -> root.addChildFileSystemItem(new File(i + "file"))); 
        root.delete();
        System.out.println(root);
        
    }

}
