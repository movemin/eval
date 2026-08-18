"""
실습 3 풀이: Open API로 받은 주간 날씨(JSON) 파싱하기

핵심: API의 'daily'는 평행한 list 묶음이므로 zip()으로 하루치 dict들의 list로 재구성한다.
"""

import json
import urllib.request
import urllib.parse


def fetch(city_lat, city_lng):
    """좌표로 7일 예보를 받아 dict로 돌려준다."""
    params = {
        "latitude": city_lat,
        "longitude": city_lng,
        "daily": "temperature_2m_max,temperature_2m_min",
        "timezone": "Asia/Seoul",
    }
    url = "https://api.open-meteo.com/v1/forecast?" + urllib.parse.urlencode(params)
    with urllib.request.urlopen(url, timeout=10) as resp:
        return json.loads(resp.read().decode("utf-8"))


LAT, LNG = 35.1796, 129.0756
data = fetch(LAT, LNG)

# 1) daily(dict) 안에서 평행한 세 list를 꺼낸다.
daily = data["daily"]
dates = daily["time"]
highs = daily["temperature_2m_max"]
lows = daily["temperature_2m_min"]

# 2) zip으로 같은 인덱스끼리 묶어 하루치 dict들의 list를 만든다.
days = []
for d, hi, lo in zip(dates, highs, lows):
    days.append({"date": d, "max": hi, "min": lo})

# 3) 7일치를 출력한다.
print("=== 부산 7일 예보 ===")
for day in days:
    gap = day["max"] - day["min"]          # 일교차
    print(f"{day['date']}  최고 {day['max']}°C / 최저 {day['min']}°C  (일교차 {gap:.1f})")

# 4) 최고기온이 가장 높은 날을 찾는다. (max + key)
hottest = max(days, key=lambda x: x["max"])
print(f"\n가장 더운 날: {hottest['date']} (최고 {hottest['max']}°C)")


# --- 보너스 도전 (스포츠/월드컵에 관심 있다면) ---
# 같은 방식으로 'TheSportsDB'(무료 키 123)에서 축구 국가대표 최근 경기를 받아
# JSON을 파싱해 점수를 출력해 볼 수 있다. (키·회원가입 불필요)
#   url = "https://www.thesportsdb.com/api/v1/json/123/eventslast.php?id=134517"
#   results = json.loads(...)["results"]   # 경기(dict)들의 list
#   각 dict에서 strEvent, intHomeScore, intAwayScore, dateEvent를 꺼내 출력한다.
