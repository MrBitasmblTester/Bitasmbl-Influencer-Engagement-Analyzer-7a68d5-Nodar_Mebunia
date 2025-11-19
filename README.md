# Bitasmbl-Influencer-Engagement-Analyzer-7a68d5-Nodar_Mebunia

## Description
Build a platform that analyzes social media influencer performance by aggregating engagement metrics such as likes, comments, follower growth, and post frequency. The system provides insights, comparisons, and visual summaries to help users evaluate influencer impact and trends.

## Tech Stack
- Objective-C
- Spring
- Chart.js

## Requirements
- Handle missing, inconsistent, or rate-limited API data
- Calculate engagement rates, trends, and performance indicators
- Fetch influencer data from social media APIs or datasets
- Display insights using charts, comparisons, and intuitive visuals
- Allow users to search, filter, and compare influencers

## Installation
Follow these step-by-step setup instructions for the listed tech stacks.

1. Clone the repository

   git clone https://github.com/MrBitasmblTester/Bitasmbl-Influencer-Engagement-Analyzer-7a68d5-Nodar_Mebunia.git
   cd Bitasmbl-Influencer-Engagement-Analyzer-7a68d5-Nodar_Mebunia

2. Backend (Spring)

   - Navigate to the Spring project root (the directory containing the Spring Boot pom.xml).
   - Install and build with Maven:

     mvn clean install

   - Run the application locally:

     mvn spring-boot:run

   - Alternatively, build the JAR and run:

     mvn clean package
     java -jar target/*.jar

3. Frontend visuals (Chart.js)

   - If a frontend directory with a package.json is provided, navigate to it and install Chart.js:

     cd frontend
     npm install chart.js

   - If using static HTML pages that include Chart.js via npm, build or serve the static files from the frontend directory or let Spring serve them from static resources.

   - You may also use Chart.js via CDN in an HTML file if no npm-based frontend is present.

4. Objective-C client (iOS/macOS)

   - Open the Objective-C project in Xcode. Example:

     open path/to/YourProject.xcodeproj

   - Build and run in the simulator or on a device using Xcode.

   - To build from the command line (example):

     xcodebuild -project YourProject.xcodeproj -scheme YourScheme -sdk iphonesimulator -destination 'platform=iOS Simulator,name=iPhone 14' build

5. Environment variables (API keys and runtime settings)

   - The Spring backend that fetches data from social media APIs typically requires API credentials and runtime configuration. Set environment variables before running the backend.

     export SOCIAL_API_KEY="your_api_key"
     export SOCIAL_API_SECRET="your_api_secret"
     export SPRING_PORT=8080

   - On Windows (PowerShell):

     $env:SOCIAL_API_KEY = "your_api_key"
     $env:SOCIAL_API_SECRET = "your_api_secret"
     $env:SPRING_PORT = "8080"

   - Adjust variables according to your deployment and secrets management practice.

## Usage
- Start the Spring backend (from the Spring project root):

  mvn spring-boot:run

  or

  java -jar target/*.jar

- Serve or open the frontend that uses Chart.js:
  - If frontend is a static HTML/JS site, open index.html in a browser or serve the folder with a static server.
  - If frontend lives in the Spring static resources folder, access the app via http://localhost:8080 and the charts will render using Chart.js.

- Run the Objective-C client in Xcode to view native UI that queries the backend for influencer insights and displays comparisons.

- Use the search, filter, and compare UI in either the frontend or Objective-C client to query the backend endpoints for influencer data and metrics.

## Implementation Steps
1. Initialize the Spring Boot project (if not already present) and configure application properties to read environment variables for API credentials and ports.
2. Implement an HTTP client component in the Spring backend to fetch influencer data from social media APIs or provided datasets. Ensure the client supports configurable timeouts and retry behavior.
3. Implement rate-limit handling: detect rate-limit responses, perform exponential backoff and retry, and surface rate-limit status to the caller.
4. Normalize incoming data: create DTOs to map likes, comments, follower counts, post timestamps, and other fields; implement logic to handle missing or inconsistent fields with defaults or null-safe handling.
5. Implement data processing services in Spring to calculate engagement rates (e.g., (likes + comments) / followers), trends (time-series deltas), and performance indicators derived from the normalized data.
6. Expose REST API endpoints in the Spring backend for searching, filtering, fetching individual influencer metrics, and comparing influencers (see API Endpoints section).
7. Add caching or short-term in-memory storage for fetched and computed metrics to reduce API calls to rate-limited external services.
8. Build frontend visualizations using Chart.js:
   - Create data adapters that consume the backend API responses and transform them into Chart.js datasets.
   - Implement chart types for trends, distribution, and comparative metrics (line charts for growth, bar charts for comparisons, etc.).
9. Implement search, filter, and compare UI flows in either the web frontend or the Objective-C client:
   - Search and filter should call backend endpoints with query parameters.
   - Compare should aggregate multiple influencer metrics and render side-by-side charts.
10. In the Objective-C client, implement networking code to call the Spring backend APIs, parse JSON responses, and present results within native views. Integrate web views or native charting that uses chart data generated by Chart.js if mixing web and native UI.
11. Add logging and error handling across backend and client to surface missing data, API inconsistencies, and rate-limit events to users or admin logs.
12. Test end-to-end with representative datasets and simulate API rate limits and missing fields to verify robustness.

## API Endpoints
- Endpoint: /api/influencers
  Method: GET
  Description: Search and list influencers. Supports query parameters for search, filters, pagination.

- Endpoint: /api/influencers/{id}
  Method: GET
  Description: Retrieve detailed metrics and recent activity for a single influencer.

- Endpoint: /api/compare
  Method: POST
  Description: Compare multiple influencers. Accepts a JSON body with a list of influencer IDs and returns comparative metrics and time-series suitable for charting.

- Endpoint: /api/metrics/fetch
  Method: POST
  Description: Trigger a fetch/refresh of influencer data from external social APIs or datasets for one or more influencers. Useful for manual refresh or background jobs.

- Endpoint: /api/health
  Method: GET
  Description: Basic health check for the backend service.