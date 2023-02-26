# Leer un número entero de dos dígitos y determinar si ambos dígitos son pares

try:
	numero = int(input("Ingrese el valor numerico: "))
	if numero >9 and numero < 100:
		dig1 = numero // 10
		dig2 = numero % 10

		resultado_dig1 = dig1 % 2
		resultado_dig2 = dig2 % 2

		if resultado_dig1 == 0:
			print("El primer digito es par.")		
		else:
			print("El primer digito no es par.")
		if resultado_dig2 == 0:
			print("Segundo digito es par.")
		else:
			print("Segundo digito no es par.")
	else:
		print("El valor ingresado no es de dos digitos.")
except ValueError:
	print("El valor indicado no es correcto.")