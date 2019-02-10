public class MergeSortMain {

    private static int[] vector ; // Se adauga numere neordonate in vector

    private static void merge(int[] left,int[] right,int[] vector){
        int dimL = left.length;
        int dimR = right.length;
        int i =0, j = 0, k = 0;

        while (i < dimL && j < dimR){
            if(left[i] < right[j]){
                vector[k] = left[i];
                i += 1;
            }else{
                vector[k] = right[j];
                j += 1;
            }
            k+= 1;
        }

        while (i < dimL){
            vector[k] = left[i];
            k += 1;
            i += 1;
        }

        while (j < dimR) {
            vector[k] = right[j];
            k += 1;
            j += 1;
        }
    }
    private static void mergeSort(int[] vector){
        int length = vector.length;
        int mid = length/2;

        if(mid < 1){
            return;
        }

        int[] left = new int[vector.length/2];
        int[] right = new int[vector.length  - mid];

        for(int i = 0 ; i < mid; i++){
            left[i] = vector[i];
            System.out.print(left[i] + " ");
        }

        System.out.println();

        for (int j = mid; j < length; j += 1){
            right[j-mid] = vector[j];
            System.out.print(right[j-mid] + " ");
        }

        System.out.println();

        mergeSort(left);
        mergeSort(right);
        merge(left,right,vector);
    }

    public static void main(String args[]){
        mergeSort(vector);
        for(int x : vector){
            System.out.print(x + " ");
        }
    }
}
