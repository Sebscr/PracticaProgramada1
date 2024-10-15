/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada1;

/**
 *
 * @author sebas
 */
public class PilaP {
    private NodoP cima;

    public PilaP() {
        this.cima = null;
    }

    // Método para apilar un nuevo elemento de tipo DatoC
    public void apilar(DatoC dato) {
        NodoP nodo = new NodoP(dato, cima); // Crea un nuevo nodo con el dato proporcionado
        cima = nodo; // Actualiza la cima a este nuevo nodo
    }

    public void desapilar() {
        if (cima != null) {
            NodoP elementoExtraido = cima; // Guarda el nodo actual de la cima
            cima = cima.getSiguiente(); // La cima ahora apunta al siguiente nodo
            elementoExtraido.setSiguiente(null); // Limpia la referencia
        } else {
            System.out.println("La pila está vacía.");
        }
    }

    public void imprimirPila() {
        StringBuilder texto = new StringBuilder();

        if (cima != null) {
            NodoP aux = cima;
            while (aux != null) {
                texto.append(aux.getElemento().getPalabra()).append("\n"); // Llama a getPalabra()
                aux = aux.getSiguiente();
            }
        }
        System.out.println(texto.toString());
    }
}



