# Leer dos numeros enteros de dos digitos y determinar cuanto es la suma de todos sus digitos

try:

    numero = int(input("Ingrese un valor numerico: "))

    if numero >=10 and numero <=99:
        print("El valor ingresado es:", numero)
        dig1 = numero %10
        dig2 = numero // 10
        suma = dig1 + dig2
        print("La suma  de sus digitos es:", suma)
    else: 
        print("El valor ingresado no es de dos digitos")

except ValueError:
    print("+++ERROR+++")