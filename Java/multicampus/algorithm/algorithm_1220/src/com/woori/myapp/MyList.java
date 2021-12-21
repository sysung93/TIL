package com.woori.myapp;

public class MyList {
    Node head;
    Node tail;

    public MyList(){
        init();
    }

    public void init(){
        head = new Node();
        tail = new Node();

        head.next = tail;
        tail.next = tail;
    }

    public void insertHead(String data){
        //항상 head쪽에 데이터를 삽입  stack구조
        Node temp = new Node();
        temp.data = data;

        // head -> (|) -> (|) -> tail
        temp.next = head.next;
        head.next = temp;
        //순서 중요 바뀌면 안된다.
    }

    public void display() {
        //추적용 링크
        Node trace;
        trace = head.next;
        while (trace != tail) {
            System.out.print(trace.data + " ");
            trace = trace.next;
        }
    }
    public void insertTail(String data){
        //항상 head쪽에 데이터를 넣기
        Node temp = new Node();
        temp.data = data;

        //tail 앞까지 추적해서 들어가자
        Node trace2 = head;
        Node trace1 = head.next;
        while(trace1 != tail) {
            trace1 = trace1.next;
            trace2 = trace2.next;
        }

        //head -> () ->
        //단일 링크드리스트의 단점은 자기 앞의 노드는 추적 불가능. 그래서 tail 앞의 요소는 누구나
        //추적자 두개가 따라다녀야 한다
        //trace1과 trace2 사이에 끼워 넣어야한다

        trace2.next = temp;
        temp.next = tail;
    }

    public String find(String data){
        //data 찾아서 있으면 찾았다 반환 없으면 못찾았다 반환
        Node trace = head.next;
        boolean flag = false;

        while(!flag && trace != tail){
            if(trace.data.equals(data)){
              flag = true;
            } else{
                trace = trace.next;
            }
        }
        if(flag){
            return "찾았다";
        } else{
            return "못찾았다";
        }
    }
    public void orderedInsert(String data){
        //1.노드만들고, 데이터 넣고
        Node temp = new Node();
        temp.data = data;

        //검색해서 자기 위치 값을 찾아감. 나보다 더 뒤에있는 요소를 만나덜가 tail을 만나던가
        //내 다음번 요소는 아는데 내 앞의 요소를 모름. 항상 추적용 node가 두개여야한다

        Node trace2 = head;
        Node trace1 = head.next;
        while(trace1.data.compareTo(data) <= 0 && trace1 != tail){
            trace2 = trace2.next;
            trace1 = trace1.next;
        }

        temp.next = trace1;
        trace2.next = temp;
    }
    //head쪽 삭제
    public void deleteHead(){
        if(head.next == tail){ // 함수 만들 때 에러처리를 먼저하자
            return;
        }
        head.next = head.next.next;
    }

    //전체삭제
    public  void deleteAll(){
        head.next = tail;
    }

    //tail쪽 삭제
    public  void deleteTail(){
        if(head.next == tail){
            return;
        }
        Node trace2 = head;
        Node trace1 = head.next;
        while(trace1.next != tail){
            trace1 = trace1.next;
            trace2 = trace2.next;
        }
        trace2.next = tail;
    }

    //항목 찾아서 삭제
    public void deleteItem(String data){
        if(head.next == tail){
            return;
        }
        Node trace2 = head;
        Node trace1 = head.next;
        boolean flag = false;

        while(!flag && trace1 != tail){
            if(trace1.data.equals(data)){
                flag = true;
            } else{
                trace1 = trace1.next;
                trace2 = trace2.next;
            }
        }
        if(flag){
            trace2.next = trace1.next;
        }
    }

}
