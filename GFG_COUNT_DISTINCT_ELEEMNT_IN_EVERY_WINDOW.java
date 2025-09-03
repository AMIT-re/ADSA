class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> ll = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i < k; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        ll.add(hm.size());

        for(int i = k; i < arr.length; i++) {
            int n = arr[i - k]; // element to remove
            hm.put(n, hm.get(n) - 1); // decrement frequency
            if(hm.get(n) == 0) {
                hm.remove(n);
            }

            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1); // element to add
            ll.add(hm.size());
        }

        return ll;
    }
}
