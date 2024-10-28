void main() {
  final cycle = Cycle();
  cycle.run();
}

abstract class Vehicle {
  void run() {}
}
//Keywords : extends , implements, permits, factory

class Bike extends Vehicle {
  @override
  void run() {
    super.run();
  }
}
       
class Cycle implements Vehicle {
  @override
  void run() {
    print("Cycle Running");
  }
}
