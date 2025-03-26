// 참조자료형 배열
class Book1 {
    String title;
    String author;
    String price;
}

public class ArrayEx02 {
    public static void main(String[] args) {

        Book1[] book1Array = new Book1[3];
        Object[] objArray = new Object[3];

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

        //book1Array[0] = book1;
        //book1Array[1] = book2;
        //book1Array[2] = book3;
        objArray[0] = book1;
        objArray[1] = book2;
        objArray[2] = book3;

        Book1 book = (Book1)objArray[0];
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.price);

        // for 문으로 전체 데이터 가져오기
        //for(int i = 0; i < objArray.length; i++) {
        //    System.out.printf(objArray[i].title);
        //}

    }
}
