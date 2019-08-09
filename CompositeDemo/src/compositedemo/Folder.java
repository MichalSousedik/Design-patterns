package compositedemo;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Folder extends FileSystemItem {

    public Folder(String name) {
        super(name);
    }

    private Set<FileSystemItem> containedItems = new HashSet<>();
    
    @Override
    public void delete() {
        containedItems.stream().forEach(FileSystemItem::delete);
        super.delete();
    }

    public Set<FileSystemItem> getContainedItems() {
        return containedItems;
    }   
    
    public void addChildFileSystemItem(FileSystemItem fileSystemItem) {
        fileSystemItem.setLevel(this.level+1);
        containedItems.add(fileSystemItem);
    }
    
    @Override
    public String toString() {

        StringBuilder str1 = new StringBuilder();
        for(int j=0;j<level;j++)
        {
            str1.append("    ");
        }
        return super.toString() + " dir:[\n" + containedItems.stream().map(FileSystemItem::toString).collect(Collectors.joining("\n")) + "\n" +  str1.toString() + "]";
    }
    
}
