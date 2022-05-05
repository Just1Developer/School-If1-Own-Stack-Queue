/**        
   @description: Our own Queue class which uses the following methods:
   
   // FIFO - First In First Out. Wird im folgenden Beispiel von links nach
        rechts gedrückt, also sieht es anders aus als im Code. Stell dir
        das einfach anders herum vor :)
      
   S.head() liefert: 11     | 3,9,4,2,11
   S.dequeue() liefert: 11  | 3,9,4,2**
   S.enqueue(4) liefert:    | *4*,3,9,4,2
  
  
   Schlange und Stapel haben außerdem noch jeweils eine Methode
   isEmpty(), die angibt, ob der Stapel/die Schlage leer ist (true)
   oder Elemente enthält (false).     

   @author JustOneDeveloper
*/

public class Schlange {

    // Attribute

    /// <summary>
    /// Neuer Array vom Typ int (Typ unserer Schlange),
    /// in welchem wir unsere Werte speichern
    /// </summary>
    private int[] _queue = new int[0];


    // Constructors

    /// <summary>
    /// Erstellt eine neue Schlange
    /// </summary>
    public Schlange() {
    }

    // End Constructors

    // Start Methoden

    /// <summary>
    /// Gibt das erste Element der Schlange zurück,
    /// das, welches als erstes eingefügt wurde.
    /// </summary>
    /// <return> Das erste Element der Schlange vom Typ int </return>
    public int head() /*throws NullPointerException*/ {

        //Eigentlich:
        // Wenn die Schlange leer ist, geben wir einfach das Integer Minimum zurück
        if(isEmpty()) return Integer.MIN_VALUE;
        // Aber: Herr Jandt möchte die Schuler leiden sehen:
        //if(isEmpty()) throw new NullPointerException();

        // Jetzt geben wir einfach den ersten Wert der Schlange zurück
        return _queue[0];
    }

    /// <summary>
    /// Gibt das erste Element der Schlange zurück
    /// und entfernt dieses danach.
    /// </summary>
    /// <return> Das erste Element der Schlange vom Typ int </return>
    public int dequeue() /*throws NullPointerException*/ {

        //Eigentlich:
        // Wenn die Schlange leer ist, geben wir einfach das Integer Minimum zurück
        if(isEmpty()) return Integer.MIN_VALUE;
        // Aber: Herr Jandt möchte die Schuler leiden sehen:
        //if(isEmpty()) throw new NullPointerException();

        // Erst müssen wir uns das Objekt merken, dafür schreiben wir es in eine Variable:
        int remove = _queue[0];

        // Neuen Array erstellen, welches um 1 kleiner ist:
        int[] _newQueue = new int[_queue.length - 1];

        // Alle Elemente mithilfe einer Schleife kopieren,
        // aber nur bis zur Größe der neuen Schlange.
        // Das Machen wir so, dass dabei das erste (0te) Element
        // nicht mitkopiert wird:
        for(int i = 0; i < _newQueue.length; i++) {
          _newQueue[i] = _queue[i + 1];
        }

        // Die alte Schlange mit der neuen überschreiben:
        _queue = _newQueue;

        // Nun geben wir das 0te Element von oben zurück
        return remove;
    }

    /// <summary>
    /// Fügt der Schlange ein neues Element hinzu
    /// </summary>
    /// <param name="element"> Neues Element zum Einfügen </param>
    public void enqueue(int element) {
        // Neuen Array erstellen, welches um 1 größer ist:
        int[] _newQueue = new int[_queue.length + 1];

        // Alle Elemente mithilfe einer Schleife kopieren:
        for(int i = 0; i < _queue.length; i++) {
            _newQueue[i] = _queue[i];
        }

        // Jetzt den neuen Wert hinzufügen
        _newQueue[_queue.length] = element;

        // Die alte Schlange mit der neuen überschreiben:
        _queue = _newQueue;
    }
  
    // Generic Methods

    /// <summary>
    /// Gibt die Größe der Schlange zurück
    /// </summary>
    /// <returns> Größe der Schlange </returns>
    public int size() {
        return _queue.length;
    }

    /// <summary>
    /// Gibt zurück, ob die Länge der Schlange = 0,
    /// also die Schlange leer ist
    /// </summary>
    /// <returns> true wenn die Schlange leer ist, sonst false </returns>
    public boolean isEmpty() {
        return (_queue.length == 0);
    }

    // Ende Methoden
  
}
