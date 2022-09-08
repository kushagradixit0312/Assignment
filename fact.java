import java.util.*;
public class function2{
public static int factIs(int a){
int m=1;
for(int i=1;i<=a;i++){
m=m*i;
return i;
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int fact=factIs;
System.out.println(fact);
}
}
