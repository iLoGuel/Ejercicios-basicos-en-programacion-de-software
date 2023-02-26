# Leer un número entero de dos dígitos y determinar si es primo y además si es negativo.
try:
	numero = int(input("Ingrese un valor numerico: "))

	if numero >=10 and numero <=99:
		print("Es un valor de dos digitos")
		if numero ==2 or numero ==3 or numero ==5 or numero ==7 or numero ==11 or numero ==13 or numero ==17 or numero ==19 or numero ==23 or numero ==29 or numero ==31 or numero ==37 or numero ==41 or numero ==43 or numero ==47 or numero ==53 or numero ==59 or numero ==61 or numero ==67 or numero ==71 or numero ==73 or numero ==79 or numero ==83 or numero ==89 or numero ==97:
			print("El valor es un numero primo y no es negativo")
		else:
			print("El valor no es primo")
	else:
		print("No es un valor de dos digitos.")

except ValueError:
	print("El valor indicado no es correcto.")