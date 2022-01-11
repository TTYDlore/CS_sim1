// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
  int respone = 0;
  while (true) 
  cout << "enter a number" << endl;
  int num_1 = 0;
  cin >> num_1;
  cout << "enter your second number" << endl;
  int num_2 = 0;
  cin >> num_2;
  cout << "what methed do you want to do." << endl;
  cout << "Add ( + ), subtract ( - ), mutliply ( * ), and divide ( / )" << endl;
  char M = 'E';
  char add = '+';
  char subtract = '-';
  char mutliply = '*';
  char divide = '/';
  cin >> M;
  if ( M == add)
  {
      int answer = num_1 + num_2;
       cout << "your answer is " << endl;
      cout << answer << endl;
      cout << "Do you wish to continue?  yes ( 1 ) no ( 2 )";
      cin >> respone;
      if (respone == '2')
      {
       cout << "truning off program" << endl;
       break;
      }
      if (respone == 21)
      {
       break;
      }
      respone = respone + 1;
  }
  else if ( M == subtract)
  {
      int answer = num_1 - num_2;
      cout << "your answer is " << endl;
      cout << answer << endl;
  }
  else if ( M == mutliply)
  {
      int answer = num_1 * num_2;
       cout << "your answer is " << endl;
      cout << answer << endl;
  }
  else if ( M == divide )
  {
      int answer = num_1 / num_2;
       cout << "your answer is " << endl;
      cout << answer << endl;
  }
  else
  {
      cout << "Your input does notmatch anyy of the metheds above";
  }
 
    
}
