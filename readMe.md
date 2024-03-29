# com.BuySellCycle
### Team3
### 
***


1. Features altinda olusturulacak class isimlendirmesi==>US_001 seklinde olmali

2. Locate alinan element nerenin elementi oldugu aciklama satiri ile aciklanmali
* Aciklama Satiri Find By notasyonunun ustune yazilmali.
  || orn:  Homepage>> LoginLink>> Email Text Box ||

<br/>

### Git

### SAKIN MAİN'DE PUSH YAPMA!!
***

1. Herkes kendi adina birer branch olusturur.
    * `git branch <isim>`

2. Yapilan degisikliklerin tamamini olusturdugunuz branchte yapmalisiniz !
    * `git status` yazmalisiniz. Terminalde kirmizi cikan dosya yolunu git add komutunun yanina yapistirin!!
    * `git add <statustan alinan isim>` islemini kendi branchinizde yapmalisiniz!!
    * `git commit -m  "İsim/tarih/Yapilan Degisiklikler icin bir mesaj yazilir."`
      Örn >>> git commit -m "<Kendi isminiz>/02.07/loginClassEklendi"
    * `git push`
    * terminalde gelen linkten ustteki linke tiklanir ve github hesabi sayfasi acilir
    * Push ettigimiz kendi kodumuz icin **request** olusturulur ve İS BİTER.

3. Merge islemi Team Lead tarafindan gerceklestirilir

4. Pull işlemi için:
    * `git branch` ile hangi branchte oldugumuzu kontrol ediyoruz.
    * `git checkout main` ile main branchine geciyoruz.
    * `git pull` ile mainde yapilmis olan tum degisikligi kendi ide'mize çekiyoruz.
    * `git checkout branchIsmi` ile vakit kaybetmeden kendi branchimize geciyoruz.
    * `git merge main` komutuyla main branch ile kendi branchimizi birlestiriyoruz ve artik projede calismak icin haziriz.



### Isimlendirmelerde dikkat edilecekler
***
| Element Türü      | Variable name |
|-------------------|---------------|
| Button            | signInButton  |    
| Logo              | logoX         |
| icon              | iconX         |
| Sadece text-title | labelX        |
| Drop down         | dropDownX     |
| Radio Button      | radioButtonX  |
| Check box         | checkBoxX     |
| Tablo Sütünu      | columnX       |
| Tablo Satiri      | rowX          |
| Kisi Resimleri    | imageProfileX |
| ürün resimleri    | imageProductX |
| Linkler           | linkFooterX   |
| Linkler           | linkHeaderX   |
| Yazı Girisi       | textBoxX      |
| Arama Kutusu      | searchBoxX    |

>>>Ortak Adımlar<<<
> Open browser and Go to "URL"
> Close the pop-up message
> Verify that the Login link is visible şeklinde...
> Click on the Login link şeklinde ...
> Close the page  Her senaryonon sonuna yazilir.