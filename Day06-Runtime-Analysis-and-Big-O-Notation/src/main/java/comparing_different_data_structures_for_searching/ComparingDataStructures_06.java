package comparing_different_data_structures_for_searching;

import java.util.HashSet;
import java.util.TreeSet;

public class ComparingDataStructures_06 {

    public static void main(String[] args) {
        int[] size={1000, 100000, 1000000};

        for(int i=0; i<size.length; i++){
            System.out.println("Comparing Data Structures For "+size[i]+" Dataset Size :");

            long time1=forArray(size[i]);
            System.out.println("Array   :"+(time1/1000)+" ms");

            long time2=forHashSet(size[i]);
            System.out.println("HashSet :"+(time2/1000)+" ms");

            long time3=forTreeSet(size[i]);
            System.out.println("TreeSet :"+(time3/1000)+" ms");
        }
    }

    public static long forArray(int n){
        int[] arr=new int[n];
        for(int j=0; j<n; j++){
            arr[j]=j+1;
        }
        long startTime=System.nanoTime();
        for(int i=0; i<n; i++){
            if(arr[i]==n){
                break;
            }
        }
        long endTime=System.nanoTime();
        return (endTime-startTime);
    }

    public static long forHashSet(int n){
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0; i<n; i++){
            hashSet.add(i+1);
        }
        long startTime=System.nanoTime();
        boolean b=hashSet.contains(n);
        long endTime=System.nanoTime();
        return (endTime-startTime);
    }

    public static long forTreeSet(int n){
        TreeSet<Integer> treeSet=new TreeSet<>();
        for(int i=0; i<n; i++){
            treeSet.add(i+1);
        }
        long startTime=System.nanoTime();
        boolean b=treeSet.contains(n);
        long endTime=System.nanoTime();
        return (endTime-startTime);
    }

}
