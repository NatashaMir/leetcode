public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        int tmp = 0;

        if (j == 0){
            return;
        }

        while (i < j) {

            while ((i < j) & nums[i] != 0) {
                i++;
            }

            while ((i < j) & nums[j] == 0) {
                j--;
            }

            if (i < j) {
                tmp = i;
                while (nums[i] == 0){
                    i++;
                }
                nums[tmp] = nums[i];
                nums[i] = 0;
                i = tmp + 1;
            }
        }
    }

}
