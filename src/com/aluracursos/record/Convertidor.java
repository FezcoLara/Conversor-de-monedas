package com.aluracursos.record;

public record Convertidor(String base_code,
                          String target_code,
                          Double conversion_rate,
                          Double conversion_result) {
}