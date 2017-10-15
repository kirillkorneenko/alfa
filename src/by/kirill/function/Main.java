package by.kirill.function;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>();
        Integer i = (int) (Math.random()*100);
        for(int k = 0; k<i; k++){
            arrayList.add((int)((Math.random()*201)-100));
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        Integer k =(int)((Math.random()*201)-100);


        System.out.println(arrayList);
        System.out.println("Число K = " +k);

        Integer result =Bsearch.bsearch(arrayList,k, arrayList);

        if(result !=null) {
            System.out.println("a["+ result+ "]= "+ arrayList.get(result));
        }

        else System.out.println("Элемент не найден");


    }
}
