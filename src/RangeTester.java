public class RangeTester {
    public static void main(String[] args) {
        // 11 numbers in the range - 7 to 17
        Range range = new Range(7, 17);

        RangeIterator iter = new RangeIterator(range);

//        while (iter.hasNext()) {
//            int num = iter.next();
//            System.out.println(num);
//        }

        for (int num : range) {
            System.out.println(num);
        }
    }
}
