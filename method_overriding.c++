#include <iostream>
using namespace std;

class Base {
public:
    virtual void display() {
        cout << "Base display() method" << endl;
    }
};

class Derived : public Base {
public:
    void display() override {
        cout << "Derived display() method" << endl;
    }
};

int main() {
    Base *basePtr;
    Derived derivedObj;

    basePtr = &derivedObj;

    basePtr->display();

    return 0;
}

