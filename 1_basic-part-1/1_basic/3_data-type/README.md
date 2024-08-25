# Data Types

Có 2 kiểu dữ liệu trong java:
- Kiểu dữ liệu nguyên thủy: có 8 kiểu dữ liệu nguyên thủy trong java
    

-	Kiểu dữ liệu tham chiếu
    - Kiểu dữ liệu tham chiếu là kiểu dữ liệu của đối tượng, biến của kiểu dữ liệu tham chiếu chỉ chứa địa chỉ của đối tượng tại bộ nhớ stack. Đối tượng dữ liệu lại nằm ở bộ nhớ Heap. Một số kiểu dữ liệu cụ thể như các mảng (Array), lớp đối tượng (Class) hoặc kiểu lớp giao tiếp (Interface) 

## Java Primitive Data Types

There are eight primitive data types supported by Java. Below is the list of the primitive data types:

- **Boolean**: giá trị là true hoặc false.
- **Byte**: lưu trữ kiểu số nguyên kích cỡ là 1 byte (1 byte = 8 bit). Có giá trị lưu trữ từ -128 đến 127.
- **Short**: lưu trữ kiểu số nguyên kích cỡ là 2 byte (16 bit). Giá trị có thể lưu từ -32,768 đến 32,767.
- **Int**: lưu trữ kiểu số nguyên kích cỡ là 4 byte (32 bit). Gía trị có thế lưu từ -2,147,483,648 đến 2,147,483,647.
- **Long**: lưu trữ kiểu số nguyên kích cỡ là 8 byte (64 bit). Gía trị có thể lưu từ … đến …
- **Float**: lưu trữ kiểu số thực kích cỡ là 4 byte. Khi gán giá trị cần “f” phía sau.
- **Double**: lưu trữ kiểu số thực kích cỡ là 8 byte. Khi gán giá trị có thể có hoặc không “d” ở phía sau.
- **Char**: Kiểu dữ liệu để lưu trữ kí tự trong bảng Unicode

```java
public class JavaTester {
   public static void main(String args[]) {

      byte byteValue1 = 2;
      byte byteValue2 = 4;
      byte byteResult = (byte)(byteValue1 + byteValue2);

      System.out.println("Byte: " + byteResult);

      short shortValue1 = 2;
      short shortValue2 = 4;
      short shortResult = (short)(shortValue1 + shortValue2);

      System.out.println("Short: " + shortResult);

      int intValue1 = 2;
      int intValue2 = 4;
      int intResult = intValue1 + intValue2;

      System.out.println("Int: " + intResult);

      long longValue1 = 2L;
      long longValue2 = 4L;
      long longResult = longValue1 + longValue2;

      System.out.println("Long: " + longResult);

      float floatValue1 = 2.0f;
      float floatValue2 = 4.0f;
      float floatResult = floatValue1 + floatValue2;

      System.out.println("Float: " + floatResult);

      double doubleValue1 = 2.0;
      double doubleValue2 = 4.0;
      double doubleResult = doubleValue1 + doubleValue2;

      System.out.println("Double: " + doubleResult);

      boolean booleanValue = true;

      System.out.println("Boolean: " + booleanValue);

      char charValue = 'A';

      System.out.println("Char: " + charValue);     
   }
}
```

## Java Reference/Object Data Type

- The reference data types are created using defined constructors of the classes. - They are used to access objects. These variables are declared to be of a specific type that cannot be changed. For example, Employee, Puppy, etc.

```java
// Creating an object of 'Animal' class
Animal animal = new Animal("giraffe");

// Creating an object of 'String' class
String myString = new String("Hello, World!");
```