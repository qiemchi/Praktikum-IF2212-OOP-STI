def func(x, y):
    hasil = ((x/2)**2) + (((5*y/4) - 2 * (abs(x))**0.5)**2)
    if hasil <= 120:
        return True
    else:
        return False

for x in range(15, -15, -1):
    for y in range(-30,30):
        if (func(y,x)):
            print("*", end="")
        else:
            print(" ", end="")
    print("")