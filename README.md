
# ProMUT Indicator Repository

The ProMUT Indicator Repository is a Linked Open Data (LOD) set to integrate various indicator-based sustainability assessment “tools” through introducing an organizational sustainability dimension along with topical clustering.

It is collaborative research & development effort to tackle address a set of research gaps. The initial idea for this repository was developed as a contribution to the [EnvirInfo 2019](https://enviroinfo2019.org/) workshop on the [Future of Environmental Informatics Research from the Perspective of Young Researchers](https://enviroinfo2019.org/workshops/#track3).

## ProMUT Content Criteria

Designated contents of the ProMUT Indicator Repository are indicator sets which embrace the legal aspects of this repository and meet the following four criteria:

1. Applicable for assessing the sustainability of manufacturing organizations.
1. Published accessibly in some form of document and with a complete description of all indicators.
1. Content imposes no legal restrictions which are in conflict with the principles of LOD, in particular allowing the contents redistribution.
1. 

The following _Indicator Sets_ are currently analyzed in depth and transformed into LOD to be included in the repository:

* [OECD Sustainable Manufacturing Toolkit](https://www.oecd.org/innovation/green/toolkit/oecdsustainablemanufacturingindicators.htm) (2011)

## Linked Open Data

Linked Open Data is open data that uses the Linked Data Principles ([Berners-Lee, 2006](https://www.w3.org/DesignIssues/LinkedData.html)):

1. Use URIs as names for things
1. Use HTTP URIs so that people can look up those names
1. When someone looks up a URI, provide useful information, using the standards (RDF, SPARQL)
1. Include links to other URIs, so that they can discover more things

Q: Is your Linked Open Data 5 Star?<br/>
A: TBD.

Q: What is your understanding of Open Data?<br/>
A: TBD.

## Organizational Aspects

"_Adoption of Linked Open Data is not just a question of technology._ analyzed a set of existing LOD life cycle models wich show that a set of processes must be in place in order for LOD publications to be possible and sustainable over time. From the organizational point of view responsibilities for these processes should be defined and therefore we introduced a model of LOD stakeholder roles." (p.24, [Kučera et al, 2013](https://www.tib.eu/en/search/id/tema%3ATEMA20170113382/Linked-open-data-stakeholder-roles/))

### Stakeholder Roles

Following Kučera et al ([2013](https://www.tib.eu/en/search/id/tema%3ATEMA20170113382/Linked-open-data-stakeholder-roles/)) one can assume some or all of the following organizational responsibilities to be involved in the application of Linked Open Data.

* LOD Evangelist, Domain Expert, Ontology/Designer, Data Owner, Legal Expert
* Data Curator, LD Transformer, Data Linker, LD Publisher, LD Verifier
* Catalog Owner, Catalog Editor, Catalog Publisher
* LD User

### LOD Life Cycles

After analyzing several models of LOD life cycles Kučera et al ([2013](https://www.tib.eu/en/search/id/tema%3ATEMA20170113382/Linked-open-data-stakeholder-roles/)) came up with the following activity names associated with LOD application: 

Raising LOD awareness, Data identification/selection, Data modeling and ontology design, URI design, Extraction/Conversion, Storage, Authoring, Data Quality Assurance, Interlinking, Enrichment, Licensing, Verification, Metadata creation, Publication, Cataloging, Cataloging standardization, Metadata quality assurance, Catalog records publication, Data maintenance, Metadata maintenance, Exploitation

## Technological Aspects

I am currently in search for a RDF Store and SPARQL Server to start with and publish the repository. As all RDF stores are interoperable there is no need to fixate on one specific solution.

_In contrast to a relational data store, an RDF storue includes a fundamental capability, the ability to merge two datasets together. Any resources with the same URI are considered to be equivalent in the merged data set._ (Allemang and Hendler, 2011)

### Current Candidates

* Python RDFLib (https://rdflib.readthedocs.io/en/stable/) + Berkeley DB (https://www.oracle.com/database/technologies/related/berkeleydb-downloads.html) or AllegroGraph(https://franz.com/agraph/support/documentation/current/python/tutorial/example001.html)
* Eclpise RDF4J (https://rdf4j.eclipse.org)
* Apache Jena TDB2 (https://jena.apache.org/documentation/tdb2/ + Fuseki2 (https://jena.apache.org/documentation/fuseki2/)
* Apache Rya (http://rya.apache.org/documentation/) + Apache Accumulo(https://accumulo.apache.org/)

### Preferred Syntax

Currently the ProMUT Indicator Repository Model is solely written RDF/XML style.

## Legal Aspects

TBD.

# Version History

**0.2**, UPCOMING

* Initial write up of the repository model as an RDF Schema / OWL Document

# Acknowledgement

The [Junior Research Group “ProMUT”](https://purl.org/promut) (grant number: 01UU1705A) is funded by the German Federal Ministry of Education and Research as part of its funding initiative “[Social-Ecological Research](https://twitter.com/soef_BMBF)“).

# License

The ProMUT Indicator Repository Model is available freely under the GNU Affero General Public License, version 3.

Whereever third party content is incorporated in the ProMUT Indicator Repository it is licensed under the original license provided by the owner of the applicable content. Third party content in the repository are the respective _Indicator Sets_.

# Copyright

Copyright (C) 2019 Malte Reißig
