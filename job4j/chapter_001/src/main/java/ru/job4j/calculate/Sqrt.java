package ru.job4j.calculate;


public class Sqrt {
    public int[] calculates(int bound){
        int [] rst=new int[bound];
        for(int i=0; i<=bound; i++){
            rst[i-1]=(int)Math.pow(i, 2 );
        }
        return rst;
    }
}
