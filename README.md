
# ProMUT Manufacturing Indicator Catalog

The ProMUT Manufacturing Indicator Catalog is a Linked Open Data (LOD) set to integrate and relate indicators across various sustainability assessment “tools” through introducing common reference frames and relational semantics.

It is collaborative research & development effort to adress a set of research gaps. The initial idea for this repository was developed as a contribution to the [EnvirInfo 2019](https://enviroinfo2019.org/) workshop on the [Future of Environmental Informatics Research from the Perspective of Young Researchers](https://enviroinfo2019.org/workshops/#track3).

## Content Selection Criteria

Designated contents of the ProMUT Indicator Repository are indicator sets which embrace the legal aspects of this repository and meet the following four criteria:

1. Contains indicators applicable for assessing the sustainability of manufacturing processes or manufactured products.
1. Published accessibly in some form of document and with a complete description of all indicators (or the will to do so here).
1. Content imposes no legal restrictions conflicting with the principles of LOD, in particular allowing the contents redistribution.
1. TBD.

The following _Indicator Sets_ are currently analyzed in depth and transformed into LOD to be included in the repository:

* [OECD Sustainable Manufacturing Toolkit](https://www.oecd.org/innovation/green/toolkit/oecdsustainablemanufacturingindicators.htm) (2011)
* [GRI Standard + Sector Specifics](https://www.globalreporting.org/standards/gri-standards-download-center)
* [EMAS III Core Indicators](https://www.emas.de/fileadmin/user_upload/06_service/PDF-Dateien/UGA_Infosheet_Indicators.pdf) (2019)

## Submissions

The following _Indicator Sets_ are currently in review for their potential inclusion into this repository:
* [GWÖ Matrix](https://www.ecogood.org/de/unsere-arbeit/gemeinwohl-bilanz/gemeinwohl-matrix/)
* [ISO 14955 - Environmental evaluation of machine tools](https://www.beuth.de/en/standard/iso-14955-1/282481423)
* [GWÖ Matrix](https://www.ecogood.org/de/unsere-arbeit/gemeinwohl-bilanz/gemeinwohl-matrix/)
* Dow Jones Sustainability Index
* ITT Flygt Sustainability Index
* Composite Sustainable Development Index
* GM Metrics for Sustainable Manufacturing
* Standard Guide for Characterizing Environmental Aspects of Manufacturing Processes, 2016.
* A. Brown, J. Amundson, and F. Badurdeen, “Sustainable value stream mapping (Sus-VSM) in different manufacturing system configurations: Application case studies,” Journal of Cleaner Production, vol. 85, pp. 164–179, 2014.
* J. R. Duflou et al., “Towards energy and resource efficient manufacturing: A processes and systems approach,” CIRP Annals, vol. 61, no. 2, pp. 587–609, 2012.
* A. Huang and F. Badurdeen, “Sustainable Manufacturing Performance Evaluation: Integrating Product and Process Metrics for Systems Level Assessment,” Procedia Manufacturing, vol. 8, pp. 563–570, 2017.

The following _Indicator Sets_ have been reviewed but can not be included in this catalog:

| Reference  | Review Result |
| ------------- | ------------- |
| TBD.  | TBD.  |


For inclusion of your sustainability assessmenet framework please open an [Issue]() and make sure you can sign a Contributors License Agreement.

## Preliminary User Roles

![Initial set of user roles for the ProMUT Indicator Repository](https://github.com/mukil/pmir/raw/master/proposal-user-groups-and-tasks.png)

## Linked Open Data

Linked Data is open data that employs the following principles ([Berners-Lee, 2006](https://www.w3.org/DesignIssues/LinkedData.html)):

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

The `Indicator-Repository-Model.rdf` is available freely under the GNU Affero General Public License, version 3.

Other RDF contents (`.rdf` files) in this repository are licensed under the original license provided by the owner of the applicable content. The owner of the applicable content is the following, as denoted in the penultimate part of each concepts URI:

* Every concept in the namespace `https://purl.org/promut/repository/oecd/` is based on the "OECD (2011), OECD Sustainable Manufacturing Toolkit Start-up Guide: Seven steps to environmental excellence, https://www.oecd.org/innovation/green/toolkit/48704993.pdf".

# Copyright

Copyright (C) 2019 Malte Reißig

# References

The system for the repositories model, including its reference frames and categories were developed based on the ideas presented in the following literature (presented here in chronological order):

- A. Tolk and J. Muguira, The Levels of Conceptual Interoperability Model, 2003.

- R. B. Gibson and S. Hassan, Sustainability assessment: Criteria and processes. London: Earthscan, 2005.

- D. Brandl, “What is ISA-95? Industrial Best Practices of Manufacturing Information Technologies with ISA-95 Models,” ISA 95 Editor, May. 19 2008.

- Z. Bi, “Revisiting System Paradigms from the Viewpoint of Manufacturing Sustainability,” Sustainability, vol. 3, no. 9, pp. 1323–1340, 2011.

- T. Lu et al., “A Framework of Product and Process Metrics for Sustainable Manufacturing,” in Advances in Sustainable Manufacturing: Proceedings of the 8th Global Conference on Sustainable Manufacturing, G. Seliger, M. M.K. Khraisheh, and I. S. Jawahir, Eds., Berlin, Heidelberg: Springer-Verlag Berlin Heidelberg, 2011, pp. 333–338.

- L. Ghahremanloo, J. A. Thom, and L. Magee, “An ontology derived from heterogeneous sustainability indicator set documents,” in Proceedings of the Seventeenth Australasian Document Computing Symposium on - ADCS '12, Dunedin, New Zealand, 2012, pp. 72–79.

- J. R. Duflou et al., “Towards energy and resource efficient manufacturing: A processes and systems approach,” CIRP Annals, vol. 61, no. 2, pp. 587–609, 2012.

- C. B. Joung, J. Carrell, P. Sarkar, and S. C. Feng, “Categorization of indicators for sustainable manufacturing,” Ecological Indicators, vol. 24, pp. 148–157, 2013.

- D. Chen, T. Schudeleit, G. Posselt, and S. Thiede, “A State-of-the-art Review and Evaluation of Tools for Factory Sustainability Assessment,” Procedia CIRP, vol. 9, pp. 85–90, 2013.

- S. Sala, B. Ciuffo, and P. Nijkamp, “A systemic framework for sustainability assessment,” Ecological Economics, vol. 119, pp. 314–325, 2015.

- M. Mani, J. Larborn, B. Johansson, K. W. Lyons, and K. C. Morris, “Standard Representations for Sustainability Characterization of Industrial Processes,” J. Manuf. Sci. Eng, vol. 138, no. 10, p. 101008, 2016.

- A. Brodsky, M. Krishnamoorthy, W. Z. Bernstein, and M. O. Nachawati, “A system and architecture for reusable abstractions of manufacturing processes,” in 2016 IEEE International Conference on Big Data: Dec 05-Dec 08, 2015, Washington D.C., USA : proceedings, Washington DC,USA, 2016, pp. 2004–2013.

- P. Sarkar, C. B. Joung, J. Carrell, and S. C. Feng, “Sustainable Manufacturing Indicator Repository,” in Proceedings of the ASME International Design Engineering Technical Conferences and Computers and Information in Engineering Conference - 2011: Presented at ASME 2011 International Design Engineering Technical Conferences and Computers and Information in Engineering Conference, August 28 - 31, 2011, Washington, D.C, Washington, DC, USA, 2012, pp. 943–950.

- A. Moldavska and T. Welo, “On the Applicability of Sustainability Assessment Tools in Manufacturing,” Procedia CIRP, vol. 29, pp. 621–626, 2015.

- A. Huang and F. Badurdeen, “Sustainable Manufacturing Performance Evaluation: Integrating Product and Process Metrics for Systems Level Assessment,” Procedia Manufacturing, vol. 8, pp. 563–570, 2017.

- S. Ahmad and K. Y. Wong, “Sustainability assessment in the manufacturing industry: A review of recent studies,” Benchmarking, vol. 25, no. 8, pp. 3162–3179, 2018.

- V. Bhakar, A. K. Digalwar, and K. S. Sangwan, “Sustainability Assessment Framework for Manufacturing Sector – A Conceptual Model,” Procedia CIRP, vol. 69, pp. 248–253, 2018
