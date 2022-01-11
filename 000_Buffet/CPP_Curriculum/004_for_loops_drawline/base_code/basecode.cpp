// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
 cout << "do you want to have the line vertcal ( V ) or horizontal ( h )" << endl;
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
  else 
  {
  	cout << "your input was not a valid direction";
  }


}
