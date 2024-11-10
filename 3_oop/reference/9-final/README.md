# Final 

Trong Java, từ khóa final được sử dụng để chỉ định rằng một biến, phương thức hoặc lớp không thể bị thay đổi hoặc ghi đè. Dưới đây là các cách sử dụng chính của final

## Final Variables:

Khi một biến được khai báo là final, giá trị của nó không thể thay đổi sau khi được gán lần đầu tiên. Điều này có nghĩa là bạn không thể gán lại giá trị cho biến đó.

```java
final int x = 10;
   // x = 20; // Lỗi biên dịch: không thể gán lại giá trị cho biến final
```

## Final Methods:

Khi một phương thức được khai báo là final, nó không thể bị ghi đè (overridden) trong các lớp con. Điều này hữu ích khi bạn muốn bảo vệ một phương thức khỏi việc bị thay đổi hành vi trong các lớp kế thừa.

```java
   class Animal {
       final void move() {
           System.out.println("Animals can move");
       }
   }

   class Dog extends Animal {
       // void move() { // Lỗi biên dịch: không thể ghi đè phương thức final
       //     System.out.println("Dogs can walk and run");
       // }
   }
```

##  Final Classes:

Khi một lớp được khai báo là final, nó không thể được kế thừa. Điều này có nghĩa là không thể tạo ra một lớp con từ lớp final.

```java
 final class FinalClass {
       // Nội dung lớp
   }

   // class SubClass extends FinalClass { // Lỗi biên dịch: không thể kế thừa từ lớp final
   // }
```

Tóm tắt:
- Biến final: Không thể thay đổi giá trị sau khi gán.
- Phương thức final: Không thể bị ghi đè trong lớp con.
- Lớp final: Không thể được kế thừa.