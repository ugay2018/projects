package ru.job4j.calculate;

/**
 * 
 */
public class Max {

    /**
     * @param first
     * @param second
     * @return
     */
    public int maxBetweenTwoNumbers(int first, int second) {
        return(first > second)? first : second;
    }

    /**
     * @param first
     * @param second
     * @param third
     * @return
     */
    public int maxBetweenThreeNumbers(int first, int second, int third){
        return Math.max(first, Math.max(second, third));
    }
}
