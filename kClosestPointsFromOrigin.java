    // Given list of points, and a target number k, return k closest points from origin.
    // Euclidean Dist = sqrt((x1-x2)^2 + (y1 - y2)^2)
    // answer in any order
    // unique answer - list of k points
    // priority queue , comparator
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> qu = new PriorityQueue<>(k, (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0]*a[0] + a[1] * a[1]));
        for(int[] pt: points) {
            qu.add(pt);
            if(qu.size() > k) qu.poll();
        }
        return qu.toArray(new int[0][0]);
    }
