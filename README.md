# iamacitizen

Vision

Free app for use in mass by the middle class of a developing country with reality similar to Brazil. The country's reality: lackluster reality of public services provided by municipal, state and federal agencies in several areas, namely education, health, transportation, security, sanitation, among others. Quality supervision of lack of services provided by private companies, namely telecommunications, transport, health plans, among others.

Features:

1. Broadcast ads categorized by area (education, health, security, etc.), type of provider agency (public, private), provider agency itself.

2. Creation of mobilizing chains with specific objective (improving health in the municipality of Aracaju).

3. Comparison reality of the country concerned with countries in which the provision of public and private services to be better or considered an example for other countries.

4. Ranking of countries, states and cities according to the quality of performance by area.

Architecture:

1. Mobile App native Restfull on Android and IOs, using Ajax for asynchronous communication, JSON for data transfer.

2. Java application server will have a facade to communicator with customers and delegate to the data access layer.

3. The database server will use NoSQL database.

4. The distribution of data will be done through the distribution paradigm Map Reduce.

5. There will be projects maven iamacitezen-service, iamacitizen-core, iamacitizen-web, iamacitezen-android, ios-iamacitizen

User Stories

User Story 1: Broadcast Ads

Who: active citizen of my country.

For what purpose: receive announcements about quality and other characteristics of services by country, state, city, area, type of agency, provider agency itself and amount of disclaimers.

Objective: so you can be aware of reality and advocacy currents.

Acceptance criteria:

1. By clicking on the ads receive, the following optional information should be requested: country, state, city, service area, type of agency, provider agency, most repudiated (top 10, top 100, top 1000).

2. Clicking on the List button ads, the ads will appear paged form according to the information provided.

3. Each ad will have the following information: Ad Title, Description Brief, disclaimers Quantity. In addition to the other information that appear only when a click is given in a specific ad.

User Story 2: View Advertisement

Who: active citizen of my country.

For what purpose: View the details of a specific ad: country, state, city, area, type of agency, provider agency itself and amount of disclaimers.

Objective: so you can be aware of the reality, create mobilization currents, share the ad for my citizens and repudiate the ad.

Acceptance criteria:

1. By clicking on the View Announcement button, the following information should be displayed: country, state, city, service area, type of agency, provider agency, amount of disclaimers.

User Story 3: Share Ad

Who: active citizen of my country.

For what purpose: Share the announcement for the citizens of my list of citizens who have registered.

Objective: so I can share the knowledge of reality with my citizens.

Acceptance criteria:

1. Clicking the Share button ad, the specific ad will be shared on the timeline (home) of my citizens.

User Story 4: repudiate Ad

Who: active citizen of my country.

For what purpose: To reject a specific advertisement for my citizens aware of my disgust and the ad itself.

Objective: that my citizens are aware of the announcement and my repudiation.

Acceptance criteria:

1. Clicking the button repudiate announcement, the number of disclaimers to ad will be incremented by one and the announcement will be in the public timeline (home) of my provider cidadão.órgão, number of disclaimers.

User Story 5: Create Mobilization Current

Who: active citizen of my country.

For what purpose: create a mobilization chain with a very specific goal.

Objective: so you can mobilize the greatest number of citizens to mobilize current in order to improve an aspect of any service provided by a public or private institution.

Acceptance criteria:

1. By clicking on Create Mobilization Current button, the following information must be requested: country, state, city, service area, type of agency, provider organ goal.

2. When filling out the information and click the OK button, the current mobilization will be created and published on the timeline (home) of my citizens.

User Story 6: Service Delivery Ranking

Who: active citizen of my country.

For what purpose: View the ranking of the worst service providers in accordance with the number of disclaimers. Being able to provide the following information: country, state, city, 
area, type of organ.

Objective: To be aware of the worst service providers.

Acceptance criteria:

1. By clicking on Service Delivery Ranking button, the following optional information is requested: country, state, city, service area, type of organ.

2. Clicking the View Top button, the ranking will be displayed according to the information provided.
