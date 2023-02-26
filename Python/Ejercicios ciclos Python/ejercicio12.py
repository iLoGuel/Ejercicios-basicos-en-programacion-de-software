# Leer un número entero de 3 dígitos y determinar si tiene el dígito 1

'''try:
    numero = int(input("Ingrese el primer valor numerico: "))

    dig1 = numero %1000 //100
    dig2 = numero %100 //10
    dig3 = numero %10

    if numero >=100 and numero <= 999:
        

    else:
        print("El valor ingresado no es de 3 digitos.")

except ValueError:
    print("+++ERROR+++")'''

try:
    numero = int(input("Ingrese el primer valor numerico: "))
    if numero > 99 and numero < 1000:
        while numero != 0:
            dig = numero % 10
            if dig == 1:
                print("El numero tiene el 1")
                break
            else:
                print("El numero no tiene ningun 1")
            numero //= 10
    else:
        print("El numero no tiene 3 digitos")


except ValueError:
    print("+++ERROR+++")