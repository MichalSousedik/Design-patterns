package iteratordemo;

import java.util.Iterator;

public class Client implements Iterable<Client>{

    @Override
    public Iterator<Client> iterator() {
        return new Iterator<Client>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Client next() {
                return new Client();
            }
            
        };
    }

    
}
