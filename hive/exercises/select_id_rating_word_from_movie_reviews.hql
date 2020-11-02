select regexp_extract(input__file__name, '.*/(\\d+)\_(\\d+)', 1) as id, regexp_extract(input__file__name, '.*/(\\d+)\_(\\d+)', 2) as rating, word from movie_reviews lateral view explode(split(text, '\\s+')) words as word;