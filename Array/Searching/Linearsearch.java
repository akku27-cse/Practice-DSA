public class Linearsearch {
    public static void main(String[] args) {    
    int arr[]={4,1,2,3,7,9,6,15,10,11};
    int find=110,flasg=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==find){
            System.out.println("Element found at index: "+i);
             flasg++;
            break;
        }
    }
    if(flasg==0){
        System.out.println("Element not found in the array");
    }
    else{
        System.out.println("Element found in the array");
    }
}
}
