# Leer un número entero de dos dígitos menor que 20 y determinar si es primo.
try:
	numero = int(input("Ingrese un valor numerico: "))

	if numero >=0 and numero <=21:
		print("Es un numero menor o igual a 20")
		if numero==2 or numero==3 or numero==5 or numero==7 or numero==11 or numero==13 or numero==17 or numero==19:
			print("Y es un numero primo")
		else:
			print("Y no es un numero primo")
	else:
		print("No cumple con la condición.")

except ValueError:
	print("El valor indicado no es correcto.")