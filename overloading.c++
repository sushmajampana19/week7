#include <iostream>
using namespace std;

class opol {
public:
    float real;
    float img;
    opol(float r = 0, float i = 0) {
        real = r;
        img = i;
    }
    opol operator+(const opol& obj) {
        opol temp;
        temp.real = real + obj.real;
        temp.img = img + obj.img;
        return temp;
    }
};

int main() {
    int i;
    cout << "enter how many numbers to add : ";
    cin >> i;
    float a, b;
    opol r(0, 0);
    for (int j = 1; j <= i; j++) {
        cout << "enter a real part : ";
        cin >> a;
        cout << "enter an imaginary part : ";
        cin >> b;
        opol k(a, b);
        r = r + k;
    }
    cout << "complex number : " << r.real << "+" << r.img << "i";
    return 0;
}

