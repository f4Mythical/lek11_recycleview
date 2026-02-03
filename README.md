## ♻️ RECYCLER VIEW

- 🏛️ dodajemy nowa klase  
- 📁 res -> layout -> new resource file(nazywamy produkt_layout)
- 🆕 dodajemy elementy, i robimy wyglad w tym pliku
- ☮️ teraz mainactivty, dodajemy elementy(recycler view ♻️) i uporzadkujemy to
- 🛍️ Teraz dodajemy ZakupyAdapter

CreateClass:
```java
public class ZakupyAdapter extends RecyclerView.Adapter<ZakupyAdapter.ProduktViewHolder>
```
Teraz pod tym wpisujemy oraz klikamy ShowContextAction:
```java
public class ProduktViewHolder extends RecyclerView.ViewHolder
```
Teraz klikamy zakupyAdapter i implement method, mają być pobrane 3 metody (onCreateViewHolder, onBindViewHolder, getItemCount).
Teraz mają być klasy, które ma adapter zapamiętać, wprowadzamy:
```java
private ArrayList<Produkt> produkty;
```
Dodajemy:
```java
private LayoutInflater inflater;
```
Generujemy konstruktor dla listy produktów; w konstruktorze przyjmujemy Context i inicjalizujemy inflater:
```java
public ZakupyAdapter(Context context, ArrayList<Produkt> produkty) {
    this.produkty = produkty;
    this.inflater = LayoutInflater.from(context);
}
```

- 📦 Teraz w ProduktViewHolder dodajemy CheckBox oraz ZakupyAdapter [Zdjecie kodu](https://imgur.com/a/ghFhhmQ)
- 🔙 W getItemCount robimy ``return produkty.size()``
- 🤔 Teraz w ProduktViewHolder [Zdjecie kodu w produktViewHolder](https://imgur.com/a/Vyhfccs)
- 🖼️ Teraz w onBindViewHolder robimy tak [Zdjecie kodu w onBindViewHolder](https://imgur.com/a/CJH3Ubv)
- 📘 W MainActivty dodajemy arraylist zakupyAdapter oraz recyclerView i dodajemy wartosci(POZA ONSTART)(Pamietaj aby pobrac recyclerview)
- ⚛️ Teraz robimy dodawanie nowego elementu (Fragment ktory i tak umiem)[https://imgur.com/a/yolzkjt]
- ✨ Teraz na klikniecie, ale wpierw w ZakupyAdapter dodajemy ``implements View.OnClickListener``(dodajemy to po extends) a nastepnie importujemy metode ``OnClick``
- 👆 W tym [OnClick], trzeba zrobic
---

👑 F4Mythical
