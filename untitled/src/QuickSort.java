public class QuickSort {
    public static void swap(int[] a ,int x,int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    public static int partition(int[] a ,int l,int r){
        int i = l;
        int j = r-1;
        int pivot = a[r];

        for(;;){
            while (a[i] < pivot){
                i++;
            }
            while ((i < j)&& (pivot < a[j])){
                j--;
            }
            if (i >=j){
                break;
            }
            swap(a,i,j);
        }
        swap(a,i,r);
        return i;
    }
    public static void quickSort(int[] a,int l,int r){
        if (l>=r){
            return ;
        }
        int v = partition(a,l,r);
        D12.print(a);
        quickSort(a,l,v-1);
        quickSort(a,v+1,r);

    }
    public static void sort(int[] a){
        quickSort(a,0,a.length-1);
    }
}
