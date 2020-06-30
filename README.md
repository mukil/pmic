
# ProMUT Manufacturing Indicator Catalog

The ProMUT Manufacturing Indicator Catalog is a research & development effort to integrate and relate indicators and indicator categories from different sustainability assessment frameworks. It currently consists of the following elements:

- `rdf` - Folder of RDF/XML files describing the sustainability frameworks
- `csv` - Folder of CSV files describing the sustainability frameworks for import into the authoring environment
- `prototype` - An authoring environment for the catalog realized as a plugin for the dmx-platform
- `docs` - Files documenting the workflow for collaborative research on the repository

## Catalog Entities

-  System (in Assessment): Society, Organization, Site/Factory, Process, Machine, Material, Human
-  Sustainability Dimension: Ecological, Economical, Social, Institutional
-  Indicator Set (for Sustainability Assessment Framework)
-  Indicator Category
-  Indicator

To express specific relations between Indicators from and within Indicator Sets, the application proposes to re-use the semantic relations specified in the SKOS Ontology (W3C).

## Content Selection Criteria

Designated contents of the ProMUT Indicator Catalog are indicator sets which embrace the legal aspects of this repository and meet the following criteria:

1. Contains indicators applicable for assessing the sustainability of a `System` in regards to at least one `Sustainability Dimension`.
1. Published accessibly in some form of document and with a complete description of all indicators (or the will to do so here).
1. Content imposes no legal restrictions conflicting with the principles of LOD, in particular allowing the contents redistribution.

The following _Indicator Sets_ are currently subject of an ongoing analysis and are included in this repository (see `/csv` folder):

Enterprise & Factory Level:<br/>
* [GRI Standard + Sector Specifics](https://www.globalreporting.org/standards/gri-standards-download-center)
* [OECD Sustainable Manufacturing Toolkit](https://www.oecd.org/innovation/green/toolkit/oecdsustainablemanufacturingindicators.htm) (2011)
* [EMAS III Core Indicators](https://www.emas.de/fileadmin/user_upload/06_service/PDF-Dateien/UGA_Infosheet_Indicators.pdf) (2019)

The following _Indicator Sets_ are also subject of analysis but can not be included in this repository due to accessibility issues or license restrictions:

Machine Tool Level:<br/>
* [ISO 14955 - Environmental evaluation of machine tools](https://www.beuth.de/en/standard/iso-14955-1/282481423)

The next _Indicator Sets_ are currently in review / under consideration for their potential integraton into the catalog:

* GM Metrics for Sustainable Manufacturing
* Dow Jones Sustainability Index
* ITT Flygt Sustainability Index
* Organizational Environmental Performance Indicators
* Composite Sustainable Development Index
* Standard Guide for Characterizing Environmental Aspects of Manufacturing Processes (2016)

For inclusion of additional sustainability assessmenet framework please open an [Issue](https://github.com/mukil/pmic/issues).

## Version History

**0.3.0**, 30.06.2020

-  Prototype implementation of a collaborative authoring environment for managing a reference implementaton of the catalog using a web-based collaboration environment (see `/prototype`)
-  Initial write up of the repository model as an RDF Schema / OWL Document (see `/rdf`)
-  Initial write up of the resource description of the OECD Sustainable Manufacturing Toolkit (see `/rdf`)

## Background

The initial idea for this repository was developed as a contribution to the [EnvirInfo 2019](https://enviroinfo2019.org/) workshop on the [Future of Environmental Informatics Research from the Perspective of Young Researchers](https://enviroinfo2019.org/workshops/#track3).

## Acknowledgement

The [Junior Research Group “ProMUT”](https://purl.org/promut) (grant number: 01UU1705A) is funded by the German Federal Ministry of Education and Research as part of its funding initiative “[Social-Ecological Research](https://twitter.com/soef_BMBF)“).

## Licenses

The `rdf/Indicator-Repository-Model.rdf` is available freely under the GNU Affero General Public License, version 3.

Other RDF contents (`.rdf` files) in this repository are licensed under the original license provided by the owner of the applicable content. The owner of the applicable content is the following, as denoted in the penultimate part of each concepts URI:

* Every concept in the namespace `https://purl.org/promut/repository/oecd/` is based on the "OECD (2011), OECD Sustainable Manufacturing Toolkit Start-up Guide: Seven steps to environmental excellence, https://www.oecd.org/innovation/green/toolkit/48704993.pdf".

## Copyright

Copyright (C) 2019-2020 Malte Reißig

## Literature

The catalog's application model and the reference frames ("System Levels") it comes with were derived based on a systematic literature review of the research articles (presented here in chronological order):

- A. Tolk and J. Muguira, The Levels of Conceptual Interoperability Model, 2003.

- R. B. Gibson and S. Hassan, Sustainability assessment: Criteria and processes. London: Earthscan, 2005.

- D. Brandl, “What is ISA-95? Industrial Best Practices of Manufacturing Information Technologies with ISA-95 Models,” ISA 95 Editor, May. 19 2008.

- Z. Bi, “Revisiting System Paradigms from the Viewpoint of Manufacturing Sustainability,” Sustainability, vol. 3, no. 9, pp. 1323–1340, 2011.

- T. Lu et al., “A Framework of Product and Process Metrics for Sustainable Manufacturing,” in Advances in Sustainable Manufacturing: Proceedings of the 8th Global Conference on Sustainable Manufacturing, G. Seliger, M. M.K. Khraisheh, and I. S. Jawahir, Eds., Berlin, Heidelberg: Springer-Verlag Berlin Heidelberg, 2011, pp. 333–338.

- L. Ghahremanloo, J. A. Thom, and L. Magee, “An ontology derived from heterogeneous sustainability indicator set documents,” in Proceedings of the Seventeenth Australasian Document Computing Symposium on - ADCS '12, Dunedin, New Zealand, 2012, pp. 72–79.

- A. Brown, J. Amundson, and F. Badurdeen, “Sustainable value stream mapping (Sus-VSM) in different manufacturing system configurations: Application case studies,” Journal of Cleaner Production, vol. 85, pp. 164–179, 2014.

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
