"""
실습 2 풀이: REST API로 "KBO 야구팀 정보" 받아와 출력하기
"""

import requests

URL = "https://www.thesportsdb.com/api/v1/json/3/searchteams.php"
team_name = "T1"   # 원하는 팀으로 바꿔 보세요.

# 1) 검색 조건(t=팀명)을 dict로 만들어 요청한다.
params = {"t": team_name}
try:
    response = requests.get(URL, params=params, timeout=10)
    data = response.json()   # JSON 응답 -> 파이썬 dict
except requests.RequestException:
    print("⚠ 인터넷 연결을 확인하세요. 스포츠 서버에 접속하지 못했습니다.")
    raise SystemExit

# 검색 결과가 없으면 data["teams"]가 None이므로 안내하고 종료한다.
if not data.get("teams"):
    print(f"'{team_name}' 팀을 찾지 못했습니다. 영문 팀명을 확인하세요.")
    raise SystemExit

# 2) dict -> list -> dict 순서로 접근해 '팀 dict'를 꺼낸다.
team = data["teams"][0]   # "teams"의 값은 list이고, 그 0번째가 팀 dict다.

# 3) 팀 dict에서 원하는 키만 골라 출력하기
#    없을 수도 있는 값은 .get(키, 기본값)으로 안전하게 꺼낸다.
print("=== KBO 야구팀 정보 ===")
print(f"구단명    : {team['strTeam']} ({team.get('strTeamAlternate', '-')})")
print(f"소속 리그 : {team['strLeague']}")
print(f"창단 연도 : {team['intFormedYear']}년")
print(f"홈 구 장  : {team['strStadium']}")
print(f"연 고 지  : {team['strLocation']}")
