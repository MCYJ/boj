a, b, n = map(int, input().split())

for i in range(n):
    a = a%b
    a *= 10

print(a//b) 