// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// to do list, find out how long number 1 is, ask for number 2, find out how long number 2 is, 
	//             find out how long answer is ( max number = 99980001 ), 
	//			   make box, make equation print out inside the box ( should be 2 away from walls, and 2 away from top / bottom)
	//			   make sure cal can loop corecttly ( should loop at number 1 intake), make sure loop can end at any scanner
	
	int num_1 = '1';
	int num_2= '1';
	char box = 'A';  
	char opiration = '+';
	int X_coordinate;  // CB before adding in the box, it should be 2 bellow current text
	int Y_coordinate;  // CB before adding in the box
	int hight = 7; // number will change before box is made
	int width = 15;  // number will change before box is made
	int True_width = 2;  // DO NOT CHANGE
	int True_hight = 2;  // DO NOT CHANGE
	int spacing_h = 5; //used for sapcing in the box
	int spacing_w = width - 2;  // used for sapcing in the box
	int P = 1; // use this no make sure loop can loop
	
	cout << "What do you want the frame of the box to be when it shows up" << endl;
	cout << "Note this action can only be undone by re - runing the basecode" << endl;
	cin >> box;
	cout << " if you wish to stop type in q or Q at the beggening of evey loop" << endl << endl;
	while( P <= 100)
	{
		char quit = 'a';
		cout << "do you wish to turn off the calculator ( q )" << endl;
		cin >> quit;
		if ( quit == 'q')
		{
			break;
		}
		else if ( quit == 'Q')
		{
			break;
		}
		cout << "plaese enter your first number" << endl;
		cin >> num_1;
		if ( num_1 <=9) // this is a chak for number in the single diget 
		{
			cout << "what opiration do you want to use " << endl;
			cout << "Addition ( + ), subtraction ( - ), Multply ( * ), and divide ( / )" << endl;
			cin >> opiration;
			if ( opiration == 'q')
			{
				break;
			}
			if ( opiration == '+')
			{
				cout << "what do you want for the second number" << endl;
				cin >> num_2;
				if ( num_2 <= 9) // single digit numbers
				{
					int answer = num_1 + num_2;
					if ( answer <= 9 ) // single digit answers
					{
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					cout << box << "  " << num_1 << " " << opiration << " " << num_2 << " = " << answer << "  " << box << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					}
					else if ( answer <= 99) // double digit answers
					{
					int width = 16;
					int spacing_w = width - 2;  // used for sapcing in the box
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					cout << box << "  " << num_1 << " " << opiration << " " << num_2 << " = " << answer << "  " << box << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					}
					else if ( answer <= 999) // triple digit answers
					{
						int width = 17;
					int spacing_w = width - 2;  // used for sapcing in the box
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					cout << box << "  " << num_1 << " " << opiration << " " << num_2 << " = " << answer << "  " << box << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					}
					else if ( answer <= 9999) // four digit answers
					{
						int width = 18;
					int spacing_w = width - 2;  // used for sapcing in the box
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					cout << box << "  " << num_1 << " " << opiration << " " << num_2 << " = " << answer << "  " << box << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					}
				}
				else if ( num_2 <= 99) // double digit numbers
				{
					int answer = num_1 + num_2;
					cout << endl;
					if( answer <= 99) // double digit answers
					{
						int width = 17;
					int spacing_w = width - 2;  // used for sapcing in the box
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					cout << box << "  " << num_1 << " " << opiration << " " << num_2 << " = " << answer << "  " << box << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					}
					else if ( answer<= 999) // tirple digit numbers
					{
							int width = 18;
					int spacing_w = width - 2;  // used for sapcing in the box
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					cout << box << "  " << num_1 << " " << opiration << " " << num_2 << " = " << answer << "  " << box << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					}
				}
				else if ( num_2 <= 999) // tirple digit numbers
				{
					int answer = num_1 + num_2;
					if ( answer <= 999)
					{
							int width = 19;
					int spacing_w = width - 2;  // used for sapcing in the box
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					cout << box << "  " << num_1 << " " << opiration << " " << num_2 << " = " << answer << "  " << box << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					}
					else if ( answer < 9999)
					{
							int width = 20;
					int spacing_w = width - 2;  // used for sapcing in the box
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					cout << box << "  " << num_1 << " " << opiration << " " << num_2 << " = " << answer << "  " << box << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					}
				}
				else if ( num_2 <= 9999) // four digit numbers
				{
					int answer = num_1 + num_2;
					if( answer <= 9999)
					{
							int width = 21;
					int spacing_w = width - 2;  // used for sapcing in the box
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					cout << box << "  " << num_1 << " " << opiration << " " << num_2 << " = " << answer << "  " << box << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					}
					else if ( answer <= 99999) // five digit answers
					{
							int width = 22;
					int spacing_w = width - 2;  // used for sapcing in the box
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					cout << box << "  " << num_1 << " " << opiration << " " << num_2 << " = " << answer << "  " << box << endl;
					for(int B = 0; B < 2; B++)
					{
					cout << box;
					for(int A = 0; A < spacing_w; A++)
					{
						cout << " ";
					}
					cout << box << endl;
					}
					for(int Q = 0; Q < width; Q++)
					{
						cout << box;
					}
					cout << endl;
					}
				}
			}
			else if ( opiration == '-')
			{
				cout << "what do you want for the second number" << endl;
				cin >> num_2;
				if ( num_2 <= 9) // single digit numbers
				{
					int answer = num_1 - num_2;
					if ( answer <= 0) // answer is zero or tenth answers
					{
						
					}
					else if ( answer <= 9) // sigle digit answers
					{
						
					}
				}
				else if ( num_2 <= 99) // double digit numbers
				{
					
				}
				else if ( num_2 <= 999) // triple digit answers
				{
					
				}
				else if( num_2 <= 9999) // four digit answers
			}
			else if ( opiration == '*')
			{
				
			}
			else if ( opiration == '/')
			{
				
			}
			else
			{
				cout << " Your input was not understood, restraing ..." << endl;
				cout << " ..." << endl;
				cout << " ..." << endl;
				cout << " " << endl;
				
			}
		}
		else if ( num_1 <= 99) // this for doubble diget numbers
		{
			
		}
		else if ( num_1 <= 999) // This is for triple diget numbers
		{
			
		}
		else if ( num_1 <= 9999) // This is for four - diget numbers
		{
			
		}
	}

}
