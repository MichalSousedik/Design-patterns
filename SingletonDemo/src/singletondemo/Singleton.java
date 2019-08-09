package singletondemo;

    public class Singleton {
        
        private int answer;
        private static Singleton instance;
        
        public int getAnswer() {return answer;}
        
        private Singleton() {
            this.answer = 42;
        }
        
        public static Singleton getInstance() {
            if(instance == null) {
                synchronized (Singleton.class) {
                    if(instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }
    