package ru.job4j.calculate;

/**
 *Создать программу вычисляющую факториал
 */
public class Factorial {
    /**
     * @param n
     * @return result
     */
    public int calc(int n){
        if(n==0){
            return 0;
        }
        int result = 1;
        for(int i = 1; i<=n; i++){
            result = result * i;
        }
        return result;
    }
}
