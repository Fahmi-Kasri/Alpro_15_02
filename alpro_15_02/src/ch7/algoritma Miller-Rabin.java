  public class Prime {

        public static boolean isPrime1(int n) {
            if (n <= 1) {
                return false;
            }
            if (n == 2) {
                return true;
            }
            for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static boolean isPrime2(int n) {
            if (n <= 1) {
                return false;
            }
            if (n == 2) {
                return true;
            }
            if (n % 2 == 0) {
                return false;
            }
            for (int i = 3; i <= Math.sqrt(n) + 1; i = i + 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }



public class PrimeTest {

    public PrimeTest() {
    }

    @Test
    public void testIsPrime() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {

        Prime prime = new Prime();
        TreeMap<Long, String> methodMap = new TreeMap<Long, String>();


        for (Method method : Prime.class.getDeclaredMethods()) {

            long startTime = System.currentTimeMillis();

            int primeCount = 0;
            for (int i = 0; i < 1000000; i++) {
                if ((Boolean) method.invoke(prime, i)) {
                    primeCount++;
                }
            }

            long endTime = System.currentTimeMillis();

            Assert.assertEquals(method.getName() + " failed ", 78498, primeCount);
            methodMap.put(endTime - startTime, method.getName());
        }


        for (Entry<Long, String> entry : methodMap.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey() + " Milli seconds ");
        }
    }
}