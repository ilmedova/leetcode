class Node:
    def __init__(self, val):
        self.val = val
        self.next = None


class MyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def get(self, index: int) -> int:
        if index == 0 and index < self.size: return self.head.val
        if index < self.size:
            c = self.head
            while index > 0:
                c = c.next
                index -= 1
            return c.val
        return -1

    def addAtHead(self, val: int) -> None:
        n = Node(val)
        n.next = self.head
        self.head = n
        if self.tail is None:
            self.tail = n
        self.size += 1

    def addAtTail(self, val: int) -> None:
        if self.tail is None:
            self.head = Node(val)
            self.tail = self.head
        else:
            self.tail.next = Node(val)
            self.tail = self.tail.next
        self.size += 1

    def addAtIndex(self, index: int, val: int) -> None:
        if index <= self.size:
            if index == 0:
                self.addAtHead(val)
            elif index == self.size:
                self.addAtTail(val)
            else:
                c = self.head
                while index > 1:
                    c = c.next
                    index -= 1
                nxt = c.next
                n = Node(val)
                n.next = nxt
                c.next = n
                self.size += 1

    def deleteAtIndex(self, index: int) -> None:
        if index < self.size:
            if index == 0:
                self.head = self.head.next
            else:
                c = self.head
                while index > 1:
                    c = c.next
                    index -= 1
                if c.next == self.tail:
                    c.next = None
                    self.tail = c
                else:
                    c.next = c.next.next if c.next else None
            self.size -= 1

# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)