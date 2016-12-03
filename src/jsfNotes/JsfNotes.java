package jsfNotes;

public class JsfNotes {
	
	// JSF --> Java Server Faces
	
	// *Server-side 
	
	// JSF --> Server-side, clientin tarayicisinda degil server da calisir.
	// client side a ornek olarak javascript verilebilir.
	// java script tarayicida calisirken jsf, servler, jsp serverda calisir.
	
	// *Component-oriented/Component Based ozelliklere sahiptir.
	// JSF -> Swing 'in server-side sekli olara dusunebiliriz.
	// Swing 'de herbir yapi icin bir component vardi; jlabel , jtextfield gibi...
	// JSF 'te swing e benzer sekilde componentler tanimlidir.
	
	// *MVC Yapisinda bir Frameworktur.
	// MVC --> Model View Controller

	// JSF te tanimli UI(user interface) componentler vardir.
	// JSF te event-driven /olaya dayali bir programlama ozelligine sahiptir.
	
	// JSF, Java EE projelerinde view layer standart framework olma ozelligine sahiptir.
	
	// Servlet, JSP, JSF, JPA vs dedigimiz kavramlar temelde bir spec/belirtim/sartname/kurallar butunudur.
	
	// Ornegin servlet, jsp icin Tomcat bir implamentation dir.
	// Benzer sekilde  Jetty, Glassfish, Resin gibi server containerlarda farkli servlet ve jsp spectlerini uygulayabilir.
	
	// Veya JPA icin, reference implamentation EclipseLink 'tir.
	// Baska implementationlari da vardir. Ornegin Hibernate in iki tane urun vardir.
	// Bir tanesi JPA spectlerini/kurallarini uygulayan urun 
	// Digeri ise kendilerinin gelistirdigi Jpa dan bagimsiz orm urunu...
	
	// JSF icin implamentatitonlar Mojarra, Apache MyFaces vs.
	
	// *JSF Sayfalari ? Facelets Kavrami
	// JSF 1.x versiyoýnlarinda JSP sayfalari kullanilmaktaydi..
	// Fakat JSF 2.0 versiyonuyla beraber Facelets sayfalari kullanilmaktadir.
	// Facelets; JSF sayfalari icin kullanilan view declaration dilini ifade eder.
	
	// *Facelets Sayfalari;
	
	// Convension geregi .xhmtl sayfalaridir.
	// Expression Language(EL) destegi saglar. (JSP EL dan farki $ yerine # kullanilir....)
	// JSTL Tag Library Destegi saglar.
	// Template Destegi.
	
	// Facelets te kullanabilecegimiz tag library ler;
	
	// 1- JavaServerFaces HTML Tag Library -->input, label, checkbox, radiobutton, select gibi
	// html componentlerini olusturmak icin kullanacagimiz JSF componentleri.
	
	// URI - Uniform Resource Identifier --> facelets sayfamizla ilgili namespace i /tag library import etme gibi dusunebiliriz.
	
	//http://java.sun.com/jsf/html
	// h:

	// 2- JavaServerFaces Core Tag library 
	// http://java.sun.com/jsf/core
	// f:

	// 3 -JSTL Core Tag Library
	// http://java.sun.com/jsp/jstl/core
	// c:

	// 4- JSTL Function Tag library
	// http://java.sun.com/jsf/facelets
	// fn:

	// 5- JavaServer Faces Facelets Tag Library
	// http://java.sun.com/jsf/facelets
	// ui:

	// https://docs.oracle.com/javaee/6/tutorial/doc/gijtu.html


	
}
