public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // Tree : Root is room0, branches will be the other rooms you can go from one room
        // Goal : Find if all rooms are visited
        
        // Brute Force : For every room, go over all other rooms it can go to and start collecting keys.
        // O(mn) - n number of rooms, m is number of keys in each room
        // Set<Integer> visitedRooms = new HashSet<Integer>();
        // for(List<Integer>> keys : rooms) {
        //     for (Integer key : keys) {
        //         if (!visitedRooms.contains(key)) {
        //             visitedRooms.add(key);
        //         }
        //     }
        // }

        // BFS
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;

        Queue<Integer> keys = new LinkedList<>();
        keys.addAll(rooms.get(0));
        while(!keys.isEmpty()) {
            int room = keys.poll();
            if (!visited[room]) {
                visited[room] = true;
                keys.addAll(rooms.get(room));
            }
        }

        for (boolean vis: visited) {
            if (!vis) return false;
        }
        return true;
    }
