package Pattern;
public class solid_rhombus {
public static void solid_rhombus (int n) {
for(int i=1;i<=n;i++) {
//star
for(int j=1;j<=n-i;j++) {
System.out.print(" ");
}
//SPACE
for(int j=1;j<=n;j++) {
System.out.print("*");
System.out.println();
}}}
public static void main(String[] args) {
solid_rhombus (4);
}
}