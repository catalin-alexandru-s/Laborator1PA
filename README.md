# Laborator1PA 
For Advanced Programming-First Lab.

--For the compulsory exercise--

Firstly I had to show the "Hello World!" text after that I had to define an array of strings that contains programming languages.
I generated a random number using the Math.random() function and I had to do some calculations such as adding and multiplying, for which I created two functions for the operations.
Then, I had to break the number generated into digits to make the sum between them, with the sumaCif function, because the compiler generates such a big number, the sum of the digits will be formed in a 
two-digit number and we don't want that, so I had to create another function(sumaFin) which checks if the number is bigger than 10 meaning that, if it is formed by a two-digit number
it will continue to break it, until we are left with a one-digit number.
For the conversion of the binary number and hexadecimal I used two functions for converting them in a decimal number.
Finally I had to display on the screen "Willy-nilly, this semester I will learn " + languages[result] where the result is a number from the calculations and breaking it into  digits, which will be 9 meaning that the result will be equal to 'Java'.


--For Optional exercise--
Let n be an integer given as a command line argument. Validate the argument!
Create a n x n matrix, representing the adjacency matrix of a random graph .
Display on the screen the generated matrix (you might want to use the geometric shapes from the Unicode chart to create a "pretty" representation of the matrix).
Verify if the generated graph is connected and display the connected components (if it is not).
Assuming that the generated graph is connected, implement an algorithm that creates a partial tree of the graph. Display the adjacency matrix of the tree.
For larger n display the running time of the application in nanoseconds (DO NOT display the matrices). Try n > 30_000. You might want to adjust the JVM Heap Space using the VM options -Xms4G -Xmx4G.
Launch the application from the command line, for example: java Lab1 100.

Name:Sîrcu Cătălin
