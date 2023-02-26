#  Leer un número entero de dos dígitos y mostrar en pantalla todos los enteros comprendidos entre un dígito y otro.

try:
    numero = int(input("Ingrese un valor numerico: "))

    dig1 = numero %10
    dig2 = numero //10

    if numero >= 10 and numero <= 99:
        print("Los numeros comprendidos entre uno y otro:")
        for i in range( dig1, dig2+1, 1):
            print(i)
        for i in range( dig2, dig1+1, 1):
            print(i)
    else:
        print("El valor ingresado es invalido")



except ValueError:
    print("+++ERROR+++")