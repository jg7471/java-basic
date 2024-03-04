package etc.api.collection.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<>();

        list.add("이청용");
        list.add("손흥민");
        list.add("백승호");

        list.addFirst("맨 앞");//맨 앞 맨뒤에 추가 : linked list의 특성 : arrayList 不可
        list.addLast("맨 뒤");
        System.out.println(list);

        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove("맨 앞");
        System.out.println(list);

        //LIFO -> last in, first out -> stack //마지막으로 들어온게 가장 먼저 나간다//프링글스 원통
        //push, pop, peek
        list.push("김춘식");
        System.out.println(list); //앞에서 부터 추가

        //삭제하면서 데이터를 읽기
        System.out.println(list.pop());
        System.out.println(list);

        //삭제하지 않으면서 읽기
        System.out.println(list.peek());
        System.out.println(list);

        //FIFO -> first in, first out -> Queue //제일 먼저 들어온게 제일 먼저 나감 : 롤 큐
        //offer, poll, peek
        list.offer("a");
        list.offer("b");
        list.offer("c");
        System.out.println(list); //뒤 쪽에 쌓임

        System.out.println(list.poll());// 맨 앞에거 나옴
        System.out.println(list);

        System.out.println(list.peek());// 맨 앞에거 뜸
        System.out.println(list);


    }
}
