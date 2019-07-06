package com.company.Lesson7.Hero;

    public enum Rivals implements Desribe{
        HUMAN {
            @Override
            public String getDescription() {
                return "Human";
            }
        },
            ELF {
            @Override
                public String getDescription(){
                    return "Elf";
                }
            },
            DWARF {
                @Override
                public String getDescription() {
                    return "DWARF";
                }
            }
    }


