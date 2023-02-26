# Leer un número entero de dos dígitos y determinar si los dos dígitos son iguales.
try:

	numero = int(input("Ingrese un valor numerico: "))

	if numero >=10 and numero <=99:
		print("El valor ingreasdo es de dos digitos")
		dig1 = numero // 10
		dig2 = numero % 10

		if dig1 == dig2:
			print("El digito 1:", dig1,"es igual al digito 2:", dig2)
		else:
			print("El digito 1:", dig1,"no es igual al digito 2:",dig2)
	else:
		print("El valor ingresado no es correcto")

except ValueError:
	print("El valor indicado no es correcto.")