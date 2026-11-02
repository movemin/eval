# enumerate 로 (인덱스, 단어) 순회 + dict[word] 에 위치 list 누적. 출력은 sorted(keys) 순.
words = input().split()
word_positions = dict()

# 중복값을 제거한 set으로 만들어 키 , 리스트의 벨류값 저장
for key in set(words):
    word_positions[key] = []

# 단어들을 순회하여 인덱스를 문자열로 바꾼 후 벨류값으로 추가
for index, word in enumerate(words):
    word_positions[word].append(index)

# 정렬된 키를 순회하여 벨류는 문자열을 붙여서 출력
for word in sorted(word_positions.keys()):
    print(f"{word}: {' '.join(map(str, word_positions[word]))}")