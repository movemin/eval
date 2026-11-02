# 그룹→(이름, 점수) tuple dict 를 운용하면서 더 높은 점수 발견 시 교체. 출력은 sorted(keys) 순.
n = int(input())

# 그룹 딕셔너리 저장
groups = {}

# n번 반복
for _ in range(n):
    # 리스트 입력(, 간격으로 스플릿)
    name, alphabet, score = input().split(",")

    # 점수 정수 변환
    score = int(score)

    # 딕셔너리 해당 그룹 불러오기(get)
    result = groups.get(alphabet)

    # 만약 결과가 None이거나 점수가 기존 점수보다 높을 경우 복합연산하여 그룹 최고 점수 갱신
    if result is None or score > int(result[1]):
        groups[alphabet] = (name, score)

# 딕셔너리 순회하여 출력
for group, (student, score) in sorted(groups.items()):
    print(f"{group}: {student} ({score})")