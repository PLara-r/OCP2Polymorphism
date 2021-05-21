# OCP2Polymorphism

Polymorphismэто способность одного интерфейса поддерживать несколько базовых форм. В Java это позволяет передавать несколько типов объектов одному методу или классу.
Пример смотри в репо.
public interface LivesInOcean { public void makeSound(); }
 public class Dolphin implements LivesInOcean {  
 public void makeSound() { System.out.println("whistle");
 }}
 public class Whale implements LivesInOcean {  
 public void makeSound() { System.out.println("sing");
 }}
 public class Oceanographer {  
 public void checkSound(LivesInOcean animal) {   
   animal.makeSound(); 
  }  
 public void main(String[] args) {
      Oceanographer o = new Oceanographer();  
    o.checkSound(new Dolphin());   
   o.checkSound(new Whale()); 
  }}
Этот код компилируется и выполняется без проблем и выдает следующий вывод:
WhistLe
Sing

В этом примере кода наш Oceanographerкласс включает метод с именем checkSound(), способный принимать любой объект,
класс которого реализует LivesInOceanинтерфейс. Мы также можем создавать новые объекты, такие как Fishили Lobster, 
которые также реализуют LivesInOceanинтерфейс и которые будут совместимы с нашим Oceanographerклассом.


Полиморфизм также позволяет одному объекту принимать различные формы. Как вы, возможно, помните, изучая экзамен OCA, доступ к Java-объекту можно получить,
используя ссылку того же типа, что и объект, ссылку, которая является суперклассом объекта, или ссылку, которая определяет интерфейс, который реализует объект,
либо напрямую, либо через суперкласс. Кроме того, приведение не требуется, если объект переназначается на супертип или интерфейс объекта.
Следующий пример иллюстрирует это полиморфное свойство:(смотри репо OCP2Polymorphism2)

public class Primate { 
  public boolean hasHair() {   
   return true;  
 }}
 public interface HasTail {   
public boolean isTailStriped();
} 
public class Lemur extends Primate implements HasTail {  
 public int age = 10;  
  public boolean isTailStriped() {    
  return false; 
  }    
public static void main(String[] args) {  
    Lemur lemur = new Lemur();   
   System.out.println(lemur.age);      
 HasTail hasTail = lemur;     
 System.out.println(hasTail.isTailStriped());
Primate primate = lemur;    
  System.out.println(primate.hasHair());
   }}
Этот код компилируется и выполняется без проблем и выдает следующий вывод:

10
False
True




