// class Solution {
//     public int[][] merge(int[][] intervals) {
//         Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//         List<int[]> result = new ArrayList<>();
//         int[] current = intervals[0];
//         for (int i = 0; i < intervals.length; i++){
//             if (intervals[0] <= current[i]){
//                 current[i] = Math.max(current[i], interval[i]);
//             }else{
//                 result.add(current);
//                 current = interval;
//             }
//         }
//         return add(current);
//         return result.toArray(new int[resultSize()] []);
//     }
// }

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];

            if (interval[0] <= current[1]) {
                current[1] = Math.max(current[1], interval[1]);
            } else {
                result.add(current);
                current = interval;
            }
        }

        result.add(current);

        return result.toArray(new int[result.size()][]);
    }
}
