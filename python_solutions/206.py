# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None: return None
        prev = head
        current = head.next
        while current is not None:
            nxt = current.next
            current.next = prev
            prev = current
            current = nxt
        head.next = None
        return prev