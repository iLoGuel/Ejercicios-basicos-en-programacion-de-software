# Leer un número entero y determinar si es negativo

try:
	numero = int(input("Ingrese el valor numerico: "))

	if numero < 0:
		print("El valor ingresado es negativo.")
	else:
		print("El valor ingresado no es negativo.")

except ValueError:
	print("El valor indicado no es correcto.")