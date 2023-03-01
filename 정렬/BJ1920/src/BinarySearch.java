public class BinarySearch {
    static int[] arr;

   public BinarySearch(int[] A){
       arr=A;
   }
    // 재귀적 탐색
    static int binarySearch1(int key, int low, int high) {
        int mid;

        if(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) { // 탐색 성공
                return mid;
            } else if(key < arr[mid]) {
                return binarySearch1(key ,low, mid-1); // 왼쪽 부분 탐색
            } else {
                return binarySearch1(key, mid+1, high); // 오른쪽 부분 탐색
            }
        }

        return -1; // 탐색 실패
    }

    // 반복적 탐색
    static int binarySearch2(int key, int low, int high) {
        int mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) {
                return mid;
            } else if(key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // 탐색 실패
    }

}
