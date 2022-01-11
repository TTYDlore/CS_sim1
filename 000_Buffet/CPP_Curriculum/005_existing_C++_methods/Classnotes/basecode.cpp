// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));

gotoxy(3,5);
cout << "A";

gotoxy(3 +1,5);
cout << "R";

gotoxy(3 + 2,5);
cout << "M";

gotoxy(3 + 3, 5);
cout << "A";
	
gotoxy(3 + 4,5);
cout << "N";

gotoxy(3,5 + 1);
cout << "N";

gotoxy(3,5 + 2);
cout << "D";

gotoxy(3,5 + 3);
cout << "R";

gotoxy(3,5 + 4);
cout << "E";

gotoxy(3,5 + 5);
cout << "W";


for(int i = 0; i < 5; i++)
{
 gotoxy(3 + i,5);
 cout << "N";
}
for(int N = 0; N < 6; N++)
{
 gotoxy(3,5 + N);
 cout << "N";
}
for(int E = 0; E < 6; E++)
{
 gotoxy(3 + E, 5 + E);
 cout << "E";
}














}
