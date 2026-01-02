//Search for a given element in a sorted array using Binary Search.
import java.util.Scanner;
public class Binarysearch{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for (int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int key=sc.nextInt();

int low=0,high=n-1;
int foundIndex=-1;

while(low<=high){
int mid=(low+high)/2;

if(arr[mid]==key){
foundIndex=mid;
break;
}else if(arr[mid]<key){
low=mid+1;
}else{
high=mid-1;
}
}
System.out.println(foundIndex);
sc.close();
}

}
