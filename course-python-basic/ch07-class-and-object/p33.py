# 첫 줄: 점수들 (정수, 공백 구분). 둘째 줄: 새 합격 기준
scores = list(map(int, input().split()))
new_cut = int(input())


class Score:
    cut = 60

    @staticmethod
    def is_pass(score):  # 정적 메서드는 객체를 못 받는다 -> 클래스 속성을 직접 참조하여 해결
        return score >= Score.cut


# ---- 호출부 (수정 금지) ----
for s in scores:
    print(s, Score.is_pass(s))
Score.cut = new_cut                                # 클래스 속성 변경
print("기준 변경:", Score.cut)
for s in scores:
    print(s, Score.is_pass(s))