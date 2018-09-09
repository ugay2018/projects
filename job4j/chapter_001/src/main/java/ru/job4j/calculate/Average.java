package ru.job4j.calculate;

public class Average {
    public static void main(String[] args) {
        int  arns[]={11, 22, 33,14, 15};
        int  result=0;

        for(int i=0; i<arns.length; i++){
            if(arns[i]%2 == 0){
                result+=arns[i];
            }

        }

        System.out.println(result);
        int res=  arns[0];
        int max=Integer.MAX_VALUE;
        for(int j=0; j<arns.length; j++){
            if(j>res){
             res=max;
             max=j;
            }
        }
        System.out.println("" +max+ "");
    }
}
