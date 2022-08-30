// use an integer for version numbers
version = 3


cloudstream {
    language = "en"
    // All of these properties are optional, you can safely remove them

    description = "Uses TMDB"
    authors = listOf("Blatzar")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 0 // will be 3 if unspecified
    tvTypes = listOf(
        "TvSeries",
        "Movie",
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=olgply.com&sz=%size%"
}
