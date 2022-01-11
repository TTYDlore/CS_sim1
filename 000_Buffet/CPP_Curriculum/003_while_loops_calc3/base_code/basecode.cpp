// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
cout << "at any time, if you wish to stop using the program enter q." << endl;
while(true)
{
	
	cout << "enter a number" << endl;
	char num_1 = '0';
	cin >> num_1;
	if (num_1 == 'q')
	{
		break;
	}
	cout << "what methed do you want to use" << endl;
	cout << "add ( + ), subtract ( - ), mutiply ( * ), divide ( / )." << endl ;
	char M = '+';
	cin >> M;
	if ( M == 'q')
	{
		break;
	}
    if ( M == '+')
	{
		cout << "type in a second number" << endl;
	 char num_2 = '1';
	 cin >> num_2;
	 if ( num_2 == 'q')
	 {
	 	break;
	 }
	 int True_num_1 = num_1 - 48;
	 int True_num_2 = num_2 - 48;
	 int True_answer = True_num_1 + True_num_2;
	 cout << "Your answer is " << True_answer << endl;
	}
	else if ( M == '-')
	{
		cout << "type in a second number" << endl;
	 char num_2 = '1';
	 cin >> num_2;
	 if ( num_2 == 'q')
	 {
	 	break;
	 }
	 int True_num_1 = num_1 - 48;
	 int True_num_2 = num_2 - 48;
	 int True_answer = True_num_1 - True_num_2;
	 cout << "Your answer is " << True_answer << endl;
	}
	else if ( M == '*')
	{
		cout << "type in a second number" << endl;
	 char num_2 = '1';
	 cin >> num_2;
	 if ( num_2 == 'q')
	 {
	 	break;
	 }
	 int True_num_1 = num_1 - 48;
	 int True_num_2 = num_2 - 48;
	 int True_answer = True_num_1 * True_num_2;
	 cout << "Your answer is " << True_answer << endl;
	}
	else if ( M == '/')
	{
	  	cout << "type in a second number" << endl;
	 char num_2 = '1';
	 cin >> num_2;
	 if ( num_2 == 'q')
	 {
	 	break;
	 }
	 int True_num_1 = num_1 - 48;
	 int True_num_2 = num_2 - 48;
	 int True_answer = True_num_1 / True_num_2;
	 cout << "Your answer is " << True_answer << endl;
	}
	else
	{
		cout << "Input was not understood, restarting calculator ........." << endl;
		cout << "..." << endl;
		cout << "..." << endl;
	}


	
}

}
