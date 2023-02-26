"""Escribir en pantalla el resultado de sumar los primeros 20 múltiplos de 3."""

try:
    numero = 0
    suma = 0
    
    while numero !=63:
        print(numero)
        suma += numero
        numero +=3       
    
    print("La suma de sus multiplos es:", suma)        
except ValueError:
    print("+++ERROR+++")