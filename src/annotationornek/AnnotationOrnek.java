
package annotationornek;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention (RetentionPolicy.RUNTIME) 
@interface Annotation1{  //notasyon tanımlandı
        String ad( ); 
        String soyad( );
        String şehir( );
        String okul( );
        String bölüm( );}
public class AnnotationOrnek {
    public static void main(String[] args) 
    { AnnotationOrnek annotation=new AnnotationOrnek( );
        annotation.myMethod( );}
    @Annotation1 (ad="aziz", soyad="karagülmez", şehir="Burdur" ,okul="MAKÜ",bölüm="Bilgisayar Programcılığı") //ad tipini yazmaya gerek kalmadı
    public void myMethod( ) 
    {try { //reflection yapılıyor
            Class<? extends AnnotationOrnek> reflClass=this.getClass();
            Method mth = reflClass.getMethod ("myMethod");
            Annotation1 annotation =mth.getAnnotation (Annotation1.class);
            System.out.println("ÖĞRENCİ BİLİGİLERİ");
            System.out.println("Ad:" + annotation.ad());  //Ad yazarak ekrana yazdırıyotuz be annotation.ad yazarak değeri yanına çekiyoruz.
            System.out.println("Soyad:" + annotation.soyad()); //soyad yazarak ekrana yazdırıyotuz be annotation.soyad yazarak değeri yanına çekiyoruz.
            System.out.println("Şehir:" + annotation.şehir());//şehir yazarak ekrana yazdırıyotuz be annotation.şehir yazarak değeri yanına çekiyoruz.
            System.out.println("Okul:" + annotation.okul());//okul yazarak ekrana yazdırıyotuz be annotation.okul yazarak değeri yanına çekiyoruz.
            System.out.println("Bölüm:" + annotation.bölüm());//bölüm yazarak ekrana yazdırıyotuz be annotation.bölüm yazarak değeri yanına çekiyoruz.
            }catch (Exception e) 
            { e.printStackTrace();}}}
    
   