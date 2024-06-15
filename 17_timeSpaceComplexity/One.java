// time complexity is a function that gives us the relationship about how time will grow as input grows
// time complexity != time taken

// considerations
// always look for worst time complexity
// always look for complexity for large infinite data
// linear search O(N) : even though value of actual time is diff they all grow linearly
// we dont care about actual time  ignore all constants
// always ignore less dominating terms


// big O notation 
// word definition :  O(N^3) : the relation cannnot exceed N^3
// mathematical part : 

// big omega notation
// opposite of bigO notation  bo(n^3) : atleast n^3 

// what if an algo has ub and lb as n^2 = O(n^2) & bo(n^2)
// theta notation

// little o notation : loosely upper bound strictly lower

// little omega notation : loosely lower bound strictly higher


// bubble sort : O(N^N)  best case O(N)
// auxiliary space O(1)
// sorting in place yes
// stable yes
// min time when already sorted

// selection sort : O(N^2)
// avg complexity : O(N^2)
// best complexity : O(N^2)
// space complexity : O(1)
// stable : no

// insertion sort : O(N^2)
// auxiliary space : O(1)
// sorting in place yes