# Variable Scopes

## Scope of Java Instance Variables

variable. The general scope of an instance variable is throughout the class except in static methods. The lifetime of an instance variable is until the object stays in memory.

## Example: Scope of Java Instance Variables

```java
package com.tutorialspoint;

public class Puppy {
   private int puppyAge;
   
   public void setAge( int age ) {
      // access the instance variable and modify it	   
      puppyAge = age;
   }

   public int getAge( ) {
	  // access the instance variable  
      return puppyAge;
   }

   public static void main(String []args) {    
      Puppy myPuppy = new Puppy();
      myPuppy.setAge( 2 );
      System.out.println("Puppy Age :" + myPuppy.getAge() );
   }
}
```

> Biến instance được khai báo trong một lớp và ngoài tất cả các phương thức và khối. Phạm vi của biến instance là toàn bộ lớp, ngoại trừ các phương thức tĩnh. Thời gian tồn tại của biến instance là cho đến khi đối tượng còn tồn tại trong bộ nhớ.

## Scope of Java Local Variables

- Một biến được khai báo bên trong một lớp, bên ngoài tất cả các khối và được đánh dấu là static được gọi là biến lớp. 
- Vòng đời của một biến lớp là cho đến khi kết thúc chương trình hoặc miễn là lớp được tải trong bộ nhớ.

```java
package com.tutorialspoint;

public class Puppy {
   private int puppyAge;
   
   public void setAge( int age ) {
      // access the instance variable and modify it	   
      puppyAge = age;
   }

   public int getAge( ) {
	  // access the instance variable  
      return puppyAge;
   }

   public static void main(String []args) {    
      Puppy myPuppy = new Puppy();
      myPuppy.setAge( 2 );
      System.out.println("Puppy Age :" + myPuppy.getAge() );
   }
}
```

> Biến cục bộ được khai báo trong một phương thức, khối hoặc constructor. Phạm vi của biến cục bộ chỉ trong khối mà nó được khai báo và tồn tại cho đến khi khối đó kết thúc.

## Scope of Java Class (Static) Variables

Tất cả các biến khác không phải là biến thể hiện và biến lớp được coi là biến cục bộ bao gồm các tham số trong phương thức. Phạm vi của biến cục bộ nằm trong khối mà nó được khai báo và thời gian tồn tại của biến cục bộ là cho đến khi điều khiển rời khỏi khối mà nó được khai báo.

```java
package com.tutorialspoint;

public class Puppy {
   public static String BREED="Bulldog";

   public static void main(String []args) {    
      Puppy myPuppy = new Puppy();
      System.out.println("Breed :" + Puppy.BREED );
	  
      // local variables
      int a = 10;
      int b = 20;
      
      int c = a + b;
      
      System.out.println("c: " + c);
   }
}
```

> biến lớp được khai báo với từ khóa `static` và có phạm vi trong toàn bộ lớp. Thời gian tồn tại của biến lớp là cho đến khi chương trình kết thúc hoặc lớp không còn được tải trong bộ nhớ.