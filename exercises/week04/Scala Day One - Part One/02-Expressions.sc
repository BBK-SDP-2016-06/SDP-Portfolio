//Question 1

var sky = "sunny"
var temp = 90
sky == "sunny" && temp > 80

//Question 2

sky = "partly cloudy"
temp = 91
(sky == "sunny" || sky == "partly cloudy") && temp > 80

//Question 3

(sky == "sunny" || sky == "partly cloudy") && (temp < 20 || temp > 80)

//Question 4

def fahrenheitToCelsius(x : Double) : Double = (x - 32) * 5 / 9
var t = fahrenheitToCelsius(50)

//Question 5

def celsiusToFahrenheit(x : Double) : Double = x * 9 / 5 + 32
var t2 = celsiusToFahrenheit(10)
