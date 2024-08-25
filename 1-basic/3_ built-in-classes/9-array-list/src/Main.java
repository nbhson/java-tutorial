import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		
		//	ArrayList được sử dụng như một mảng động để lưu trữ các phần tử.
		//
		//	Những điểm cần ghi nhớ về ArrayList:
		//
		//	+ Lớp ArrayList trong java có thể chứa các phần tử trùng lặp.
		//	+ Lớp ArrayList duy trì thứ tự của phần tử được thêm vào.
		//	+ Lớp ArrayList là không đồng bộ (non-synchronized).
	
		//	+ Lớp ArrayList trong java, thao tác chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách.
		// 	+ ArrayList nội bộ sử dụng mảng động để lưu trữ các phần tử.
		//  + chỉ có thể hoạt động như một list vì nó chỉ implements giao tiếp List.
		//  + ArrayList là tốt hơn trong việc lưu trữ và truy cập dữ liệu.

		
		// add: thêm phần tử vào arrList
		// set(index): update phần tử
		// get(index): lấy phần tử
		// remove(index): xóa phần tử của list
		// clear(): xóa tất cả các phần tử ra khỏi arrList
		// contains(value): kiểm tra phần tử có tồn tại trong list không
		
		// addAll: thêm tất cả phần tử của một arrList vào một arrList khác
		// retainAll: xóa những phần tử của listA không có trong listB
		// removeAll: xóa tất cả những phần tử của listA ra khỏi listB
		
		// indexOf: tìm phần tử đầu tiên xuất hiện trong list
		// lastIndexOf: tìm phần tử xuất hiện cuối cùng trong list
		// toArray: chuyển list thành mảng
		

		// Array List
		ArrayList<String> originList = new ArrayList<String>();
		originList.add("Java");
		originList.add("C++");
		originList.add("PHP");
        System.out.println(originList );
        System.out.println(originList.size());
        System.out.println(originList.get(0));
        
        // sử dụng Iterator - hiển thị các phần tử của list
        Iterator<String> iterator = originList.iterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
        
        // sử dụng ListIterator - hiển thị các phần tử của list
        ListIterator<String> listIterator = originList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println((String) listIterator.next());
        }
		
        ArrayList<String> listA = new ArrayList<String>();
        // thêm các phần tử của originList vào listA
        listA.addAll(originList);
        System.out.println(listA); // [Java, C++, PHP]
        
        
        ArrayList<String> listB = new ArrayList<String>();
        listB.add("Java");
        // xóa những phần tử không thuộc listB ra khỏi listA
        listA.retainAll(listB);
        
        System.out.println("listA: " + listA); // [Java]
        System.out.println("listB: " + listB); // [Java]
		        
        // xóa những phần tử thuộc listB khỏi originList
        originList.removeAll(listB);
        System.out.println("removeAll: " + originList); // [C++, PHP]
        
        // update
        originList.set(1, "Python");
        System.out.println("set: " + originList); // [C++, Python]
        
        // remove 1 phần tử trong list
        originList.remove(0);
        System.out.println("remove: " + originList); // [Python]
        
        // kiểm tra xem PHP có tồn tại trong list hay không?
        System.out.println(originList.contains("Python")); // true
        
        // xóa tất cả phần tử trong list
        originList.clear();
        System.out.println("clear: " + originList);  // []
	}
}
