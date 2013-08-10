#include <iostream>
#include <algorithm>

using namespace std;

int main(){

  int N;
	long int K;
	cin >> N >> K;
	long int price[N];
	for (int i=0;i<N;i++){
		cin >> price[i];
	}
	std::sort(price,price+N);
	int counter =0;
	int i=0;
	int sum=0;
	while (K-sum>0){
	sum=sum+price[i];
	counter+=1;
	i++;
	}
	cout << counter-1;
}
