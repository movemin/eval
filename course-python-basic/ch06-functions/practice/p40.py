# 전역 prefix=첫, text=둘째, inner_prefix=셋째. 예: "[G] 제목 [L]" → prefix="[G]", text="제목", inner_prefix="[L]"
parts = input().split()
prefix = parts[0]
text = parts[1]
inner_prefix = parts[2]

# 전역변수와 같은 이름의 prefix 변수에 전역변수인 inner_prefix를 저장하여
# 지역변수를 생성함으로써 전역변수를 가린다.
def label():
    """
    함수를 호출하시면 prefix변수가 함수가 메모리에서 사라질 때까지
    inner_prefix에 저장된 값을 가지고,
    그 값과 전역변수인 text를 반환합니다.
    """
    prefix = inner_prefix
    return prefix + text

# 함수가 호출될 때는 prefix는 LEGB의 규칙에 따라 지역변수가 우선이지만,
# 함수가 지워지고 난 후에는 지역변수가 없으므로 전역변수가 읽혀진다.
print(label())
print(prefix)