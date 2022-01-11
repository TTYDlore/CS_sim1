// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int width = 1;
	int hight = 1;
	int x_coordinate = 1;
	int y_coordinate = 1;
	char character  = 'A';
	int A = 1;
	cout << "what do you want for the width of the box to be" << endl;
	cin >> width;
	cout << "what do you want the hight of the box to be" << endl;
	cin >> hight;
	cout << "what do you want for the x - coordinate" << endl;
	cin >> x_coordinate;
	cout << "what do you want for the y_coordinate" << endl;
	cin >> y_coordinate;
	cout << "what do you want the box to made of" << endl;
	cin >> character;
	while(true)
	{
		for(int B = 1; B <= width; B = B + 1)
		{
			gotoxy(x_coordinate,y_coordinate);
			cout << character;
			x_coordinate = x_coordinate + 1;
		}
		if( A == hight)
		{
			break;
		}
		cout << endl;
		x_coordinate = x_coordinate - width;
		y_coordinate = y_coordinate + 1;
		A = A + 1;
	}

}
