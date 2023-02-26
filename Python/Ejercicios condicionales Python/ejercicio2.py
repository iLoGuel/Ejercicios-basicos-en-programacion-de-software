# Leer un número entero y determinar si tiene 3 dígitos.

try:
	numero = int(input("Ingrese el valor numerico: "))

	if numero > 99 and numero < 1000:
		print("El valor ingresado es de 3 digitos.")
	else:
		print("El valor no es de 3 digitos")

except ValueError:
	print("El valor indicado no es correcto.")