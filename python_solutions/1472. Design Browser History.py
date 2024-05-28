class Node:
    def __init__(self, url):
        self.url = url
        self.next = None
        self.prev = None


class BrowserHistory:

    def __init__(self, homepage: str):
        self.head = None
        self.tail = None
        self.current = None

    def visit(self, url: str) -> None:
        if self.head is None:
            self.head = Node(url)
            self.tail = self.head

    def back(self, steps: int) -> str:

    def forward(self, steps: int) -> str: