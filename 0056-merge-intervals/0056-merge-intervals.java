class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List <int[]> List = new ArrayList<>();

        for (int[] interval: intervals){

            if (!List.isEmpty()||
             List.get(listSize - 1)[1] < interval[0]){

                list.add(intervals);
             }else {
                list.get(listSize - 1)[1] =
                 Math.max (list.get(listSize - 1)[1], interaval[1]);
             }
        }
     return list.toArray(new int[list.size()][]);
    }
}
