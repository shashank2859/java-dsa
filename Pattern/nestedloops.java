 package Pattern;
 public class nestedloops {

public static void pizza_shape(int n) {

for(int i=1;i<=n;i++) {
for(int j=1;j<=i;j++) {
System.out.print("*"+" ");

}

System.out.println();

}

for(int i=n-1;i>=1;i--) {

for(int j=1;j<=i;j++) {

System.out.print("*"+" ");

}

System.out.println();

}
}

public static void main(String[] args) {

pizza_shape(4);

}
}