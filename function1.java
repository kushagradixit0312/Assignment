import java.util.*;
public class function1{
public static int mulIs(int a, int b){

int mul=a*b;
return mul;
}
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int mul=mulIs(a,b);
System.out.println(mul);
}
}

