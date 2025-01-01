class Solution {
    public int findNumbers(int[] nums) {
        int varCount = 0;
        for (int a : nums) {
            // Check numbers of a
            // If is even -> varCount + 1
            int digitNumber = calDigit(a);
            if (digitNumber % 2 == 0) {
                varCount++;
            }

        }
        return varCount;
    }

    private int calDigit(int a) {
        int varCount = 0;
        int result = a;
        while (result != 0) {
            result = a / 10;
            a = result;
            varCount++;
        }

        return varCount;
    }
}