/**        
   @description: Our own Stack class which uses the following methods:
   
  * Sichtbar ist nur das oberste Element .peek(); (Herr Jandt: .top();)
  * Das oberste element kann entfernt werden ( .pop(); returns and removes the
    top element;
  * Es kann ein element hinzugefügt werden ( .push(e); erg�nzt den Stapel um ein
    Element
    
 * Also: S.pop(), S.top()/S.peek() und S.push(e);      

   @author JustOneDeveloper
*/

public class Stapel {

  // Attribute

  /// <summary>
  /// Neuer Array vom Typ int,
  /// in welchem wir unsere Werte speichern
  /// </summary>
  private int[] _stack = new int[0];

  // Start Constructors

  /// <summary>
  /// Erstellt einen neuen Stapel
  /// </summary>
  public Stapel() {
  }

  // Ende Constructors

  // Start Methoden

  /// <summary>
  /// Gibt das erste Element des Stapels zurück,
  /// das, welches als erstes eingefügt wurde.
  /// </summary>
  /// <returns> Das oberste Element des Stapels vom Typ int </returns>
  public int top() /*throws NullPointerException*/ {

    //Eigentlich:
    // Wenn der Stapel leer ist, geben wir einfach das Integer Minimum zurück
    if(isEmpty()) return Integer.MIN_VALUE;
    // Aber: Herr Jandt möchte die Schuler leiden sehen:
    //if(isEmpty()) throw new NullPointerException();

    // Gib das letzte Element zurück
    return _stack[_stack.length - 1];
  }

  /// <summary>
  /// Gibt das erste Element des Stapels zurück
  /// und entfernt dieses danach.
  /// </summary>
  /// <returns> Das oberste Element des Stapels vom Typ int </returns>
  public int pop() /*throws NullPointerException*/ {

    //Eigentlich:
    // Wenn der Stapel leer ist, geben wir einfach das Integer Minimum zurück
    if(isEmpty()) return Integer.MIN_VALUE;
    // Aber: Herr Jandt möchte die Schuler leiden sehen:
    //if(isEmpty()) throw new NullPointerException();

    //Das letzte Element vormerken
    int delete = _stack[_stack.length - 1];

    //Neuen Array erstellen, der um 1 kleiner ist:
    int[] _newStapel = new int[_stack.length - 1];

    //Mithilfe einer Schleife alle Werte bis auf den letzten kopieren:
    for(int i = 0; i < _newStapel.length; i++) {
      _newStapel[i] = _stack[i];
    }

    // Den alten Stapel-Array überschreiben:
    _stack = _newStapel;

    // Jetzt noch das vorgemerkte Element zurückgeben
    return delete;
  }

  /// <summary>
  /// Fügt dem Stapel ein neues Element hinzu
  /// </summary>
  /// <param name="element"> Neues Element zum Einfügen </param>
  public void push(int element) {

    //Neuen Array erstellen, der um 1 größer ist:
    int[] _newStapel = new int[_stack.length + 1];

    //Mithilfe einer Schleife alle Werte des alten Stapels übernehmen:
    for(int i = 0; i < _stack.length; i++) {
      _newStapel[i] = _stack[i];
    }

    // Den neuen Wert hinzufügen:
    _newStapel[_stack.length] = element;

    // Den alten Stapel-Array überschreiben:
    _stack = _newStapel;
  }

  // Generic Methods

  /// <summary>
  /// Gibt die Größe des Stapels zurück
  /// </summary>
  /// <returns> Größe des Stapels </returns>
  public int size() {
    return _stack.length;
  }

  /// <summary>
  /// Gibt zurück, ob die Länge des Stapels = 0,
  /// also der Stapel leer ist
  /// </summary>
  /// <returns> true wenn der Stapel leer ist, sonst false </returns>
  public boolean isEmpty() {
    return (_stack.length == 0);
  }


  // Ende Methoden

}
