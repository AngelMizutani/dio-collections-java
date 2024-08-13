package map.Ordenacao.exercicioEventos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventoMap;

    public AgendaEventos() {
        this.agendaEventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        if (!agendaEventoMap.isEmpty()) {
            Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventoMap); //ordeno os eventos para procurar o mais próximo
            for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
                if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                    System.out.println("Próximo evento: " + entry.getValue() + "; data: " + entry.getKey());
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.parse("2024-08-20"), "Lollapalloza", "Bon Jovi");
        agendaEventos.adicionarEvento(LocalDate.parse("2024-08-15"), "Rock in Rio", "Nickelback");
        agendaEventos.adicionarEvento(LocalDate.parse("2024-08-01"), "Show da Avril", "Avril Lavigne");
        agendaEventos.adicionarEvento(LocalDate.parse("2024-09-07"), "The Pink Tour", "P!nk");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
