def event = ["aa": 1, "bb": 2, "cc": 3]
def dims = ["aa", "cc"]

println event.findAll { dims.contains(it.key) }.collect { it.value }
