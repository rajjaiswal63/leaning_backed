package javaBasics.learningJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamsWithDiffrentsCollections {
    public static void main(String[] args) {
        // From collection : eg. collection.stream().
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer>numsStr=nums.stream();
        numsStr.forEach(System.out::print);

        System.out.println();
        //From arrays : eg-Arrays.stream(arrays)
        int[] nums2={11,12,13,14,15,16,17,18};
        IntStream nums2str= Arrays.stream(nums2);
        nums2str.forEach(System.out::print);

        System.out.println();
        //
    }
}
