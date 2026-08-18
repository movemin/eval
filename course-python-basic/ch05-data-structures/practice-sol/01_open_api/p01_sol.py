"""
실습 1 풀이: REST API로 "2026년 한국 공휴일" 받아와 출력하기
"""

import requests

URL = "https://date.nager.at/api/v3/PublicHolidays/2026/KR"

# 1) 서버에 요청하고 JSON 받기
try:
    response = requests.get(URL, timeout=10)
    holidays = response.json()   # JSON 배열 -> 파이썬 list (각 원소는 dict)
except requests.RequestException:
    print("⚠ 인터넷 연결을 확인하세요. 공휴일 서버에 접속하지 못했습니다.")
    raise SystemExit

# 필요하면 받아온 자료형을 확인해 볼 수 있다. list 안에 dict가 들어 있다.
# print(type(holidays))            # <class 'list'>
# print(type(holidays[0]))         # <class 'dict'>

# 2) 공휴일을 하나씩 꺼내 날짜와 한국어 이름 출력하기
print("=== 2026년 대한민국 공휴일 ===")
for number, holiday in enumerate(holidays, 1):   # 1번부터 번호를 붙인다.
    date = holiday["date"]            # dict에서 날짜를 꺼낸다.
    name = holiday["localName"]       # dict에서 한국어 이름을 꺼낸다.
    print(f"{number:2}. {date}  {name}")

# 3) 총 공휴일 수 출력하기 (list의 길이 = 공휴일 개수)
print(f"총 공휴일 수: {len(holidays)}일")
