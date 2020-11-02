select INPUT__FILE__NAME from movie_reviews;

select regexp_extract(input__file__name, '.*/(\\d+)\_(\\d+)', 1) as id from movie_reviews;

select regexp_extract(input__file__name, '.*/(\\d+)\_(\\d+)', 2) as rating from movie_reviews;
