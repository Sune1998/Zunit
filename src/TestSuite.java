public abstract class TestSuite {

    private int passed;
    private int failed;

    public void  runTestSuite () {
       passed = 0;
       failed = 0;

       testliste();
    }
protected abstract void testliste();

    public  void  assertEquals (int expected, int actual) {
        // TODO

    }

}
