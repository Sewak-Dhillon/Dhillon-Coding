#include<bits/stdc++.h>

using namespace std;
class Box{
    private:
    int l;
    int b;
    int h;

// The class should have the following functions : 

// Constructors: 
// Box();
public:
Box(){
        l = 0;
        b = 0;
        h = 0;
    }
// Box(int,int,int);
Box(int x,int y,int z){
        l = x;
        b = y;
        h = z;
    }
// Box(Box);
Box( const Box& obj){
        this->l = obj.l;
        this->b = obj.b;
        this->h = obj.h;
    };


// int getLength(); // Return box's length
int getLength()const{
    return l;
}
// int getBreadth (); // Return box's breadth
int getBreadth ()const{
    return b;
}
// int getHeight ();  //Return box's height
int getHeight ()const{
    return h;
}
// long long CalculateVolume(); // Return the volume of the box
long long CalculateVolume(){
    long long volume = (long long) l * b * h;
    return volume;
    }

//Overload operator < as specified
//bool operator<(Box& b)
bool operator<(Box& obj){
    if(obj.l < l)
        return true;
    else if(obj.b < b && l == obj.l)
        return true;
    else if(obj.h < h && b == obj.b && l == obj.l)
        return true;
    return false;
}

//Overload operator << as specified
friend ostream& operator<<(ostream& out, Box& B){
    out << B.l << " " << B.b << " "<< B.h;
    return out;
}
};

void check2()
{
	int n;
	cin>>n;
	Box temp;
	for(int i=0;i<n;i++)
	{
		int type;
		cin>>type;
		if(type ==1)
		{
			cout<<temp<<endl;
		}
		if(type == 2)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			temp=NewBox;
			cout<<temp<<endl;
		}
		if(type==3)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			if(NewBox<temp)
			{
				cout<<"Lesser\n";
			}
			else
			{
				cout<<"Greater\n";
			}
		}
		if(type==4)
		{
			cout<<temp.CalculateVolume()<<endl;
		}
		if(type==5)
		{
			Box NewBox(temp);
			cout<<NewBox<<endl;
		}

	}
}

int main()
{
	check2();
}