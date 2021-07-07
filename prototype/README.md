
# ProMUT Non-Financial Indicator Sets

A DMX plugin for collaborative authoring of _skos:semanticRelations_ between sustainability `Indicators`. Additionally, `Indicator Categories`, `Sustainability Dimensions` and `System Assessment Level` provide an integrative reference frame. 

The application model for this indicator catalog follows the conceptualization of an "ontology for sustainability indicator sets (OSIS), for representing information about sustainability indicator systems" as reported and tested as "Design A" in the paper by Ghahremanloo, Thom and Magee (2012): "An Ontology Derived from Heterogeneous Sustainability Indicator Set Documents" ([DOI](https://dl.acm.org/doi/abs/10.1145/2407085.2407095)).

This design is favourable when dynamically adding new indicator sets is more important then the precise modeling of individual indicator sets. However, through introducing _Indicator Categories_, we allow each _Indicator Set_ to basically import and maintain their resp. set of categories, while at the same time integrating their indicator definitions via the System Assessment Levels, Sustainability Dimensions and Indicator Types.

## Dependencies

- DMX CSV Plugin 1.1.3+ (Sources, Binary)
- DMX Platform 5.2 (Sources, Binary)

## Issues

Issues for this repositories are tracked at its public mirror at [github.com](https://github.com/mukil/pmic) for world wide read/write access.

## Release History

**0.4.0**, Upcoming

*  Breaking Model Changes:<br/>
   _System_ renamed to _System Assessment Level_
   _Indicator_ integrating _System Assessment Level_ entities as direct children now (instead of _System Name_)
   _Indicator_ integrating _Sustainability Dimension_ entities as direct children now (instead of _Dimension Name_)
*  Added _Supply Chain_ and _Building_ as new system assessment levels
*  Compatible with DMX 5.2
*  Revised description of system assessment level instances

**0.3.0**, 30.06.2020

*  Introduced the "ProMUT Indicator Sets" workspace (Default Sharing Mode: _Public_)
*  Moved all top-level topic types into the "ProMUT Indicator Sets" workspace 
*  Introduces Application Model:<br/>
   Topic Types: _Indicator_, _Indicator Set_, _System_, _Sustainability Dimension_<br/>
   Assoc Types: _Exact Match_, _Close Match_, _Narrow Match_, _Related Match_, _Defines_, _Categorizes_<br/>
*  Compatible with DMX 5.0-beta-7

## Author

Copyright (C) Malte Reißig, 2020

## Acknowledgement

This work is funded by the German Federal Ministry of Education and Research as part of its funding initiative “Social-Ecological Research“ and the Junior Research Group “ProMUT” (grant number: 01UU1705A).
