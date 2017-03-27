package my.javarash.test;

/**
 * Created by asd on 27.03.2017.
 */
public class TestCat {
    static int catCount = 0;
    public TestCat() {
        catCount++;
    }
    protected void finalize(){
        System.out.println("Cat was destroyed");
    }

    public static void main(String[] args) {
        int i;
        for (i = 0; i < 410000; i++){
            TestCat cat = new TestCat();
        }
        System.out.println(catCount);

    }
}
