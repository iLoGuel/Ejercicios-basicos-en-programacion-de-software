# Leer un número entero y determinar si es un número terminado en 4.

try:
	numero = int(input("Ingrese un valor numerico: "))

	resultado = numero % 10

	if resultado == 4:
		print("El ultimo numero termina en:", resultado)
	else:
		print("El ultimo numero no termina en 4, es:", resultado)


except ValueError:
	print("El valor indicado no es correcto.")