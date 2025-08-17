# Weather Application

A Spring Boot REST API application that provides weather information and forecasts. This application serves as a backend service for retrieving current weather conditions and multi-day forecasts for any location.

## Tech Stack

- **Java 21** - Modern Java with latest features
- **Spring Boot 3.5.4** - Main application framework
- **Maven** - Build tool and dependency management
- **Lombok** - Reduces boilerplate code
- **Spring Boot Starter Web** - REST API capabilities
- **JUnit** - Testing framework

## Project Structure

\`\`\`
src/main/java/com/myfirstwebapp/weather/
├── Controller/
│   └── WeatherController.java      # REST API endpoints
├── Service/
│   └── WeatherService.java         # Business logic layer
├── Model/
│   ├── WeatherDetail.java          # Weather data entity
│   └── WeatherForecast.java        # Forecast data entity
├── DTO/
│   ├── Root.java                   # Main response wrapper
│   ├── Current.java                # Current weather data
│   ├── Forecast.java               # Forecast container
│   ├── Forecastday.java            # Daily forecast data
│   ├── Location.java               # Location information
│   ├── Condition.java              # Weather condition details
│   ├── Day.java                    # Daily weather summary
│   ├── Hour.java                   # Hourly weather data
│   └── Astro.java                  # Astronomical data
└── WeatherApplication.java         # Main Spring Boot application
\`\`\`

## Prerequisites

- Java 21 or higher
- Maven 3.6+ (or use the included Maven wrapper)

## Installation & Setup

1. **Clone the repository**
   \`\`\`bash
   git clone <repository-url>
   cd weather-application
   \`\`\`

2. **Build the project**
   \`\`\`bash
   ./mvnw clean install
   \`\`\`
   
   Or on Windows:
   \`\`\`cmd
   mvnw.cmd clean install
   \`\`\`

3. **Run the application**
   \`\`\`bash
   ./mvnw spring-boot:run
   \`\`\`
   
   Or on Windows:
   \`\`\`cmd
   mvnw.cmd spring-boot:run
   \`\`\`

The application will start on `http://localhost:8080`

## API Endpoints

### Get Current Weather
```http
GET /api/weather/current?location={city}
