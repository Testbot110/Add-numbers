#include<iostream>
#include<unordered_map>
using namespace std;
int main(){
    unordered_map<string,int>umap;
    umap["Nupur"]=1;
    umap["shilpi"]=2;
    umap["silki"]=3;
    umap["shaili"]=3;

    umap["Nupur"];
    for(auto x:umap){
        cout<<x.first<<" "<<x.second<<endl;
    }
    return 0;
}/*
shaili 3
silki 3
shilpi 2
Nupur 1
*/
