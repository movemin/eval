# 한 줄에 이름들이 공백으로 구분되어 있습니다. 예: "dog cat" -> ["dog", "cat"]
names = input().split()


# 포유류 설계도
class Animal:
    """포유류 객체를 주는 클래스입니다."""

    # 포유류는 전부 다리가 4개 이므로 클래스 메모리로 공유되게 설정
    legs = 4

    # 생성자: 각 동물의 종은 다를 수 있으므로 생성자를 통해 인스턴스 변수에 초기화
    def __init__(self, name):
        self.name = name


# ---- 호출부 (수정 금지) ----
animals = [Animal(name) for name in names]
for a in animals:
    print(a.name, a.legs)                                   # 둘 다 읽을 수는 있지만
    print('"name" in a.__dict__:', "name" in a.__dict__)     # name 은 인스턴스에 산다
    print('"legs" in a.__dict__:', "legs" in a.__dict__)     # legs 는 인스턴스에 없다
print('"legs" in Animal.__dict__:', "legs" in Animal.__dict__)
print('"name" in Animal.__dict__:', "name" in Animal.__dict__)
print(animals[0].legs == animals[1].legs == Animal.legs)