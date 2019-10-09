public abstract class TestSuite {

    private int passed;
    private int failed;

    public void  runTestSuite () {
       passed = 0;
       failed = 0;

       testliste();
        System.out.println("Test passed" + passed);
        System.out.println("Test failed" + failed);
    }
protected abstract void testliste();

    public  void  assertEquals (int expected, int actual) {
        if (expected == actual) {
            passed++;
        }
        else {
            failed++;
            System.out.println("Expected" + expected +
                    "\nActual:" + actual);
        }

    }

}
