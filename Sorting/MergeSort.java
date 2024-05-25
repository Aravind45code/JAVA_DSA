package Sorting;

public class MergeSort {
  void merge(int []arr,int l,int m,int r){
     int size=r-l+1;
     int []temp=new int[size];
     int i=l;
     int j=m+1;
     int k=0;
     while(i<=m && j<=r){
      if(arr[i]<=arr[j]){
        temp[k++]=arr[i++];
      }
      else{
        temp[k++]=arr[j++];
      }
     }
     while(i<=m){
      temp[k++]=arr[i++];
     }
     while(j<=r){
      temp[k++]=arr[j++];
     }
     for(i=l;i<=r;i++){
      arr[i]=temp[i-l];
     }

  }
  void mergeSort(int arr[],int l,int r){
    if(l<r){
      int mid=l+(r-l)/2;
      mergeSort(arr, l, mid);
      mergeSort(arr, mid+1, r);
      merge(arr, l, mid, r);
    }

  }
}
class Main{
  public static void main(String[] args) {
    MergeSort ms=new MergeSort();
    int []arr={5,4,3,2,1};
    ms.mergeSort(arr, 0, 4);
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
