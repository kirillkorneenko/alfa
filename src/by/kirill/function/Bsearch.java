package by.kirill.function;

import java.util.ArrayList;

public class Bsearch {

    public static Integer bsearch(ArrayList<Integer> arrayList, Integer k, final ArrayList<Integer> constList){

        int i = arrayList.size();
        Integer integer = null;

        if(i ==1){
            if(arrayList.get(0)<k){
            integer= constList.indexOf(arrayList.get(0));}
            else integer= null;
        }
        else{

            ArrayList<Integer> arrayList1 = new ArrayList<>();

                if(arrayList.get((i-1)/2)< k){
                    for(int f =0 ; f<=(i-1)/2; f++){
                        arrayList1.add(arrayList.get(f));
                    }
                    integer =bsearch(arrayList1,k,constList);
                }
                else{
                    for(int f =i/2 ; f<i; f++){
                        arrayList1.add(arrayList.get(f));
                    }
                    integer =bsearch(arrayList1,k,constList);
                }

        }
       return integer;

    }
}
