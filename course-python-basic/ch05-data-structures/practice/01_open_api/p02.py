"""
글로벌시스템융합과 프로그래밍(1) 실습 문제
실습 2: REST API로 "KBO 야구팀 정보" 받아와 출력하기

p01(공휴일)은 '리스트 안에 dict가 여러 개'였습니다.
이번에는 dict 안쪽으로 한 단계 더 들어가 보는 연습입니다.
  → "dict → list → dict" 순서로 접근해 원하는 값을 꺼냅니다.

[받아올 데이터]
  스포츠 정보 서버(TheSportsDB)에서 KBO 야구팀 정보를 검색합니다.
  주소: https://www.thesportsdb.com/api/v1/json/3/searchteams.php
  조건: t = "팀 영문명"  (예: "Doosan Bears", "LG Twins", "Samsung Lions")
  - 무료 테스트 키(3) 사용

[받아온 JSON의 모양]
  {
    "teams": [                          ← "teams"의 값은 list
      {                                 ← 그 안의 첫 번째 원소가 팀 정보 dict
        "strTeam": "Doosan Bears",
        "strTeamAlternate": "두산 베어스",
        "strLeague": "Korean KBO League",
        "intFormedYear": "1982",
        "strStadium": "Jamsil Baseball Stadium",
        "strLocation": "Seoul",
        ... (그 외에도 키가 아주 많음)
      }
    ]
  }
  → 팀 dict 하나를 꺼내려면 data["teams"][0]을 사용합니다.

[해야 할 일]
  1. requests로 위 주소에 요청하면서 t=팀명 조건을 함께 보낸다.
  2. 받은 dict에서 data["teams"][0]으로 '팀 dict'를 꺼낸다.
  3. 그 팀 dict에서 아래 정보를 골라 출력한다.
       구단명(strTeam), 한국어명(strTeamAlternate), 소속 리그(strLeague),
       창단 연도(intFormedYear), 홈구장(strStadium), 연고지(strLocation)

힌트:
  - 검색 조건은 dict로 만들어 requests.get(URL, params=...)처럼 넘긴다.
  - data["teams"]는 list이므로 [0]을 붙여 첫 번째 팀 dict를 꺼낸다.
  - 없을 수도 있는 값은 team.get("키", "기본값")으로 안전하게 꺼낸다.
  - 좋아하는 다른 팀: "LG Twins", "Kia Tigers", "Lotte Giants",
                      "SSG Landers", "Kiwoom Heroes", "NC Dinos", "KT Wiz",
                      "Hanwha Eagles", "Samsung Lions"
"""

import requests

URL = "https://www.thesportsdb.com/api/v1/json/3/searchteams.php"
team_name = "Doosan Bears"   # 원하는 팀으로 바꿔 보세요.

# 아래에 코드를 작성하세요.
# 1) t=team_name 조건으로 요청해 JSON(dict) 받기
# 2) data["teams"][0]으로 팀 dict 꺼내기
# 3) 원하는 키만 골라 출력하기
params = {"t": team_name}
response = requests.get(URL, params=params, timeout=10)
data = response.json()
result = data["teams"][0]
print("=== KBO 야구팀 정보 ===")
print(f"구단명    : {result["strTeam"]}({result["strTeamAlternate"]})")
print(f"소속 리그 : {result["strLeague"]}")
print(f"창단 연도 : {result["intFormedYear"]}")
print(f"홈 구 장  : {result["strStadium"]}")
print(f"연 고 지  : {result["strLocation"]}")
"""
[실행 결과 예시]   (team_name = "Doosan Bears" 일 때)
=== KBO 야구팀 정보 ===
구단명    : Doosan Bears (두산 베어스)
소속 리그 : Korean KBO League
창단 연도 : 1982년
홈 구 장  : Jamsil Baseball Stadium
연 고 지  : Seoul
"""
