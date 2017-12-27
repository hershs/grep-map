events = {"aa": 1, "bb": 2, "cc": 3}
dims = ["aa", "cc"]

print ({v for (k, v) in events.items() if k in dims})
