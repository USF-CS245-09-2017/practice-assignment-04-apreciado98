public class BubbleSort implements SortingAlgorithm {
    public void sort(int [] a){
        for(int i=0; i<a.length-1; i++) { //going through and comparing elements
            for (int j = 0; j<a.length-1-i; j++) {
                if (a[j] > a[j+1]) { //swap the two elements
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
