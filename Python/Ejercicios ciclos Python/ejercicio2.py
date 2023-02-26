#  Leer un número entero y mostrar todos los pares comprendidos entre 1 y el número leído

try:
    numero = int(input("Ingrese un valor numerico: "))

    for i in range (1, numero +1, 1):
        resultado = i
        if resultado % 2 ==0:
            print(resultado)
        
except ValueError:
    print("+++ERROR+++")