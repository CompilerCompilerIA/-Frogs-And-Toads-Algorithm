# Frogs-And-Toads-Algorithm
***Cuatro sapos y cuatro ranas están sentados sobre rocas en un estanque. Los sapos (marrones) están de un lado; las ranas (verde) por el otro. Una roca vacía se interpone entre ellos. Los animales tienen que cambiar de lugar con el menor número de movimientos posible. Pueden deslizarse sobre una roca adyacente si está vacía, o saltar exactamente sobre otra criatura en una roca vacía.***
 </br> </br>
*Intercambia los sapos y las ranas sin que ninguno de los bichos retroceda. ¿Cuántos movimientos en total se necesitan?,¿cuántas diapositivas?, ¿cuántos saltos?*
 </br>
 <p align="center">
    <img src="https://raw.githubusercontent.com/AleS900/prueba/master/IA/WhatsApp%20Image%202022-04-04%20at%203.27.08%20PM.jpeg" />
 </p>
 ## Solución
La única manera de que un sapo y una rana se crucen es saltando. Como hay **n** sapos y ***n*** ranas, deben darse ***n^2*** saltos para que los bichos cambien de lado. ¿Qué pasa con el número de deslizamientos? Observa que cada bicho viaja un total de ***n + 1*** espacios (ver el diagrama del rompecabezas). Entonces, la distancia total recorrida por los ***2n*** bichos es ***2n(n+1) = 2n^2 + 2n*** espacios. Dado que un salto cubre dos espacios y un desliz uno, la distancia total recorrida por los deslices, y el número de toboganes, debe ser ***2n***.
