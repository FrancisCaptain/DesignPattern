### 三种工厂模式之间的区别

| 工厂模式         | 需要提供需求给工厂创造产品，小作坊式的生产                   |
| ---------------- | ------------------------------------------------------------ |
| **工厂方法模式** | **每个工厂只针对一个产品等级结构，指定的工厂去创建指定的类别** |
| **抽象工厂模式** | **工厂可以针对多个产品等级结构，不止单一的类别，可以供用户去选择** |

### 工厂模式UML

![工厂模式](https://github.com/FrancisCaptain/DesignPattern/blob/master/Factory/src/main/resources/%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8FUML.png?raw=true)

### 工厂方法模式UML

![工厂方法模式](https://github.com/FrancisCaptain/DesignPattern/blob/master/Factory/src/main/resources/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8FUML.png?raw=true)

### 抽象工厂模式UML

![抽象工厂模式UML](https://github.com/FrancisCaptain/DesignPattern/blob/master/Factory/src/main/resources/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8FUML.jpg?raw=true)

### 产品族和产品等级结构之间的关系

产品等级：抽象某一类别的产品，派生出这一类别的产品。例：鞋子，阿迪达斯的鞋子、耐克的鞋子、匡威的鞋子等，鞋子为抽象中的类别，具体的品牌为其子类。

产品族：不同产品等级下面不同类别的一组产品。例：阿迪达斯下面可以有篮球、衣服、鞋子等，由同一工厂创建出来的同品牌不同类别的产品。

![产品族与产品等级](https://github.com/FrancisCaptain/DesignPattern/blob/master/Factory/src/main/resources/%E4%BA%A7%E5%93%81%E7%AD%89%E7%BA%A7%E4%B8%8E%E4%BA%A7%E5%93%81%E6%97%8F.png?raw=true)
