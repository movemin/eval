def total(*numbers):
    """언패킹하여서 파라미터에 인자값을 넣으면 튜플의 요소들의 합들이 반환됩니다"""
    return sum(numbers)

nums = [int(x) for x in input().split()]



# ↓ 호출부 (수정하지 마세요) — 리스트를 * 로 풀어 total 에 전달
print(total(*nums))