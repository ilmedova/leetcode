from typing import List


class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        n = len(students)
        i = 0
        c = 0
        while i < n and c < n:
            if students[0] == sandwiches[0]:
                students.pop(0)
                sandwiches.pop(0)
                c = 0
            else:
                students.append(students[0])
                students.pop(0)
                c += 1
                continue
            i+=1
        return len(students)