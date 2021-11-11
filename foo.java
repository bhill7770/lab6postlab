public class foo {
public static void main(String args[]) {
int x = 0, i = 1, y;
while (i <= 3) {
y = i * i;
x = y + x;
i++;
}
System.out.println("x=" + x);
}
}
