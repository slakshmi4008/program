package LeetcodeAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation46 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList));
        System.out.println("list values");
        System.out.println(list);
        for (int i = start; i < nums.length; i++) {
            System.out.println("templist values");
            tempList.add(nums[i]);
            System.out.println(tempList);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
