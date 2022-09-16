package ch17;

import java.util.Iterator;

//사자인형, 곰 인형, 권총, 에어팟 
public class ToyMachine {

 Product[] products;

 public Product[] getProducts() {
     return products;
 }

 public void setProducts(Product[] products) {
     this.products = products;
 }

 public Product[] getProduct(int count) {
     Product[] takgetOk = new Product[count];
     // ToyMachine 머신 안에 있는 Product 상품들을 랜덤으로 가지고 와서 
     // takgetOk 담고 리턴 하면 된다.
     for (int i = 0; i < takgetOk.length; i++) {
         System.out.println();
         takgetOk[i] = products[i];
          products[i] = null; 
     }
     // 실제 products[] 녀셕을 null 처리 해주면 된다. 
     return takgetOk; 
 }


}
//마감 시간은 2시까지 
//객체 지향 패러다임으로 코드들 설계하고 
//동작을 구현시킬 수 있는 코드 만들어 보기 !!!