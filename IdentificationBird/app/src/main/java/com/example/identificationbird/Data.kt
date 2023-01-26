package com.example.identificationbird



object Data {
    private val birdName = arrayOf(
        "CROWNED PIGEON",
        "EUROPEAN TURTLE DOVE",
        "MOURNING DOVE",
        "NICOBAR PIGEON",
        "ROCK DOVE",
        "ROSY FACED LOVEBIRD",
        "ROSY FACED LOVEBIRD",
        "VICTORIA CROWNED PIGEON"
    )

    private val descriptionBird = arrayOf(
        "penjelasan 1",
        "penjelasan 2",
        "penjelasan 3",
        "penjelasan 4",
        "penjelasan 5",
        "penjelasan 6",
        "penjelasan 7",
        "penjelasan 8",
    )

    private val birdFamily = arrayOf(
        "Columbidae",
        "Columbidae",
        "Columbidae",
        "Columbidae",
        "Columbidae",
        "Psittaculidae",
        "Psittaculidae",
        "Columbidae",
    )

    private val birdOrdo = arrayOf(
        "Columbidae",
        "Columbidae",
        "Columbidae",
        "Columbidae",
        "Columbidae",
        "Psittaculidae",
        "Psittaculidae",
        "Columbidae",
    )

    private val birdHabitat = arrayOf(
        "Asia",
        "Asia",
        "Europe",
        "Europe",
        "Europe",
        "Europe",
        "Africa",
        "Africa"
    )


    private val latinBirdName = arrayOf(
        "Columba cristata",
        "Streptopelia turtur",
        "Zenaida macroura",
        "Caloenas nicobarica",
        "Columba livia",
        "Agapornis roseicollis",
        "Agapornis roseicollis",
        "Goura victoria"
    )
    private val birdFood = arrayOf(
        "Biji Bijian",
        "Biji Bijian",
        "Biji Bijian",
        "Biji Bijian",
        "Biji Bijian",
        "Biji Bijian",
        "Biji Bijian",
        "Biji Bijian",
    )

    val listData: ArrayList<Model>
        get() {
            val list = arrayListOf<Model>()
            for (position in birdName.indices) {
                val bird = Model()
                bird.nama = birdName[position]
                bird.desc = descriptionBird[position]
                bird.latin = latinBirdName[position]
                bird.family = birdFamily[position]
                bird.ordo = birdOrdo[position]
                bird.habitat = birdHabitat[position]
                bird.makanan = birdFood[position]
                list.add(bird)
            }

            return list
        }
}