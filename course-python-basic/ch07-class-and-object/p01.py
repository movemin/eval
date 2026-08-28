class Book:
    """도서 정보를 저장하고 관련 기능을 제공하는 클래스"""
    
    # 장편 기준 페이지 수를 상수로 분리
    LONG_THRESHOLD = 300
    
    def __init__(self, title, author, pages):
        self.title = title
        self.author = author
        self.pages = pages

    def describe(self):
        """제목 - 저자 (쪽수) 형식의 문자열을 반환"""
        return f"{self.title} - {self.author} ({self.pages}쪽)"

    def is_long(self):
        """pages가 LONG_THRESHOLD 이상이면 True 반환"""
        return self.pages >= self.LONG_THRESHOLD


# 첫 줄: 도서 수 n. 이어지는 n 줄: "제목 저자 쪽수" (예: "파이썬 김철수 250" -> ["파이썬", "김철수", "250"])
n = int(input())
rows = [input().split() for _ in range(n)]

# ---- 호출부 (수정 금지) ----
for title, author, pages in rows:
    book = Book(title, author, int(pages))
    print(book.describe())
    print(book.is_long())