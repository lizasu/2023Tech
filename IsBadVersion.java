public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // Binary Search - because its sorted. nlogn
        return binarySearch(1, n);
    }

    private int binarySearch(int left, int right) {
        if (isBadVersion(left)) {
            return left;
        }
        if (right == left + 1) {
            if (isBadVersion(right)) {
                return right;
            } else {
                return -1;
            }
        }
        // remember to use right - left / 2 to avoid overflow. what if both left and right are INT_MAX
        int mid = left+(right-left)/2;
        if (isBadVersion(mid)) {
            return binarySearch(left, mid);
        }
        else {
            return binarySearch(mid + 1, right);
        }
    }
}
