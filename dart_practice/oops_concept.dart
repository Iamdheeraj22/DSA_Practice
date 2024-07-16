void main() {
  //Method Overloading
  Functionality.printMessage(
    'Dheeraj Prajapat',
    'Dheeraj',
  );
  Functionality.printMessage2(name: 'Dheeraj Prajapat', age: 85);

  //Method Overriding
  final mClass1 = MClass1();
  final mClass2 = MClass2();

  mClass1.show();
  mClass2.show();
}

class Functionality {
  static void printMessage(String title, [String? message, String name = '']) {
    print((message ?? 'Hello') + ' ' + title);
  }

  static void printMessage2({required String name, int? age}) {
    print('Your name is $name and age is ${age ?? 15}');
  }
}

class MClass1 {
  void show() {
    print('Method overriding class 1');
  }
}

class MClass2 extends MClass1 {
  @override
  void show() {
    print('Method overriding class 2');
  }
}
