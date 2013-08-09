import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class insertionsort1 {
public static void main(String[] args)throws IOException{

BufferedReader a = new BufferedReader (new InputStreamReader(System.in));
int s = Integer.parseInt(a.readLine());
String array = a.readLine();

StringTokenizer st = new StringTokenizer(array);
int[] ar = new int[s];
int i=0;

while (st.hasMoreElements()){
//System.out.println(st.nextElement());
ar[i]=Integer.parseInt(st.nextToken());
i++;
}
//for (int i=0; i < s-1; s++){
//System.out.println(st.nextToken());
//ar[i]=Integer.parseInt(st.nextToken());
//}
System.out.println(ar[0]);
System.out.println(s);
int v = ar[s-1];
for (int i=0;i<s-1;i++){

}
}
}
