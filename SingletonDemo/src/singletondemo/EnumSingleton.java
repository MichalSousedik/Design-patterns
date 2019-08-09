package singletondemo;

public enum EnumSingleton {
    
    INSTANCE;
    
    int answer = 42;
    public int getAnswer() {return answer;}
    

}
