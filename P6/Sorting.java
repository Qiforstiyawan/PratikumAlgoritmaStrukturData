package P6;

public class Sorting {
    int data[];
    int jumData;

    Sorting(int Data[], int jmlData){
        jumData = jmlData;
        data = new int[jumData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void tampil(){
        for(int i=0; i<jumData; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Bubble Sort
    void bubbleSort(){
        for(int i=0; i<jumData-1; i++){
            for(int j=0; j<jumData-i-1; j++){
                if(data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort
    void selectionSort(){
        for(int i=0; i<jumData-1; i++){
            int min = i;
            for(int j=i+1; j<jumData; j++){
                if(data[j] < data[min]){
                    min = j;
                }
            }
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }

    // Insertion Sort
    void insertionSort(){
        for(int i=1; i<jumData; i++){
            int key = data[i];
            int j = i-1;

            while(j>=0 && data[j] > key){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = key;
        }
    }
}

