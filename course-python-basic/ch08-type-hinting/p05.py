from typing import NamedTuple, TypedDict, get_type_hints


class Point(NamedTuple):
    x: int
    y: int


class Config(TypedDict):
    scale: int
    label: str


def scale_points(points: list[Point], config: Config) -> list[Point]:
    return [Point(p.x * config["scale"], p.y * config["scale"]) for p in points]

def farthest(points: list[Point]) -> Point | None:
    if points:
        return max(points, key=lambda p: p.x ** 2 + p.y ** 2)
    return None
   
    
# 첫 줄: 점의 개수 n. 이어지는 n 줄: "x y" (예: "1 2" -> (1, 2)). 마지막 줄: "배율 라벨" (예: "2 A" -> scale=2, label="A")
n = int(input())
coords = []
for _ in range(n):
    x, y = map(int, input().split())
    coords.append((x, y))
scale, label = input().split()
scale = int(scale)


# ---- 호출부 (수정 금지) ----
print(Point._fields, issubclass(Point, tuple))
h = get_type_hints(Point)
print(h.get("x") is int, h.get("y") is int)
h = get_type_hints(Config)
print(sorted(h), h.get("scale") is int, h.get("label") is str)
h = get_type_hints(scale_points)
print(h.get("points") == list[Point], h.get("config") is Config, h.get("return") == list[Point])
h = get_type_hints(farthest)
print(h.get("points") == list[Point], h.get("return") == (Point | None))
points = [Point(x, y) for x, y in coords]
cfg = Config(scale=scale, label=label)
print(isinstance(cfg, dict), cfg["label"])
for p in scale_points(points, cfg):
    print(p, p.x + p.y, p[0] == p.x)
print(farthest(points))
print(farthest(scale_points(points, cfg)))