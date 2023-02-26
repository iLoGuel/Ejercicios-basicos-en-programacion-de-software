# Mostrar en pantalla todos los números terminados en 6 comprendidos entre 25 y 205

try:

    for i in range (25, 205 +1,1):
        cap = i
        if cap %10 == 6:
            print(cap)

except ValueError:
    print("+++ERROR+++")