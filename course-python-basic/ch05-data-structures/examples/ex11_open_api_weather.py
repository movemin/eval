# [실무] Open API 호출 → JSON 파싱 → 화면 출력
#
# 인터넷의 공개 API(Open-Meteo, 회원가입·API키 불필요)에서
# 현재 날씨를 받아와 화면에 보여준다.
#
# 핵심 흐름: 요청 → JSON 응답 → 파이썬 dict로 변환 → 필요한 값 꺼내기
#   - API가 돌려주는 JSON은 파이썬의 dict / list / 숫자 / 문자열과 거의 그대로 대응된다.
#   - 그래서 JSON을 파싱하면 우리가 배운 "중첩 자료구조" 형태로 다룰 수 있다.
#
# ─────────────────────────────────────────────────────────────
# [웹 기초] requests로 인터넷에서 데이터 받아오기
#
#   인터넷은 "요청(request) → 응답(response)" 흐름으로 동작한다.
#   식당에 비유하면:
#     - 우리(클라이언트)가 메뉴를 주문한다  → 요청(request)
#     - 서버가 음식을 내준다                → 응답(response)
#
#   * URL        : 요청을 보낼 서버 주소. 예) https://api.open-meteo.com/...
#   * 파라미터   : 요청에 함께 보내는 추가 조건. 예) 도시 좌표, 받고 싶은 날씨 항목
#   * GET 방식   : "이 데이터 주세요"라고 요청해서 데이터를 받아오는 기본 방식.
#   * 응답(JSON) : 서버가 돌려주는 결과. 보통 JSON 문자열 형식으로 온다.
#
#   브라우저 주소창에 URL을 치면 화면이 뜨는 것처럼,
#   requests는 같은 일을 파이썬 코드로 해 준다.
#   응답으로 받은 JSON은 dict / list 모양으로 바꿔서 다룰 수 있다.
#
#   requests 설치: 현재 프로젝트 폴더에서 콘솔(CLI)을 열고 아래 명령어를 차례대로 실행한다.
#    1) python -m pip install --upgrade pip
#    2) pip install requests
# ─────────────────────────────────────────────────────────────

import sys
import requests

# Windows 콘솔(cp949)에서도 이모지와 한글이 깨지지 않도록 출력 인코딩을 UTF-8로 맞춘다.
sys.stdout.reconfigure(encoding="utf-8")

# --- 1. 요청할 도시 (이름 → 좌표 tuple) ---
# 값이 (위도, 경도) 튜플인 dict이다. 좌표처럼 한 묶음으로 다루는 값에 잘 어울린다.
CITIES = {
    "서울": (37.5665, 126.9780),
    "부산": (35.1796, 129.0756),
    "제주": (33.4996, 126.5312),
    "대구": (35.8714, 128.6014),
}

# 날씨 코드(WMO) → 한글 설명. API는 숫자 코드를 주므로 사람이 읽을 수 있는 말로 바꿔 준다.
# WMO 표준 코드 전체를 담았다(https://open-meteo.com/en/docs 하단 코드표 참고).
WEATHER_TEXT = {
    0: "맑음", 1: "대체로 맑음", 2: "구름 조금", 3: "흐림",
    45: "안개", 48: "짙은 안개",
    51: "약한 이슬비", 53: "이슬비", 55: "짙은 이슬비",
    56: "약한 어는 이슬비", 57: "짙은 어는 이슬비",
    61: "약한 비", 63: "비", 65: "강한 비",
    66: "약한 어는 비", 67: "강한 어는 비",
    71: "약한 눈", 73: "눈", 75: "강한 눈", 77: "싸락눈",
    80: "약한 소나기", 81: "소나기", 82: "강한 소나기",
    85: "약한 소낙눈", 86: "강한 소낙눈",
    95: "천둥번개", 96: "약한 우박 동반 뇌우", 99: "강한 우박 동반 뇌우",
}

URL = "https://api.open-meteo.com/v1/forecast"


# --- 2. 도시별로 날씨 받아서 출력 ---
print("=== 지금 날씨 (Open-Meteo) ===\n")

for name, coords in CITIES.items():
    lat, lng = coords                       # 튜플 언패킹

    # 쿼리 파라미터를 dict로 만들면 요청 조건을 한눈에 보기 쉽다.
    # requests가 이 dict를 ?latitude=...&longitude=... 형태로 URL 뒤에 알아서 붙여 준다.
    # current=... : 지금 받고 싶은 날씨 항목들을 쉼표로 나열한다.
    #   (여기에 적은 항목 이름이 응답 dict의 키가 된다. 공식 문서의 변수명과 같다.)
    params = {
        "latitude": lat,
        "longitude": lng,
        "current": "temperature_2m,weather_code,wind_speed_10m,wind_direction_10m,is_day",
        "timezone": "Asia/Seoul",
    }

    try:
        # requests.get(주소, params=파라미터): 서버에 "데이터 주세요"라고 요청한다.
        #   - params(dict)는 자동으로 ?latitude=...&longitude=... 형태가 되어 URL에 붙는다.
        #   - timeout=10: 10초 안에 응답이 없으면 더 기다리지 않고 오류를 낸다.
        #   - 돌려받은 response 안에 서버의 응답(JSON 문자열)이 들어 있다.
        response = requests.get(URL, params=params, timeout=10)

        # response.json(): 응답으로 온 JSON 문자열을 파이썬 dict로 바꿔 준다.
        data = response.json()   # 핵심: 이제부터 우리가 배운 dict처럼 다룰 수 있다.
        # JSON Text 문장을 dictinary 객체로 변환
        
        # print(data)  # 수신 값 출력 - 키와 값의 의미는 https://open-meteo.com/en/docs 사이트 참조
    except requests.RequestException:
        # 인터넷이 막혀 서버에 접속하지 못하면 메시지를 출력하고 프로그램을 끝낸다.
        print("⚠ 인터넷 연결을 확인하세요. 날씨 서버에 접속하지 못했습니다.")
        raise SystemExit

    # --- 3. 중첩 dict에서 값 꺼내기 ---
    # data["current"]도 dict이므로 그 안에서 [키]로 값을 꺼낸다.
    # 키 이름은 위 current=...에 나열한 변수 이름과 똑같다.
    cw = data["current"]
    temp = cw["temperature_2m"]
    wind = cw["wind_speed_10m"]
    code = cw["weather_code"]

    # 숫자 코드를 한글 설명으로 바꾼다. 모르는 코드면 기본값을 쓰도록 .get()을 사용한다.
    sky = WEATHER_TEXT.get(code, "알 수 없음")
    day = "낮" if cw["is_day"] == 1 else "밤"

    print(f"[{name}] {sky}  🌡 {temp}°C  💨 {wind} km/h  ({day})")


print()
# --- 4. 핵심 정리 ---
# - requests.get(url, params=...)로 요청하면 쿼리스트링을 자동으로 만들어 붙여 준다.
# - response.json()은 JSON 응답을 dict로 바꿔 준다(내부에서 json.loads와 비슷한 일을 한다).
# - 응답은 보통 dict 안에 dict/list가 중첩되어 있다 → [키]·[인덱스]를 이어 붙여 접근한다.
# - 외부 데이터는 키가 없거나 호출이 실패할 수 있다 → .get()과 try/except로 방어한다.
# - 숫자 코드를 사람이 읽을 말로 바꾸는 "변환표"도 dict로 만들면 깔끔하게 관리할 수 있다.
