# Leer un número entero de dos dígitos y determinar a cuánto es igual la suma de sus dígitos.

"""try:
	numero = int(input("Ingrese el valor numerico: "))

	if numero >9 and numero < 100:
		dig1 = numero // 10
		dig2 = numero % 10
		suma = dig1 + dig2
		print("El valor ingresado es de dos digitos y la suma de sus digitos es:", suma)
	else:
		print("El valor ingresado no es de dos digitos.")

except ValueError:
	print("El valor indicado no es correcto.")"""

try:
	numero = int(input("Ingrese el valor numerico: "))
	suma = 0
	cont = 0

	while numero !=0:
		dig = numero % 10
		cont +=1
		suma += dig
		numero //= 10

	print(suma)
	print("La cantidad de digitos que tine el valor son:", cont)

except ValueError:
	print("+++Error+++")