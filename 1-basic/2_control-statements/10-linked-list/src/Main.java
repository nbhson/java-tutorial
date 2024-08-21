import java.util.LinkedList;

public class Main {
	//	Lớp LinkedList trong java sử dụng cấu trúc danh sách liên kết kép Doubly để lưu trữ các phần tử.
	//
	//	Những điểm cần ghi nhớ về lớp LinkedList:
	//
	//	+ Lớp LinkedList trong java có thể chứa các phần tử trùng lặp.
	//	+ Lớp LinkedList duy trì thứ tự của phần tử được thêm vào.
	//	+ Lớp LinkedList là không đồng bộ (non-synchronized).
	
	//	+ Trong java lớp LinkList, thao tác nhanh vì không cần phải dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách.
	//  + LinkedList nội bộ sử dụng danh sách liên kết doubly để lưu trữ các phần tử.
	//  + có thể hoạt động như một list và queue(hàng đợi)
	//  + LinkedList là tốt hơn trong việc thao tác dữ liệu.
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        System.out.println(list);
        
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA: " + listA);
        
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.println("listA:"+ listA);
        
        list.removeAll(listB);
        System.out.println("list:" + list);
        
        System.out.println(list.get(1));
        
        list.set(1, "Python");
        System.out.println(list);
        
        list.remove(1);
        System.out.println(list);
        
        System.out.println(list.contains("C++"));
	}
}
