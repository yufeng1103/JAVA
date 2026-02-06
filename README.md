# Java 学习案例集

本仓库提供可直接运行的 Java 学习案例，覆盖：
- **Java 基础编程**
- **Java 高级编程**
- **Java 易错题/常见坑**

所有示例均为单文件可运行（默认包），适合用 `javac` 和 `java` 快速验证。

## 目录结构

```
basic/      # 基础编程案例
advanced/   # 高级编程案例
pitfalls/   # 易错题/常见坑案例
```

## 运行方式

以 `basic/BasicSyntaxDemo.java` 为例：

```bash
javac basic/BasicSyntaxDemo.java
java -cp basic BasicSyntaxDemo
```

> 注意：所有文件均使用默认包，因此 `java -cp <目录> <类名>` 即可运行。

## 示例列表

### 基础编程
- `BasicSyntaxDemo.java`：变量、运算、格式化输出
- `ControlFlowDemo.java`：条件与循环
- `ArrayStringDemo.java`：数组与字符串

### 高级编程
- `OOPDemo.java`：类、继承、接口、抽象类
- `CollectionsDemo.java`：集合、泛型、比较器
- `StreamsDemo.java`：Stream API
- `ConcurrencyDemo.java`：线程、并发工具

### 易错题/常见坑
- `CommonPitfallsDemo.java`：整数溢出、字符串比较、集合修改、浮点精度、Integer 缓存、空指针等
