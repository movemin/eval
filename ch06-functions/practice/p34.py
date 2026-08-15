# 전역변수 word 를 입력에서 읽습니다. 예: "hello" → word="hello"
word = input()

# 지역변수 -> enclosing -> 전역변수 -> 내장함수
def count():
    """단어를 넣으면 단어의 길이가 반환됩니다"""
    return len(word)  # 내부 x -> enclosing x -> 전역변수(word) -> 내장함수(len)

print(count())