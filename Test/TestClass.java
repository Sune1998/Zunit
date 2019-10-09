public class TestClass  extends TestSuite{
    @Override
    protected void testliste() {
        testThis();
        TestThat();

    }

    public void testThis () {
        int result = 5;
        assertEquals(5, result);

    }

    public void TestThat() {
        assertEquals(3, 7);
    }
}
