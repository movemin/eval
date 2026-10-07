# 첫 줄: 주소 수 n. 이어지는 n 줄: 이메일 주소 문자열
n = int(input())
addresses = [input().strip() for _ in range(n)]


# Email 클래스
class Email:
    """이메일을 관리합니다."""

    # 인스턴스를 받지 않도록 설정합니다.
    @staticmethod
    def is_valid(s):
        """이메일 형식 검사기 입니다."""

        # '@'이 정확히 1개인지 확인합니다.
        if s.count("@") != 1:
            return False

        # 로컬과 도메인을 나눕니다.
        local_part, domain_part = s.split('@')

        # 로컬이 비어있는지 확인합니다.
        if not local_part:
            return False
        
        # 도메인을 나눕니다.
        domain_parts = domain_part.split('.')

        # 도메인 조각이 2개 이상이거나 비어있는지 확인합니다.
        if len(domain_parts) < 2 or not all(domain_parts):
            return False
        
        # 모든 조건을 다 통과하면 True를 반환합니다.
        return True


# ---- 호출부 (수정 금지) ----
checker = Email()
for i, s in enumerate(addresses):
    if i % 2 == 0:
        print(s, Email.is_valid(s))        # 클래스 이름으로 직접 호출
    else:
        print(s, checker.is_valid(s))      # 인스턴스로 호출