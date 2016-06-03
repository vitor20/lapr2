/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo.model;

/**
 *
 * @author Afonso S
 */
public class Security {

    private Utilizador pass;
    private static final char alfabeto[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
        'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private final int shift = (int) Math.random();
    String pw = pass.getPassword();
    protected char[] coded = new char[alfabeto.length];
    protected char[] decoded = new char[alfabeto.length];

    public int Security(String pass) {
        for (int i = 0; i < alfabeto.length; i++) {
            coded[i] = alfabeto[(i + shift) % alfabeto.length];
        }
        for (int i = 0; i < alfabeto.length; i++) {
            decoded[coded[i] - 'A'] = alfabeto[i];
        }
        return 0;
    }
}
