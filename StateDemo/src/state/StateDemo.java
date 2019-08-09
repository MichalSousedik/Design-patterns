package state;

public class StateDemo {

    public static void main(String[] args) {
        Document doc = new Document();
        System.out.println(doc);
        doc.approve();
        System.out.println(doc);
        doc.approve();
        doc.archive();
        doc.approve();
        System.out.println(doc);
        doc.setTitle("Title");
        doc.archive();
        System.out.println(doc);
        doc.approve();
        doc.archive();
        doc.archive();

    }

}
