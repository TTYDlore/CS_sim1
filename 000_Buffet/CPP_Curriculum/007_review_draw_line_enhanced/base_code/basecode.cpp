// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int length = 1;
	char character = 'A';
	int x_coordinate = 1;
	int y_coordinate = 1;
	cout << "what do you want for the length of the line" << endl;
	cin >> length;
	cout << "where do you want the x - coordinate of the line" << endl;
	cin >> x_coordinate;
	cout << "where do you want the y - coordinate of the line" << endl;
	cin >> y_coordinate;
	cout << "what character do you want to use for the line" << endl;
	cin >> character;
	int a = 1;
	while(true)
	{
		gotoxy(x_coordinate,y_coordinate);
		cout << character << endl;
		if ( a == length)
		{
			break;
		}
		a = a + 1;
		x_coordinate = x_coordinate + 1;
		y_coordinate = y_coordinate + 1;
		
	}



}
