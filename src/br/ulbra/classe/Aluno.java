
package br.ulbra.classe;

import javax.swing.JOptionPane;

/** @author s.lucas
 * Assunto: Vetor;
 */

public class Aluno {
    private String nome;
    private double notas[];
    
    public Aluno(){
        notas = new double[3];
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas(int i) {
        return notas[i];
    }

    public void setNotas(double nota, int i) {
        this.notas[i] = nota;
    }
    public int getSize(){
        return notas.length;
    }
    public double calcularMedia(){
        double ac = 0;
        int i;
        for (i = 0; i < getSize(); i++){
            ac = ac + notas[i];
        }
        ac = ac/i;
        return ac;
    }
    public String toString(){
        String resposta = "";
        resposta = "B O L E T I M \n";
        resposta += "====================\n"
                + "Nome: " + getNome();
        
        String boletim = "";
        for (int i=0; i<getSize(); i++){
            boletim += "\nNota" + (i+1) + ": " + getNotas(i);
        }
        
        resposta += boletim +"\n====================\n"
                +"Média: " + calcularMedia();
        return resposta;  
    }
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        
        aluno.setNome(JOptionPane.showInputDialog("Nome: "));
        
        for (int i = 0; i < aluno.getSize(); i++){
            aluno.setNotas(Double.parseDouble(
                    JOptionPane.showInputDialog("Nota: ")), i);
        }
        
        JOptionPane.showMessageDialog(null, aluno.toString());
       
    }
}
