// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));

int num_1 = 1;
int num_2 = 8;
cout << "do you want to have the line vertcal ( V ), horizontal ( h ), or diagonal ( d )" << endl;
 char direction = 'A';
 cin >> direction;
 if ( direction == 'h' )
  {
  	char symbol = 'a';
  	int length = 1;
  	cout << "what charcter to you want to use for the line" << endl;
  	cin >> symbol;
  	cout << "how long do you want the line to be" << endl;
  	cin >> length;
  	for(int x = 1; x <= length; x = x + 1)
  	{
  	 cout << symbol;
  	}
  }
  else if ( direction == 'v')
  {
  	char symbol = 'a';
  	int length = 1;
  	cout << "what charcter to you want to use for the line" << endl;
  	cin >> symbol;
  	cout << "how long do you want the line to be" << endl;
  	cin >> length;
  	for(int x = 1; x <= length; x = x + 1)
  	{
  	 cout << symbol << endl;
  	}
  }
  else if ( direction == 'H')
  {
   char symbol = 'a';
  	int length = 1;
  	cout << "what charcter to you want to use for the line" << endl;
  	cin >> symbol;
  	cout << "how long do you want the line to be" << endl;
  	cin >> length;
  	for(int x = 1; x <= length; x = x + 1)
  	{
  	 cout << symbol;
  	}
  }
  else if ( direction == 'V')
  {
   char symbol = 'a';
  	int length = 1;
  	cout << "what charcter to you want to use for the line" << endl;
  	cin >> symbol;
  	cout << "how long do you want the line to be" << endl;
  	cin >> length;
  	for(int x = 1; x <= length; x = x + 1)
  	{
  	 cout << symbol << endl;
  	}
  }
  else if ( direction == 'd')
  {
  	 char symbol = 'a';
  	int length = 1;
  	cout << "what charcter to you want to use for the line" << endl;
  	cin >> symbol;
  	cout << "how long do you want the line to be" << endl;
  	cin >> length;
  	for(int x = 1; x <= length; x = x + 1)
  	{
  	gotoxy(num_1,num_2);
  	 cout << symbol << endl;
  	 num_1 = num_1 + 1;
  	 num_2 = num_2 + 1;
  	}
  }
  else 
  {
  	cout << "your input was not a valid direction";
  }
	
	




}
