# 이중 반복문 (i, j) 로 모든 부분 문자열을 슬라이싱한 뒤 `s[i:j] == s[i:j][::-1]` 검사.
s = input()

# 회문의 개수 초기화
palindrome_count = 0

# 첫 시작 인덱스값 반복
for i in range(len(s)):
    # 두 문자 이상의 인덱스부터 시작하여 문자열 길이까지 반복
    for j in range(i + 2, len(s) + 1):
        substring = s[i:j] # 슬라이싱은 복사 기능 -> 불필요한 연산 축소화
        if substring == substring[::-1]: # 회문이면 카운트
            palindrome_count += 1

# 결과값 출력
print(palindrome_count)