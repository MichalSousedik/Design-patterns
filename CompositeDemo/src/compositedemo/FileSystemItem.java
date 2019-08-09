package compositedemo;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public abstract class FileSystemItem {

    private final String name;
    
    protected int level;
    
    protected boolean deleted;
    
    public FileSystemItem(String name) {
        this.name = name;
        this.deleted = false;
    }

    public void delete() {
        deleted = true;
    }
    
    @Override
    public String toString() {
        StringBuilder str1 = new StringBuilder();
        for(int j=0;j<level;j++)
        {
            str1.append("    ");
        }
        return str1.toString() + name+  " deleted:" + deleted; 
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    
}
