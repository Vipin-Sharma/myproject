__author__ = 'Ekta'
class Person(object):
    def __init__(self, height, in_front):
        self.height = height
        self.in_front = in_front


class Node(object):
    def __init__(self, person):
        self.person = person
        self.left = None
        self.right = None
        self.val = 1


class Solution:
    # @param heights : list of integers
    # @param infronts : list of integers
    # @return a list of integers

    def insert(self, root, person, val):

        if val < root.val:
            if root.left is None:
                root.left = Node(person)
            else:
                self.insert(root.left, person, val)
            root.val += 1
        else:
            if root.right is None:
                root.right = Node(person)
            else:
                self.insert(root.right, person, val - root.val)

    def in_order(self, root, result):
        if root is None:
            return
        self.in_order(root.left, result)
        result.append(root.person.height)
        self.in_order(root.right, result)

    def order(self, height, in_front):
        persons = [None] * len(height)
        for i in range(len(persons)):
            persons[i] = Person(height[i], in_front[i])
        persons.sort(key=lambda x: x.height, reverse=True)
        root = Node(persons[0])
        for i in range(1, len(persons)):
            self.insert(root, persons[i], persons[i].in_front)
        result = []
        self.in_order(root, result)
        return result


res1 = Solution().order([5, 3, 2, 6, 1, 4], [0, 1, 2, 0, 3, 2])
print(res1)