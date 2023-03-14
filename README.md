### pattern
1.Print the following pattern.
```
*****
*****
*****
*****
*****
```

### PROGRAM:
```
public class pattern1 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```
### OUTPUT:
```
*****
*****
*****
*****
*****
```


2.Print the following patten.
```
*********
 *******
  *****
   ***
    *
```

### PROGRAM:
```
public class pattern2
{
    public static void main(String[] args) {
            int rows = 5;
            int spaces = 0;
            for (int i = rows; i >= 1; i--) {
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
                spaces++;
            }
        }
    }
```
### OUTPUT:
```
*********
 *******
  *****
   ***
    *
```

3.Print the following pattern.
```
*
**
***
****
*****
****
***
**
*
```

### PROGRAM:
```
public class pattern3
{
    public static void main(String[] args) {
            int rows = 5;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = rows - 1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
```
### OUTPUT:
```
*
**
***
****
*****
****
***
**
*
```
