"DOCUMENTATİON" : 

Entity 

SQL de tabloları oluşturmak ve kolon isim,parametrelerini entity oluşturulur.

** Students ve Lessons adında iki entity clası oluşturldu.Bu iki tablo 
Lessons classı içinde bulunan student_id ve Students classı içindeki id ile  
eşleştirildi.

Repository


** Repository içinde SQL sorguları oluşturuldu.Business işlerinde database de 
yapacağımız sorguları olışturuldu. Students ve Lessons classları içinde özel 
sorgu bulunmamaktadır.Genel sorgu Base class içerisindedir.

Service

** Service içerisinde Business işlerini(CRUD) yapmak için oluşturldu.Generic 
foksiyonlar burada bulunur.

Controller

**BaseController içerisinde dört CRUD metodu bulunnur.
--get için finAll methodu kullanılır. findAll methodu herhangi bir parametre almaz.
Geriye istenilen entityi list halinde döndürür.
--post için save methodu kullanılır. save methodu kullanmak için body de kaydedilmek
istenen entitye ait json gönderilmelidir.Save edilen id ye ait entityi list halinde döndürür.
--put için update methodu kullanılır.update methodu kullanmak için body de güncellenmek 
istenen id ye ait entity json formatında gönderilir.Update edilen id ye ait entityi 
list halinde döndürür.
--delete için delete medhodu gönderilir.Herhangi bir değer döndürmez.
Kullanmak için bodye parametre olarak id gönderilmelidir.(KEY=id, Value:Long)







