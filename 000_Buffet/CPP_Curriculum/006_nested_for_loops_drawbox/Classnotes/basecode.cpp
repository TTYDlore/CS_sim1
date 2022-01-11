// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char symbol = 'A';
	int length = 1;
	int width = 1;
	cout << "what do you want the width of the box to be" << endl;
	cin >> width;
	cout << "how long do you want the box" << endl;
	cin >> length;
	cout << "what do you want the character do you want the box to be made out of" << endl;
	cin >> symbol;
	int y = 1;
		for(int i = 0; i < width; i++ )
		{
			
		for(int x = 1; x <= width; x = x + 1)
		{
			cout << symbol;
		}
		cout << endl;
		
		}
	
	

	

}
