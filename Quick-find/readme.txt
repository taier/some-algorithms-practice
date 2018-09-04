Few sets of items:
{1,2,3}, {4,5,6}, {7,8,9}

You could connect any 2 items by calling connect(number1,number2). You could do that multiple times. If you connect items from different sets, that already connected with other items, they would be connected in-between. 
For example, if you connect 3 with 5, that means that 2 would be connected with 6 as well. 
You could check if elements are connected

QuickFindModule implements all that logic:
1) the program is asking for a number of elements (N)
2) then you could connect each element with other by calling connect(number1, number2). You could call that function multiple times
3) you could check if items are connected by calling isConnected(number1, number2)

Other:
There is a module UserInputModule that abstracts the communication with a user