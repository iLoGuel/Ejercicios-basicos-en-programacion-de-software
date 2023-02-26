# Leer un número entero de dos dígitos y determinar si un dígito es múltiplo del otro.

try:

	numero = int(input("Ingrese un valor numerico: "))

	if numero >=10 and numero <=99:
		print("El valor ingreasdo es de dos digitos")
		dig1 = numero // 10
		dig2 = numero % 10

		if dig1 % dig2 == 0:
			print("El digito", dig1,"es multiplo de", dig2)
		else:
			print("El digito", dig1,"no es multiplo de",dig2)
		if dig2 % dig1 == 0:
			print("El digito", dig2,"es multiplo de", dig1)
		else:
			print("El digito", dig2,"no es multiplo de", dig1)
	else:
		print("El valor ingresado no es correcto")

except ValueError:
	print("El valor indicado no es correcto.")