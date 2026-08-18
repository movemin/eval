"""
글로벌시스템융합과 프로그래밍(1) 실습 문제

실습 3: Open API로 받은 주간 날씨(JSON) 파싱하기

Open-Meteo(회원가입·API키 불필요)에서 한 도시의 '7일 예보'를 받아
가장 더운 날을 찾아 출력합니다.

이 API의 'daily' 응답은 아래처럼 "여러 개의 평행한 list" 모양입니다.
    {
      "daily": {
        "time":                ["2026-06-28", "2026-06-29", ...],   # 날짜들
        "temperature_2m_max":  [25.0, 26.2, ...],                   # 최고기온들
        "temperature_2m_min":  [18.1, 19.0, ...],                   # 최저기온들
      }
    }
즉 time[0]·max[0]·min[0]이 같은 날의 정보입니다. (인덱스가 서로 짝입니다)

[조건]
1) fetch()로 받은 data(dict)에서 daily 안의 세 list를 꺼낸다.
2) zip()으로 세 list를 묶어, 하루치를 dict 하나로 만든 list를 구성한다.
       days = [{"date": ..., "max": ..., "min": ...}, ...]
3) 각 날의 기온 범위(max - min)와 함께 7일치를 보기 좋게 출력한다.
4) max()와 key= 를 이용해 '최고기온이 가장 높은 날'을 찾아 출력한다.

힌트:
- 세 list 묶기:   for d, hi, lo in zip(dates, highs, lows):
- 최댓값 날 찾기: hottest = max(days, key=lambda x: x["max"])
"""

import json
import urllib.request
import urllib.parse


def fetch(city_lat, city_lng):
    """좌표로 7일 예보를 받아 dict로 돌려준다. 이 함수는 그대로 사용한다."""
    params = {
        "latitude": city_lat,
        "longitude": city_lng,
        "daily": "temperature_2m_max,temperature_2m_min",
        "timezone": "Asia/Seoul",
    }
    url = "https://api.open-meteo.com/v1/forecast?" + urllib.parse.urlencode(params)
    with urllib.request.urlopen(url, timeout=10) as resp:
        return json.loads(resp.read().decode("utf-8"))


# 부산 좌표 (위도, 경도)
LAT, LNG = 35.1796, 129.0756

data = fetch(LAT, LNG)

# --- 아래에 코드를 작성하세요 ---
# 1) daily 안의 세 list 꺼내기
# 2) zip으로 묶어 days(dict들의 list) 만들기
# 3) 7일치 출력
# 4) 가장 더운 날 출력
dailys = data['daily']
times = dailys['time']  # 날짜
temperature_2m_maxs = dailys['temperature_2m_max']  # 최고 기온
temperature_2m_mins = dailys['temperature_2m_min']  # 최저 기온

days = []
for time, temperature_2m_max, temperature_2m_min in zip(times, temperature_2m_maxs, temperature_2m_mins):
  days.append({"day": time, "max": temperature_2m_max, "min": temperature_2m_min})

print("=== 부산 7일 예보 ===")
for day in days:
  gap = day["max"] - day["min"]
  print(f"{day["day"]}  최고 {day["max"]}°C / 최저 {day["min"]}°C  (일교차 {gap:.1f})")
  
print()
hottest = max(days, key=lambda x: x["max"])
print(f"가장 더운 날: {hottest["day"]} (최고 {hottest["max"]}°C)")

"""
[실행 결과 예시]  (기온은 그날그날 다릅니다)
=== 부산 7일 예보 ===
2026-06-28  최고 25.0°C / 최저 18.1°C  (일교차 6.9)
2026-06-29  최고 26.2°C / 최저 19.0°C  (일교차 7.2)
...
2026-07-04  최고 29.5°C / 최저 22.3°C  (일교차 7.2)

가장 더운 날: 2026-07-04 (최고 29.5°C)
"""
