# FilmographyHub

FilmographyHub is a robust Java-based application designed for managing movies and their casts efficiently. With features such as adding, searching, and organizing movie data, CineTrack Pro offers a user-friendly interface to interact with movie databases.

## Features

- **Add and Remove Movies:** Seamlessly manage your movie database by adding or deleting entries.
- **Search by Year:** Retrieve movies based on their release year.
- **Cast Details:** View all actors associated with a specific movie.
- **Actor Information:** Access detailed information about actors, including their name, gender, and age.
- **Search Movies by Actor:** Find all movies in the database that feature a specific actor.

## Project Structure

```plaintext
src/
├── com.sid.client/
│   └── ClientMenu.java        # Handles user interactions
├── com.sid.controller/
│   └── Controllers.java       # Manages logic flow between service and client
├── com.sid.dao/
│   └── MoviesData.java        # Contains the database (mocked data) for movies and actors
├── com.sid.entity/
│   └── Actor.java             # Represents the Actor entity
├── com.sid.service/
│   └── Logic.java             # Core business logic for data retrieval and manipulation

