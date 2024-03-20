#include<iostream>
using namespace std;

class methodOverload {
public:
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
};

int main() {
    methodOverload obj;
    int option, a, b, c, d, e;

    cout << "Enter option\n";
    cout << "1. Add 1 integer\n";
    cout << "2. Add 2 integers\n";
    cout << "3. Add 3 integers\n";
    cout << "4. Add 4 integers\n";
    cout << "Enter any option: ";
    cin >> option;

    switch (option) {
    case 1:
        cout << "Can't add a single integer\n";
        break;
    case 2:
        cout << "Enter first integer: ";
        cin >> a;
        cout << "Enter second integer: ";
        cin >> b;
        c = obj.add(a, b);
        cout << "Sum of the 2 numbers: " << c << endl;
        break;
    case 3:
        cout << "Enter first integer: ";
        cin >> a;
        cout << "Enter second integer: ";
        cin >> b;
        cout << "Enter third integer: ";
        cin >> c;
        d = obj.add(a, b, c);
        cout << "The sum of three numbers: " << d << endl;
        break;
    case 4:
        cout << "Enter first integer: ";
        cin >> a;
        cout << "Enter second integer: ";
        cin >> b;
        cout << "Enter third integer: ";
        cin >> c;
        cout << "Enter fourth integer: "; // Corrected line
        cin >> d;
        e = obj.add(a, b, c, d);
        cout << "The sum of 4 numbers: " << e << endl;
        break;
    default:
        cout << "Can't add more than 4 numbers\n";
    }

    return 0;
}

