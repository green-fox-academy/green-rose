SELECT * FROM Movie where director = "Steven Spielberg";
SELECT distinct year from Movie right join Rating ON Movie.mID=Rating.mID where Rating.stars>=4 order by year;
select title, Rating.stars from Movie left join Rating on Movie.mID = Rating.mID having isnull(stars);
select r.name, Rating.ratingDate from Reviewer as r join Rating on r.rID = Rating.rID having isnull(Rating.ratingDate);
SELECT name, title, stars, Rating.ratingDate from Movie left join Rating on Movie.mID = Rating.mID right Join Reviewer on Reviewer.rID = Rating.rID order by name, title, ratingDate;
select  m.title, rev.name from Movie m right join Rating r on m.mID=r.mID left join Reviewer as rev on rev.rID= r.rID join (SELECT rID, mID, max(stars) st, max(ratingDate) rd FROM Rating group by rID,mID HAVING COUNT(*) > 1) as u where u.rId = r.rId and u.mID=r.mID and r.stars = st and r.ratingDate=rd;