# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
from typing import List


class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        arr = []
        for i in lists:
            current = i
            while current is not None:
                arr.append(current.val)
                current = current.next
        nums = self.mergeSort(arr, 0, len(arr) - 1)
        if len(nums) > 0:
            head = ListNode(nums[0])
            current = head
            for i in range(1, len(nums)):
                current.next = ListNode(nums[i])
                current = current.next
            return head
        return None

    def mergeSort(self, arr, s, e):
        if e - s + 1 <= 1:
            return arr

        m = (s + e) // 2
        self.mergeSort(arr, s, m)
        self.mergeSort(arr, m + 1, e)

        self.merge(arr, s, m, e)

        return arr

    def merge(self, arr, s, m, e):
        l = arr[s: m + 1]
        r = arr[m + 1: e + 1]

        i, j, k = 0, 0, s

        while i < len(l) and j < len(r):
            if l[i] <= r[j]:
                arr[k] = l[i]
                i += 1
            else:
                arr[k] = r[j]
                j += 1
            k += 1

        while i < len(l):
            arr[k] = l[i]
            i += 1
            k += 1
        while j < len(r):
            arr[k] = r[j]
            j += 1
            k += 1