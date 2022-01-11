// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
		
	int width = 1;
	int hight = 1;
	char character = 'A';
	int True_width = 1;
	int True_hight = 1;
	int X = 1;
	int x_coordinate = 1;
	int Y_coordinate = 1;
	
	cout << "what do you want for the width of the box" << endl;
	cin >> width;
	cout << "What do you want for the hight of the box" << endl;
	cin >> hight;
	cout << "what do you want the frame of the box to be made of" << endl;
	cin >> character;
	cout << "where do you want the x - coordinate of the box to go" << endl;
	cin >> x_coordinate;
	cout << "where do you want the y - coordinate of the box to go" << endl;
	cin >> Y_coordinate;
	gotoxy(x_coordinate,Y_coordinate);
	for(int x = 1; x <=width; x = x + 1)
	{
		cout << character;
	}
	cout << endl;
	if ( hight == 1)
	{
		cout << endl;
	}
	else if ( hight != 1)
	{
		True_hight = hight - 2;
		True_width = width - 2;
		while(true)
		{
			gotoxy(x_coordinate, Y_coordinate + X);
			cout << character;
			for(int Y = 1 ; Y <= True_width; Y = Y + 1)
			{
				cout << " ";
			}
			cout << character << endl;
			if ( X >= True_hight )
			{
				break;
			}
			X = X + 1;
		}
		gotoxy(x_coordinate, Y_coordinate + True_hight);
		for(int W = 1; W <= width; W = W + 1)
	{
		cout << character;
	}
	
	}

}
