#include<algorithm>
#include<iostream>
using namespace std;
int main(void){

 
   cout << "check0" << "\n";

//Helpers for input and output

   cout << "check9" << "\n";
   int N, K;
   cin >> N >> K; 
   cout << "check8" << "\n";
   int C[N];
  
   cout << "check1" << "\n";
   for(int i = 0; i < N; i++){
      cin >> C[i];
   }
   sort(C,C+N);
   reverse(C,C+N);
   int q=0;
   int cost=0;
   for (int i=0; i<N; i++){
	q=i/K;
	cost+=(q+1)*C[i];
	} 
	cout << cost;   
return 0;


}
