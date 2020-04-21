package br.com.Codenation;

public class ArrayList {

        Fibonacci[] fibonacci;
        int contador = 0;

        public ArrayTarefas(int tamanho) {
            tarefas = new Tarefa[tamanho];
        }

        public void adicionar(Tarefa tarefa) {
            tarefas[contador] = tarefa;
            contador++;
        }

        public void removerTarefa(int posicao) {
            tarefas[posicao] = null;
        }

        public void exibirTarefas() {
            for (Tarefa tarefa : tarefas) {
                tarefa.exibirTarefa();

            }
        }
    }
}
