# 현재 증가 구간 list 와 최고 기록 list 두 개를 추적. 증가가 끊기면 cur 초기화하면서 best 갱신.
parts = input().split()
nums = [int(x) for x in parts]

# [알고리즘]
# 증가구간이면 반복
# 증가구간 끝나면 저장
# 증가구간 또 끝나면 두 개를 최종 비교하여
# 더 크면 어미 변수에 저장, 아니면 무시
# 순회 끝나면 다시 비교

max_arrange = []
nums_length = len(nums)
temp_arrange = [nums[0]]


for index in range(1, nums_length):
    if nums[index] > nums[index - 1]:
        temp_arrange.append(nums[index])
    else:
        if len(temp_arrange) > len(max_arrange):
            max_arrange = temp_arrange
        temp_arrange = [nums[index]]

if len(temp_arrange) > len(max_arrange):
    max_arrange = temp_arrange


print(f"길이: {len(max_arrange)}")
print(f"구간: {' '.join(map(str, max_arrange))}")