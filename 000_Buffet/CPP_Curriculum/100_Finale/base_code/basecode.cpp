// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	gotoxy(0,14);
	for( int Ground = 1; Ground < 133; Ground++)
	{
		cout << "_";
	}
	gotoxy(25,13);
	for( int West_Wall = 0; West_Wall < 10; West_Wall++)
	{
		gotoxy(25,13 - West_Wall);
		cout << "|";
	}
	for( int West_Roof = 0; West_Roof < 3; West_Roof++)
	{
		gotoxy(24 - West_Roof,4 + West_Roof);
		cout << "/";
	}
	for( int Roof = 0; Roof < 35; Roof++)
	{
		gotoxy(26 + Roof,3);
		cout << "_";
	}
	for( int East_Wall = 0; East_Wall < 10; East_Wall++)
	{
		gotoxy( 60,4 + East_Wall);
		cout << "|";
	}
	for( int East_Roof = 0; East_Roof < 3; East_Roof++)
	{
		gotoxy(61 + East_Roof,4 + East_Roof);
		cout << "\\";
	}
	for(int House_Ground = 0; House_Ground < 34; House_Ground++)
	{
		gotoxy(59 - House_Ground,13);
		cout << "_";
	}
	for(int East_Door = 0; East_Door < 6; East_Door++)
	{
		gotoxy(57,13 - East_Door);
		cout << "|";
	}
	for(int West_Door = 0; West_Door < 6; West_Door++)
	{
		gotoxy(50, 13 - West_Door);
		cout << "|";
	}
	for(int North_Door = 0; North_Door < 7; North_Door++)
	{
		gotoxy(50 + North_Door,7);
		cout << "_";
	}
	gotoxy(56,11);
	cout << "O";
	for(int South_window = 0; South_window < 16; South_window++)
	{
		gotoxy(45 - South_window,11);
		cout << "_";
	}
	for( int West_window = 0; West_window < 5; West_window++)
	{
		gotoxy(45,11 - West_window);
		cout << "|";
	}
	for(int East_Window= 0; East_Window < 5; East_Window++)
	{
		gotoxy(30,7 + East_Window);
		cout << "|";
	}
		for( int North_Window = 0; North_Window < 16; North_Window++)
	{
		gotoxy(45 - North_Window,7);
		cout << "_";
	}
	gotoxy(36,8);
	cout << "/\\";
	gotoxy(35,9);
	cout << "/ *\\";
	gotoxy(34,10);
	cout << "/ * *\\";
	gotoxy(33,11);
	cout << "/";
	gotoxy (40,11);
	cout << "\\";
	for(int east_tree_West_Side = 0; east_tree_West_Side < 12; east_tree_West_Side++)
	{
		gotoxy(79,13 - east_tree_West_Side);
		cout << "|";
	}
	for( int east_tree_East_Side = 0; east_tree_East_Side < 12; east_tree_East_Side++)
	{
		gotoxy(72,13 - east_tree_East_Side);
		cout << "|";
	}
	for( int East_tree_leaf = 0; East_tree_leaf < 5; East_tree_leaf++)
	{
		gotoxy(80 + East_tree_leaf,1 +East_tree_leaf);
		cout << "\\";
	}
	gotoxy(83,5);
	cout << "_";
	for( int Tree_leaf = 0; Tree_leaf < 3; Tree_leaf++)
	{
		gotoxy(82 - Tree_leaf,5 - Tree_leaf);
		cout << "\\";
	}
	
}
