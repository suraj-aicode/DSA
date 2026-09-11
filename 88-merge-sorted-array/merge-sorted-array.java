class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int arr[] = new int[m + n];
        int index = 0;

        for(int i = 0; i < m; i++){
            arr[index] = nums1[i];
            index++;
        }

        for(int j = 0; j < n; j++){
            arr[index] = nums2[j];
            index++;
        }

        Arrays.sort(arr);

        for(int i = 0; i < m + n; i++){
            nums1[i] = arr[i];
        }
    }
}