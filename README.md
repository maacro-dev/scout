# Scout

**The mobile application component of Hum-i**: A mobile-first field data collection tool for the Sentinel system, designed to support real-time agricultural data acquisition for rice cultivation.

📱 *Built for use by agricultural field agents, extension workers, and researchers operating in rural and low-connectivity environments.*

## Overview

The Sentinel Mobile App is designed to streamline the collection of rice cultivation data directly from the field. Integrated tightly with the Sentinel web platform, it enables users to gather, store, and sync critical information from remote locations, supporting the broader goal of end-to-end data-driven agriculture.

### Key Features:

* **Offline Data Collection**
  Fully functional offline mode for capturing field and farmer data in areas with limited or no connectivity. Data syncs automatically when a connection is available.

* **Form-Based Entry**
  Dynamic forms tailored to crop stages, location, and project type. Supports image capture, GPS tagging, and barcode scanning.

* **Farmer & Field Registration**
  Quickly register new farmers and fields with demographic, geographic, and agricultural details.

* **Data Validation On-the-Go**
  Built-in rules for field completeness, GPS range checks, and required data elements to minimize errors during entry.

* **Crop Monitoring**
  Collect observations by growth stage, including pest/disease incidents, field conditions, input usage, and weather events.

* **Media Capture**
  Attach geotagged photos, voice notes, and handwritten notes to each data submission for richer context.

* **Automatic Sync & Backup**
  Background syncing to the Sentinel web platform when network conditions allow, with local backup for fail-safe operation.

## Getting Started

To install and configure the mobile app, see the [Mobile Setup Guide](./docs/mobile-setup.md). This includes supported Android versions, permissions, syncing policies, and user provisioning steps.

## Usage Notes

* Field agents should sync regularly when in coverage to avoid data backlog.
* Field agents should sync regularly when in coverage to refresh local user data
* Field agents should sync regularly when in coverage to refresh form completion scores
* Supervisors can track submissions and flag entries for follow-up via the web dashboard.

## Integration

Data collected through the mobile app is automatically funneled into the Sentinel web application for analysis, verification, and reporting.

## License

This application is **proprietary and confidential**, intended solely for authorized field personnel of affiliated agricultural organizations.

All rights reserved © 2025 Humay.