
fun(num1,num2)
{
num3=parseInt(num1)+parseInt(num2);
return num3;
}

var num1=prompt("Enter number");
var num2=prompt("Enter number");
var num3=fun(num1,num2);
document.write("Sum is:"+num3);

