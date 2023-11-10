/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01_tau_perezjm;

/**
 *
 * @author Jakob
 */
class Main {
  public static void main(String[] args) {
    
    String name1 = "Taylor Swift";
    String song1 = "I Don't Wanna Live Forever";
    long streams1 = 1449520030;
    System.out.println("Artist 1 \nName: " + name1 + "\nBiggest Hit on Spotify: " + song1 + "\nTotal Streams on Spotify: " + streams1 + "\n") ;

  
    String name2 = "ZAYN";
    String song2 = "Dusk Till Dawn";
    long streams2 = 1505962555;
    System.out.println("Artist 2 \nName: " + name2 + "\nBiggest Hit on Spotify: " + song2 + "\nTotal Streams on Spotify: " + streams2 + "\n") ;

    String name3 = "Lola Amour";
    String song3 = "Fallen";
    long streams3 = 88874919;
    System.out.println("Artist 3 \nName: " + name3 + "\nBiggest Hit on Spotify: " + song3 + "\nTotal Streams on Spotify: " + streams3 + "\n") ;

    System.out.println("Total streams of the three songs: " + (streams1 + streams2 + streams3));
    System.out.println("Lola Amours Fallen has more streams than ZAYNs Dusk Till Dawn: " + (streams3 > streams2));
    System.out.println("Taylor Swift and ZAYN have the same song as their most streamed on spotify: " + (song1 == song2));
    
  }
}