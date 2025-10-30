import java.util.Scanner; 

public class Binary_Search { 

public void search() { 

Scanner sc = new Scanner(System.in); 

System.out.println("Enter the number of elements you want to store: "); 

int n = sc.nextInt(); 

int[] array = new int[n]; 

System.out.println("Enter sorted elements in the array: "); 

for (int i = 0; i < n; i++) { 

array[i] = sc.nextInt(); 

} 

System.out.println("Array elements are: "); 

for (int i = 0; i < n; i++) { 

System.out.print(" " + array[i]); 

} 

System.out.println(); 

System.out.println("Please enter an element to find in the array"); 

int t = sc.nextInt(); 

int l = 0; 

int r = array.length - 1; 

int c = 0; 

while (l <= r) { 

int mid = l + (r - l) / 2; 

if (array[mid] == t) { 

System.out.println("Element found at index " + mid); 

c++; 

return; 

} else if (array[mid] < t) { 

l = mid + 1; 

} else { 

r = mid - 1; 

} 

} 

if (c == 0) 

System.out.print("Element not found"); 

} 

public static void main(String[] args) { 

Binary_Search b = new Binary_Search(); 

b.search(); 

} 

} 