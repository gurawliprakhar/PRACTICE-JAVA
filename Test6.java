public class Test6 {
    static int removeDuplicate(int[] ar) {
        int rd = 0;

        for (int i = 0; i < ar.length; i++) {

            if (ar[rd] != ar[i]) {
                rd++;
                ar[rd] = ar[i];
            }
        }
        return rd + 1;
    }

    static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int[] a, int k) {

        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }

        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 2);
        reverse(a, 0, a.length - 1);

    }

    static void subArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
    }

    static int[] inverse(int[] a) {
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int v = a[i];
            b[v] = i;
        }
        return b;
    }

    static void leadersInArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] >= a[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader == true) {
                System.out.println(a[i]);
            }
        }
    }

    static void frequency(int[] a) {

        int freq = 1;
        int i = 1;

        while (i < a.length) {
            while (i < a.length && a[i] == a[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(a[i - 1] + " " + freq);
            freq = 1;
            i++;
        }
        if (a.length == 1 || a[i - 1] != a[i - 2]) {
            System.out.println(a[i - 1] + " " + freq);
        }
    }

    static void Pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int longestSubArray(int[] a) {
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i - 1] % 2 != 0 ||
                    a[i] % 2 != 0 && a[i - 1] % 2 == 0) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 1;
            }
        }
        return maxCount;
    }

    static int maxSumSubArray(int[] a, int k) {
        int wSum = 0;
        int mSum = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            wSum += a[i];
        }
        for (int i = k; i < a.length; i++) {
            wSum = wSum - a[i - k] + a[i];
            mSum = Math.max(mSum, wSum);
        }
        return mSum;
    }

    static void minConsecutiveFlips(int[] a) {

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                if (a[i] != a[0]) {
                    System.out.print("From index " + i);
                } else {
                    System.out.print(" to " + (i - 1) + "\n");
                }
            }
        }

        if (a[a.length - 1] != a[0]) {
            System.out.println(" to " + (a.length - 1));
        }
    }
}
