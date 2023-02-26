# Leer un número entero de dos dígitos y determinar si los dos dígitos son iguales.

try:
	num= int(input("digite un numero"))
	if num>9 and num<100:
		print("el numero tiene 2 digitos")
		dig1=num //10
		dig2=num % 10
		if dig1 == dig2 :
			print("el digito 1:",dig1," es igual al digito al 2:  ",dig2)
		else:
			print("el digito 1: ",dig1,"no es igual al digito  2: ",dig2)

	else:
		print("no cumple con la condicion")
		
except ValueError:
	print("+++error+++")