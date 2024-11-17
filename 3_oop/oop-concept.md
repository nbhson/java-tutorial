# OOP Concept

> Lập trình hướng đối tượng là một phương pháp hoặc mô hình để thiết kế chương trình bằng cách sử dụng các lớp và đối tượng. Nó đơn giản hóa việc phát triển và bảo trì phần mềm bằng cách cung cấp một số khái niệm.

![alt text](image.png)

## Object

- Trong lập trình hướng đối tượng, một `Object` là một thực thể có hai đặc điểm (states and behavior). 
- Một số `Object` trong thế giới thực là sách, điện thoại di động, bàn, máy tính, v.v.
- `Object` là một biến thuộc loại class, là thành phần cơ bản của hệ thống lập trình hướng đối tượng. 
- Một lớp có các phương thức và thành viên dữ liệu (thuộc tính), các phương thức và thành viên dữ liệu này được truy cập thông qua một `Object`. Do đó, một `Object` là một thể hiện của một lớp.

## Class

- Trong lập trình hướng đối tượng, một `Class` là một bản thiết kế mà từ đó các đối tượng riêng lẻ được tạo ra (hoặc chúng ta có thể nói một class là một kiểu dữ liệu của một kiểu đối tượng).
- Trong Java, mọi thứ đều liên quan đến các lớp và đối tượng. Mỗi lớp có các phương thức và thuộc tính riêng có thể được truy cập và thao tác thông qua các đối tượng.

## 4 Tính Chất Của Lập Trình Hướng Đối Tượng

### Tính kế thừa (Inheritance)

#### Định nghĩa
- Tính kế thừa cho phép xây dựng một lớp mới (lớp Con), kế thừa và tái sử dụng các thuộc tính, phương thức dựa trên lớp cũ (lớp Cha) đã có trước đó.

#### Mục đích
- Tái sử dụng mã: Kế thừa cho phép các lớp con (subclass) sử dụng lại các thuộc tính và phương thức của lớp cha (superclass), giúp giảm thiểu việc viết lại mã (khả năng tái sử dụng).
- Tính mở rộng: Kế thừa cho phép mở rộng các lớp hiện có mà không cần thay đổi mã nguồn của chúng. Điều này giúp dễ dàng thêm các tính năng mới.
  
> Tính chất này được thể hiện qua: Extend, Super, Single Inheritance
 
### Tính đa hình (Polymorphism)

#### Định nghĩa
- Thuật ngữ "đa hình" có nghĩa là "nhiều dạng". Trong lập trình hướng đối tượng, đa hình hữu ích khi bạn muốn tạo nhiều dạng có cùng tên của một thực thể duy nhất.

#### Mục đích
- Tính linh hoạt: Đa hình cho phép các đối tượng khác nhau có thể được xử lý thông qua cùng một giao diện hoặc phương thức. Điều này giúp mã trở nên linh hoạt hơn và dễ dàng mở rộng (chúng ta có nhiều phương thức có cùng tên nhưng tham số khác nhau).
- Tái sử dụng mã: Nhờ vào đa hình, bạn có thể viết mã một lần và sử dụng lại cho nhiều loại đối tượng khác nhau, giảm thiểu việc lặp lại mã.

> Tính chất này được thể hiện qua: overriding, overloading, implement/extend (nhiều class/interface), dynamic binding, static binding, static

### Tính trừu tượng (Abstraction)

#### Định nghĩa
- Ví dụ thực tế về sự trừu tượng là một chiếc ô tô, các chi tiết bên trong như động cơ, quá trình khởi động ô tô, quá trình chuyển số, v.v. được ẩn khỏi người dùng và các tính năng như nút khởi động, số, màn hình, phanh, v.v. được cung cấp cho người dùng. 

#### Mục đích
- Giảm độ phức tạp: Trừu tượng giúp ẩn đi các chi tiết cài đặt phức tạp và chỉ cung cấp các giao diện cần thiết cho người dùng. Điều này giúp người dùng dễ dàng tương tác với các đối tượng mà không cần hiểu rõ cách thức hoạt động bên trong.
- Tăng tính tái sử dụng: Bằng cách định nghĩa các lớp trừu tượng, bạn có thể tạo ra các phương thức mà không cần triển khai cụ thể. Các lớp con có thể kế thừa và cung cấp cách triển khai riêng, giúp tái sử dụng mã hiệu quả hơn.

> Tính chất này được thể hiện qua các bài: abstract class, interface

### Tính đóng gói(Encapsulation)

#### Định nghĩa
- Tính chất này nhằm bảo về đối tượng không bị truy cập từ code bên ngoài vào để thay đổi giá trị các thuộc tính hoặc truy cập trực tiếp.
- Tính chất này giúp tăng tính bảo mật cho đối tượng và tránh tình trạng dữ liệu bị hư hỏng ngoài ý muốn.

#### Mục đích
- Bảo vệ dữ liệu: Đóng gói cho phép bạn ẩn các thuộc tính (biến) của một lớp khỏi việc truy cập trực tiếp từ bên ngoài. Điều này giúp bảo vệ dữ liệu và ngăn chặn việc thay đổi không mong muốn từ các phần khác của chương trình.
- Kiểm soát truy cập: Bằng cách sử dụng các modifier như private, protected, và public, bạn có thể kiểm soát cách thức mà các thuộc tính và phương thức của lớp được truy cập và sử dụng. Điều này giúp đảm bảo rằng chỉ có các phương thức trong lớp mới có thể thay đổi trạng thái của đối tượng.

> Tính chất này được thể hiện qua các bài: access modifier, setters, getters.


## Ưu điểm của Java OOP 
Sau đây là những ưu điểm của việc sử dụng OOP trong Java: 
- Việc triển khai các khái niệm OOP dễ dàng hơn. 
- Việc thực thi OOP nhanh hơn lập trình hướng thủ tục. 
- OOP cung cấp khả năng tái sử dụng mã để lập trình viên có thể tái sử dụng mã hiện có. 
- OOP giúp chúng ta giữ dữ liệu quan trọng được ẩn.