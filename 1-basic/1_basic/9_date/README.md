# Date in Java

> Java provides the Date class available in java.util package, this class encapsulates the current date and time.


`Date( )`
This constructor initializes the object with the current date and time

`Date(long millisec)`
his constructor accepts an argument that equals the number of milliseconds that have elapsed since midnight, January 1, 1970.


*1	boolean after(Date when)*
This method tests if this date is after the specified date.

*2	boolean before(Date when)*
This method tests if this date is before the specified date.

*3	Object clone()*
This method return a copy of this object.

*4	int compareTo(Date anotherDate)*
This method compares two Dates for ordering.

*5	boolean equals(Object obj)*
This method compares two dates for equality.

*6	static Date from​(Instant instant)*
This method obtains an instance of Date from an Instant object.

*7	long getTime()*
This method returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.

*8	int hashCode()*
This method returns a hash code value for this object.

*9	void setTime(long time)*
This method sets this Date object to represent a point in time that is time milliseconds after January 1, 1970 00:00:00 GMT.

*10	Instant toInstant()*
This method converts this Date object to an Instant.

*11	String toString()*
This method converts this Date object to a String of the form.

## Simple DateFormat Format Codes

G	Era designator	            AD
y	Year in four digits	        2001
M	Month in year	            July or 07
d	Day in month	            10
h	Hour in A.M./P.M. (1~12)	12
H	Hour in day (0~23)	        22
m	Minute in hour	            30
s	Second in minute	        55
S	Millisecond	                234
E	Day in week	                Tuesday
D	Day in year	                360
F	Day of week in month	    2 (second Wed. in July)
w	Week in year	            40
W	Week in month	            1
a	A.M./P.M. marker	        PM
k	Hour in day (1~24)	        24
K	Hour in A.M./P.M. (0~11)	10
z	Time zone	                Eastern Standard Time
'	Escape for text	            Delimiter
"	Single quote	            `

## Date and Time Conversion Characters

c	Complete date and time	                            Mon May 04 09:51:52 CDT 2009
F	ISO 8601 date	                                    2004-02-09
D	U.S. formatted date (month/day/year)	            02/09/2004
T	24-hour time	                                    18:05:19
r	12-hour time	                                    06:05:19 pm
R	24-hour time, no seconds	                        18:05
Y	Four-digit year (with leading zeroes)	            2004
y	Last two digits of the year (with leading zeroes)	04
C	First two digits of the year (with leading zeroes)	20
B	Full month name	                                    February
b	Abbreviated month name	                            Feb
m	Two-digit month (with leading zeroes)	            02
d	Two-digit day (with leading zeroes)	                03
e	Two-digit day (without leading zeroes)	            9
A	Full weekday name	                                Monday
a	Abbreviated weekday name	                        Mon
j	Three-digit day of year (with leading zeroes)	    069
H	Two-digit hour (with leading zeroes), between 00 and 23	    18
k	Two-digit hour (without leading zeroes), between 0 and 23	18
I	Two-digit hour (with leading zeroes), between 01 and 12	    06
l	Two-digit hour (without leading zeroes), between 1 and 12	6
M	Two-digit minutes (with leading zeroes)	                    05
S	Two-digit seconds (with leading zeroes)	                    19
L	Three-digit milliseconds (with leading zeroes)	            047
N	Nine-digit nanoseconds (with leading zeroes)	            047000000
P	Uppercase morning or afternoon marker	                    PM
p	Lowercase morning or afternoon marker	                    pm
z	RFC 822 numeric offset from GMT	                            -0800
Z	Time zone	                                                PST
s	Seconds since 1970-01-01 00:00:00 GMT	                    1078884319
Q	Milliseconds since 1970-01-01 00:00:00 GMT	                1078884319047