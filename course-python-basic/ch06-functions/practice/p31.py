# 전역변수 message 를 입력에서 읽습니다. 예: "회의 3시" → message="회의 3시"
message = input()

# [알고리즘]
# set과 다르게 get은 LEGB의 방식에 따라 지역변수가 없으면 전역변수를 읽는다
# 따라서 함수 내용으로 전역변수를 반환하는 내용을 담는다
def announce():
    """호출하면 전역변수에 저장된 값을 출력합니다."""
    return "[공지] " + message

print(announce())