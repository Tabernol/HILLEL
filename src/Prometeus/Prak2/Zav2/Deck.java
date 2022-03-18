package Prometeus.Prak2.Zav2;

import java.util.Arrays;

public class Deck {
    Card[] myDeck = new Card[36];
    int countCard =36;

    public void makeMyDeck() {
        int y = 0;
        for (int i = 0; i < 4; i++) {
            Suit indexOfSuit = Suit.values[i];
            for (int j = 0; j < 9; j++) {
                Rank indexOfRank = Rank.values[j];
                Card myCard = new Card();
                myCard.setSuit(indexOfSuit);
                myCard.setRank(indexOfRank);
                myDeck[y] = myCard;
                y++;
            }
        }
    }

    public void showDeck() {
        for (int i = 0; i < 36; i++) {
            System.out.println(i + " " + myDeck[i]);
        }
    }


    //Перемішує колоду у випадковому порядку
    public Card[] shuffle() {
        int[] array = new int[36];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (array.length));
            for (int j = i; j > 0; j--) {
                if (array[i] == array[j - 1]) {
                    i--;
                }
            }
        }
        Card[] deck = new Card[36];
        for (int i = 0; i < 36; i++) {
            deck[i] = myDeck[array[i]];
        }
        return myDeck = deck ;
    }


    public Card[] deckSort() {
        Card[] deck = new Card[myDeck.length];
        int count = 0;
        for (int i = 0; i < Suit.values.length; i++) {
            Card[] suitCards = suitSort(myDeck, Suit.values[i]);
            Card[] bubleSort = bubleSort(suitCards);
            for (Card cards: bubleSort) {
                deck[count] = cards;
                count++;
            }
        }
        myDeck = deck;
        return myDeck;
    }

    private Card[] suitSort(Card[] cards, Suit suit){
        Card[] suitCards = new Card[9];
        int count = 0;
        for (Card card: cards) {
            if(card.getSuit().getName().equals(suit.getName())){
                suitCards[count] = card;
                count++;
            }
        }
        return suitCards;
    }

    private Card[] bubleSort(Card[] cards){
        int n = cards.length;
        Card temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(cards[j-1].getRank().getRanck() > cards[j].getRank().getRanck()){
                    //swap elements
                    temp = cards[j-1];
                    cards[j-1] = cards[j];
                    cards[j] = temp;
                }

            }
        }
        return cards;
    }





    /* * Впорядкування колоди за мастями та значеннями
     * Порядок сотрування:
     * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
     * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
     * Наприклад
     * HEARTS Ace
     * HEARTS King
     * HEARTS Queen
     * HEARTS Jack
     * HEARTS 10
     * HEARTS 9
     * HEARTS 8
     * HEARTS 7
     * HEARTS 6
     * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {

    }

    //Повертає true у випадку коли в колоді ще доступні карти
     public boolean hasNext() {
        boolean b = true;
        if(countCard<0){
            b = false;
        }
        return  b;
      }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        --countCard;
        if(countCard<0){
          return null;
        }
   return myDeck[countCard];
    }

}
