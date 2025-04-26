public class BinarySearch {
    public static void main(String[] args) {
        
       int arr[]={1,2,3,4,5,6,7,8,9,10};
       int ub=0,lb=arr.length-1,mid=0;
       int find=13;
       mid=(ub+lb)/2;
       while(ub<=lb){
        if(arr[mid]==find){
            System.out.println("found at index"+ mid);
            break;
        }else if(arr[mid]<find){
            ub=mid+1;

        }
        else{
            lb=mid-1;
        }
        mid=(ub+lb)/2;
       }
       if(ub>lb){
        System.out.println("Element not found in the array");
       }
    }
}
