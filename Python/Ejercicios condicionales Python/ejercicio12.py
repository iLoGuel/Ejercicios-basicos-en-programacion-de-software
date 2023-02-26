#Leer dos números enteros de dos dígitos y determinar a cuánto es igual la suma de todos los dígitos
try:
	num=int(input("digite un numero entero"))
	if num >=10 and num <100:
		print("cumple con la condicion y la suma de sus digitos es de:")
	else:
		print("no cumple con la condicion.")
	dig1= num %10
	dig2=num // 10
	suma= dig1+dig2
	print(suma)
except ValueError:
	print("+++error+++")
