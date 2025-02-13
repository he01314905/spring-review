package com.annotation.bean2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class A {
	public A() {System.out.println("A 無參數建構子執行");}
}
@Controller
class B{
	public B() {System.out.println("B 無參數建構子執行");}
}
@Repository
class C{
	public C() {System.out.println("C 無參數建構子執行");}
}
@Service
class D{
	public D() {System.out.println("D 無參數建構子執行");}
}
