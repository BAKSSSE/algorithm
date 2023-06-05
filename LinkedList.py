class Node :
    def __init__(self, value=0, next=None):
        self.value = value
        self.next = next

class LinkedList : 
    def __init__(self):
        self.head = None
    def append(self, value):
        new_node =  Node(value)

        # 해드설정
        if self.head is None:
            self.head = new_node
        else: 
            # 마지막 노드 찾아서 주소 넣기
            current = self.head 
            while(current.next):
                current = current.next
            current.next = new_node
            
# 노드 클래스,연결 클래스 생성
li = LinkedList()
li.append(1)
li.append(2)
li.append(3)
