# VRPhone - Android Notification Listener ( WIP )

## Description
Notification Listener app that redirects notifications to the VRPhone app **(VR)**.

## Development Steps
1. Create Notification Listener Service
	1. Listen to Notifications Posted ✔️
	2. Parse Notification Data ✔️
	3. Send Data ✔️
2. Create VR Service 
	1. Handle Received Data
	2. Show Data to User. 
3. Improve Service 
	* App Improvemets 📱
		* Add Firebase
		* Add switch to disable/enable service on android
		* Add Notification to show that the service is running
		* Handle Permissions
	* Cross Sevice Improvements 🌎
		* Migrate to Kotlin Native ✔️
		* Use P2P For Data Transfer ✔️
		* Organize Imports
		* Clean Code
	* VR Service Improvements 
		* Clean Code
	* General Improvements
		* Refactor to messaging service ( client asks for server for updates )
		* Add Message Reply Feature 
		* Add Call Answer Feature 
