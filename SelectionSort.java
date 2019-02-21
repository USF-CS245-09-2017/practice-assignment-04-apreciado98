public class SelectionSort implements SortingAlgorithm {
     public void sort(int [] a){
        for(int i=0; i<a.length; i++) {
            int temp = i;
            for(int j=i+1; j<a.length; j++){
                if (a[j]<a[temp]){
                    temp=j; //finding the smallest index
                }
            }
            //constantly replacing with smallest element
            int smallest = a[temp];
            a[temp] = a[i];
            a[i]=smallest;
        }
    }
}
