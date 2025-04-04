# Homework-5-Solution Proxy and Flyweight Design Patterns
## Proxy Pattern – Image Management System
Problem:
In a real estate website, agents upload high-resolution property images. Loading these images can slow down the website. The system needs to show low-res thumbnails and only load full-resolution images when required.

Solution:
Using the Proxy Pattern, a proxy object displays low-res thumbnails initially, and loads the high-res images only when requested. Additionally, a protection proxy ensures only logged-in agents can upload or replace images.

Benefit:
The Proxy Pattern improves performance by deferring the loading of heavy images and ensures secure access control for image uploads.


## Flyweight Pattern – Map Markers
Problem:
Displaying thousands of map markers for locations like restaurants and gas stations results in memory overhead due to duplicated style data (icon, color, etc.).

Solution:
The Flyweight Pattern is used to share marker styles (like icon and color) across multiple markers, reducing memory usage while still allowing each marker to have unique positions.

Benefit:
The Flyweight Pattern optimizes memory by reusing styles, making the application more efficient, especially with large data sets.

## In both of these cases, the Proxy Pattern and Flyweight Pattern helped simplify the design, improve performance, and reduce resource consumption. These design patterns are essential tools in optimizing complex systems by managing object creation and access in a more efficient manner.
