""" Mostrar en pantalla los primeros 20 múltiplos de 3. """

"""try:

    for i in range(3,20+1,3):
        print(i)

except ValueError:
    print("+++ERROR+++")"""

try:

    numero = 3

    while numero !=0:
        print(numero)
        numero +=3
        if numero == 63:
            break

except ValueError:
    print("+++ERROR+++")