# Leer un número entero de dos dígitos y determinar si sus dos dígitos son primos.

try:

	numero = int(input("Ingrese un valor numerico: "))

	if numero >=10 and numero <=99:
		print("El valor ingreasdo es de dos digitos")
		dig1 = numero // 10
		dig2 = numero % 10

		if numero % 2 ==0 or numero % 3 ==0 or numero % 5 ==0 or numero % 7 ==0:
			print(numero, " no es primo.")
			if dig1 % 2 ==0 or dig1 % 3 ==0 or dig1 % 5 ==0 or dig1 % 7 ==0:
				print("su primer digito es primo")
			else:
				print("su primer digito no es primo")
			if dig2 % 2 ==0 or dig2 % 3 ==0 or dig2 % 5 ==0 or dig2 % 7 ==0:
				print("su segundo digito es primo")
			else:
				print("su segundo digito no es primo")
		else:
			print(numero, "es primo.")
			if dig1 % 2 ==0 or dig1 % 3 ==0 or dig1 % 5 ==0 or dig1 % 7 ==0:
				print("su primer digito es primo")
			else:
				print("su primer digito no es primo")
			if dig2 % 2 ==0 or dig2 % 3 ==0 or dig2 % 5 ==0 or dig2 % 7 ==0:
				print("su segundo digito es primo")
			else:
				print("su segundo digito no es primo")	
	else:
		("El valor ingresado no es correcto.")
except ValueError:
	print("El valor indicado no es correcto.")