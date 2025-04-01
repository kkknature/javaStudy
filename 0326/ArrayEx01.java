// 참조자료형 배열
class Book1 {
    String title;
    String author;
    String price;
}

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;

        for(int data : intArray) {
            System.out.println(data);
        }

        Book1[] book1Array = new Book1[3];

        Book1 book1 = new Book1();
        book1.title = "Java";
        book1.author = "홍길동";
        book1.price = "10000원";

        Book1 book2 = new Book1();
        book2.title = "JSP";
        book2.author = "박문수";
        book2.price = "15000원";

        Book1 book3 = new Book1();
        book3.title = "Spring";
        book3.author = "임꺽정";
        book3.price = "13000원";

        book1Array[0] = book1;
        book1Array[1] = book2;
        book1Array[2] = book3;

        System.out.println(book1Array[0].title);
        System.out.println(book1Array[0].author);
        System.out.println(book1Array[0].price);
        System.out.println(book1Array[0]);

        // 일반적인 for문을 이용해서 전체 데이터 출력
        for(int i = 0; i < book1Array.length; i++) {
            System.out.printf("%s\t%s\t%s\n"
            , book1Array[i].title
            , book1Array[i].author
            , book1Array[i].price);
        }

        // 향상된 for -> 다시 해보자자
        for(Book1 book : book1Array) {
            System.out.printf("%s\t%s\t%s\n"
            , book.title
            , book.author
            , book.price);
        }
    }
}
