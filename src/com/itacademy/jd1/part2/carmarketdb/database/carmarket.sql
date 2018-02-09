--
-- PostgreSQL database dump
--

-- Dumped from database version 10.1
-- Dumped by pg_dump version 10.1

-- Started on 2018-02-09 13:30:10

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

--
-- TOC entry 2834 (class 0 OID 24629)
-- Dependencies: 197
-- Data for Name: brand; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY brand (id, name) FROM stdin;
1	Alfa Romeo
2	Audi
3	Bentley
4	BMW
5	Cadillac
6	Chrysler
7	Citroen
8	Dodge
9	Ferrari
10	Fiat
11	Ford
12	Geely
13	Honda
14	Hummer
15	Hyundai
16	Infiniti
17	Isuzu
18	Jaguar
19	Jeep
20	Kia
21	Lamborghini
22	Land Rover
23	Lexus
24	Lincoln
25	Lotus
26	Maybach
27	Mazda
28	Mercedes-Benz
29	Mitsubishi
30	Nissan
31	Opel
32	Peugeot
33	Porsche
34	Renault
35	Rolls-Royce
36	Rover
37	Saab
38	SEAT
39	Skoda
40	SsangYong
41	Subaru
42	Suzuki
43	Toyota
44	Volkswagen
45	Volvo
\.


--
-- TOC entry 2838 (class 0 OID 24653)
-- Dependencies: 201
-- Data for Name: car; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY car (id, fueltype_id, year, price, model_id) FROM stdin;
1	2	2002	4800	335
2	3	2007	7200	319
3	1	2014	7600	15
4	1	1996	5200	138
5	2	2014	8800	82
6	1	2014	8000	678
7	3	2007	7000	420
8	3	2011	7600	204
9	2	1992	4600	241
10	2	2009	6800	284
11	2	1981	2400	10
12	1	1987	2600	81
13	1	2008	7200	358
14	2	1992	4200	424
15	2	2014	8000	133
16	2	1988	2000	214
17	1	1978	1000	484
18	1	1999	4200	495
19	3	1984	2600	106
20	1	1983	1200	626
21	1	1988	2800	244
22	3	1985	3000	747
23	1	1992	3800	443
24	2	1986	1800	665
25	2	2007	6000	239
26	3	1997	4800	630
27	3	1979	1400	248
28	1	1982	2400	586
29	2	1985	2800	81
30	2	2005	6600	689
31	3	1986	2400	533
32	2	1998	4600	73
33	1	1985	2400	277
34	2	1983	1800	65
35	2	2009	6800	209
36	1	1989	3000	111
37	1	1982	2000	739
38	2	2006	6800	575
39	3	2017	8800	255
40	2	1998	4000	283
41	2	2010	7600	118
42	2	2002	4800	338
43	3	2003	6200	569
44	2	2016	8400	175
45	1	2017	9400	99
46	1	1995	4800	36
47	1	2003	6200	451
48	2	1988	2600	748
49	2	1996	4400	661
50	2	2004	6200	236
51	2	1983	2600	95
52	3	1992	4600	734
53	1	2012	7000	320
54	3	1996	4400	755
55	2	2013	8000	421
56	2	1985	2000	570
57	3	1992	4000	190
58	2	2010	8000	158
59	1	2000	4800	121
60	2	1985	2600	595
61	3	2013	8400	161
62	1	1980	1800	331
63	3	2011	6800	136
64	2	1979	1000	732
65	2	1986	2600	416
66	3	2006	5600	601
67	3	2008	6200	43
68	3	2002	6200	494
69	3	2002	5000	355
70	2	2007	6000	700
71	3	2009	7400	361
72	3	2010	7600	461
73	3	1999	5000	592
74	3	2015	8000	92
75	2	1978	400	557
76	2	2004	5200	313
77	1	1999	5200	90
78	2	1979	400	100
79	1	1987	3600	694
80	1	1990	3800	594
81	3	1995	4400	147
82	3	2009	6600	110
83	1	1984	2600	293
84	1	1997	5000	272
85	1	2009	7200	496
86	1	2002	5000	366
87	2	1991	3000	78
88	2	2002	5200	317
89	2	1993	3000	747
90	1	1999	5200	362
91	3	1988	2000	189
92	3	1990	3200	32
93	3	1986	1800	747
94	1	1997	4000	29
95	2	1993	4000	513
96	3	2016	8800	160
97	1	1993	3800	228
98	2	2012	7400	309
99	2	1983	1400	502
100	3	1988	2000	266
102	1	1900	1500	233
103	2	1993	4000	513
104	2	1999	2300	100
\.


--
-- TOC entry 2836 (class 0 OID 24645)
-- Dependencies: 199
-- Data for Name: fueltype; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY fueltype (id, name) FROM stdin;
2	gasoline
3	propan/gasoline
1	diesel
\.


--
-- TOC entry 2840 (class 0 OID 24707)
-- Dependencies: 203
-- Data for Name: model; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY model (id, name, brand_id) FROM stdin;
1	146	1
2	147	1
3	147 GTA	1
4	156	1
5	156 GTA	1
6	159	1
7	166	1
8	4C	1
9	8C Competizione	1
10	Brera	1
11	C-SUV	1
12	Giulia	1
13	Giulietta	1
14	GT	1
15	GTV	1
16	MiTo	1
17	Spider	1
18	Stelvio	1
19	100	2
20	200	2
21	50	2
22	60	2
23	75	2
24	80	2
25	90 	2
26	A1	2
27	A2	2
28	A3	2
29	A4	2
30	A5	2
31	A6	2
32	A7	2
33	A8	2
34	Q2	2
35	Q3	2
36	Q5	2
37	Q7	2
38	R8	2
39	RS Q3	2
40	RS3	2
41	RS4	2
42	RS6	2
43	RS7	2
44	S3	2
45	S4	2
46	S5	2
47	S6	2
48	S7	2
49	S8	2
50	TT	2
51	TT RS	2
52	TTS	2
53	V8	2
54	Arnage	3
55	Azure	3
56	Bentayga	3
57	Brooklands	3
58	Continental	3
59	Mulsanne	3
60	1 series	4
61	2 series	4
62	3 series	4
63	4 series	4
64	5 series	4
65	6 series	4
66	7 series	4
67	8 series	4
68	i3	4
69	i8	4
70	M3	4
71	M4	4
72	M5	4
73	M6	4
74	X1	4
75	X3	4
76	X4	4
77	X5	4
78	X5 M	4
79	X6	4
80	X6 M	4
81	Z3	4
82	Z4	4
83	Z8	4
84	ATS	5
85	BLS	5
86	CT6	5
87	CTS	5
88	De Ville	5
89	DTS	5
90	Eldorado	5
91	Escalade	5
92	Seville	5
93	SRX	5
94	STS	5
95	XLR	5
96	XT5	5
97	XTS	5
98	300C	6
99	300M	6
100	Aspen	6
101	Concorde	6
102	Crossfire	6
103	Grand Voyager	6
104	Pacifica	6
105	PT Cruiser	6
106	Sebring	6
107	Town & Country	6
108	Voyager	6
109	Berlingo	7
110	C-Crosser	7
111	C-Elysee	7
112	C1	7
113	C2	7
114	C3	7
115	C3 Picasso	7
116	C3 Pluriel	7
117	C4	7
118	C4 Aircross	7
119	C4 Cactus	7
120	C4 Picasso	7
121	C5	7
122	C6	7
123	C8	7
124	DS3	7
125	DS4	7
126	DS5	7
127	Grand C4 Picasso	7
128	Jumpy	7
129	Nemo	7
130	Saxo	7
131	Spacetourer	7
132	Xsara	7
133	Xsara Picasso	7
134	Avenger	8
135	Caliber	8
136	Caliber SRT4	8
137	Caravan	8
138	Charger	8
139	Dakota	8
140	Durango	8
141	Intrepid	8
142	Journey	8
143	Magnum	8
144	Neon	8
145	Nitro	8
146	Ram 1500	8
147	Ram 2500	8
148	Ram SRT10	8
149	Stratus	8
150	Viper	8
151	Viper V	8
152	348 GT	9
153	348 Spider	9
154	360 Modena	9
155	360 Spider	9
156	456 GT	9
157	456 GTA	9
158	456 M GT	9
159	456 M GTA	9
160	458 Italia	9
161	488 GTB	9
162	512 TR	9
163	550 Barchetta Pininfarina	9
164	550 Maranello	9
165	575 M Maranello	9
166	599 GTB Fiorano	9
167	599 GTO	9
168	612 Scaglietti	9
169	California	9
170	California T	9
171	Challenge Stradale	9
172	Enzo	9
173	F12 Berlinetta	9
174	F355	9
175	F430	9
176	F50	9
177	F512 M	9
178	FF	9
179	FXX	9
180	Superamerica	9
181	500	10
182	500L	10
183	Albea	10
184	Brava	10
185	Bravo	10
186	Coupe	10
187	Croma	10
188	Doblo	10
189	Duсato	10
190	Grande Punto	10
191	Idea	10
192	Linea	10
193	Marea	10
194	Multipla	10
195	Palio	10
196	Panda	10
197	Panda 4x4	10
198	Punto	10
199	Qubo	10
200	Sedici	10
201	Stilo	10
202	Ulysse	10
203	B-Max	11
204	C-Max	11
205	Cougar	11
206	Crown Victoria	11
207	EcoSport	11
208	Edge	11
209	Escape	11
210	Excursion	11
211	Expedition	11
212	Explorer	11
213	F-150	11
214	Fiesta	11
215	Five Hundred	11
216	Flex	11
217	Focus	11
218	Freestar	11
219	Freestyle	11
220	Fusion	11
221	Galaxy	11
222	Ka	11
223	Kuga	11
224	Maverick	11
225	Mondeo	11
226	Mustang	11
227	Puma	11
228	Ranger	11
229	S-Max	11
230	Sport Trac	11
231	Taurus	11
232	Taurus X	11
233	Thunderbird	11
234	Tourneo Connect	11
235	Transit	11
236	Transit Connect	11
237	Emgrand EC7	12
238	Emgrand X7	12
239	GС6	12
240	MK	12
241	Otaka	12
242	Vision	12
243	Accord	13
244	Accord IX (CZ)	13
245	Civic	13
246	Civic IX (FB, FG)	13
247	Civic X (FC)	13
248	CR-V	13
249	CR-Z (ZF1)	13
250	Crosstour	13
251	Element	13
252	Fit	13
253	FR-V	13
254	HR-V	13
255	HR-V II (GJ)	13
256	Insight	13
257	Insight II (ZE2)	13
258	Jazz	13
259	Legend	13
260	Odyssey	13
261	Pilot	13
262	Prelude	13
263	Ridgeline	13
264	S2000	13
265	Shuttle	13
266	Stream	13
267	H2	14
268	H3	14
269	Accent	15
270	Atos Prime	15
271	Azera	15
272	Centennial	15
273	Creta	15
274	Elantra	15
275	Entourage	15
276	Eon	15
277	Equus	15
278	Galloper	15
279	Genesis	15
280	Genesis Coupe	15
281	Getz	15
282	Grandeur	15
283	H1	15
284	i10	15
285	i20	15
286	i30	15
287	i40	15
288	ix20	15
289	ix35	15
290	Matrix	15
291	Porter	15
292	Santa Fe	15
293	Solaris	15
294	Sonata	15
295	Terracan	15
296	Trajet	15
297	Tucson	15
298	Veloster	15
299	Veracruz	15
300	Verna	15
301	Xcent	15
302	XG	15
303	EX	16
304	FX	16
305	G	16
306	I35	16
307	JX	16
308	M	16
309	Q30	16
310	Q40	16
311	Q45	16
312	Q50	16
313	Q60	16
314	Q70	16
315	QX30	16
316	QX4	16
317	QX50	16
318	QX56	16
319	QX60	16
320	QX70	16
321	QX80	16
322	Ascender	17
323	Axiom	17
324	D-Max	17
325	D-Max Rodeo	17
326	I280	17
327	I290	17
328	I350	17
329	I370	17
330	Rodeo	17
331	Trooper	17
332	VehiCross	17
333	F-Pace	18
334	F-Type	18
335	S-Type	18
336	X-Type	18
337	XE	18
338	XF	18
339	XFR	18
340	XJ	18
341	XK/XKR	18
342	Cherokee	19
343	Commander	19
344	Compass	19
345	Grand Cherokee	19
346	Liberty	19
347	Renegade	19
348	Wrangler	19
349	Carens	20
350	Carnival	20
351	Ceed	20
352	Cerato	20
353	Clarus	20
354	Forte	20
355	Magentis	20
356	Mohave	20
357	Opirus	20
358	Optima	20
359	Picanto	20
360	Quoris	20
361	Ray	20
362	Rio	20
363	Shuma	20
364	Sorento	20
365	Soul	20
366	Spectra	20
367	Sportage	20
368	Venga	20
369	Aventador	21
370	Diablo	21
371	Gallardo	21
372	Huracan	21
373	Murcielago	21
374	Reventon	21
375	Defender	22
376	Discovery	22
377	Discovery Sport	22
378	Evoque	22
379	Freelander	22
380	Range Rover	22
381	Range Rover Sport	22
382	CT	23
383	ES	23
384	GS	23
385	GX	23
386	HS	23
387	IS	23
388	LFA	23
389	LS	23
390	LX	23
391	NX	23
392	RC	23
393	RX	23
394	SC	23
395	Aviator	24
396	Mark LT	24
397	MKS	24
398	MKT	24
399	MKX	24
400	MKZ	24
401	Navigator	24
402	Town Car	24
403	Zephyr	24
404	Elise	25
405	Europa S	25
406	Evora	25
407	Exige	25
408	57	26
409	57 S	26
410	62	26
411	62 S	26
412	Landaulet	26
413	2	27
414	3	27
415	323	27
416	5	27
417	6	27
418	626	27
419	B-Series	27
420	BT-50	27
421	CX-3	27
422	CX-5	27
423	CX-7	27
424	CX-9	27
425	MPV	27
426	MX-5	27
427	Premacy	27
428	RX-7	27
429	RX-8	27
430	Tribute	27
431	A-class	28
432	AMG GT	28
433	B-class	28
434	B-Klass	28
435	C-class	28
436	C-class Sport Coupe	28
437	CL-class	28
438	CLA-Class	28
439	CLC-class 	28
440	CLK-class	28
441	CLS-class	28
442	E-class	28
443	G-class	28
444	GL-class	28
445	GLA-class	28
446	GLC-Class	28
447	GLE Coupe	28
448	GLE-Class	28
449	GLK-class	28
450	M-class	28
451	R-class	28
452	S-class	28
453	SL-class	28
454	SLK-class	28
455	SLR-class	28
456	SLS AMG	28
457	Sprinter	28
458	Vaneo	28
459	Viano	28
460	Vito	28
461	3000 GT	29
462	ASX	29
463	Carisma	29
464	Colt	29
465	Dignity	29
466	Eclipse	29
467	Endeavor	29
468	Galant	29
469	Grandis	29
470	i-MiEV	29
471	L200	29
472	L300	29
473	L400	29
474	Lancer	29
475	Lancer Evo	29
476	Mirage	29
477	Outlander	29
478	Outlander XL	29
479	Pajero	29
480	Pajero Pinin	29
481	Pajero Sport	29
482	Raider	29
483	Space Gear	29
484	Space Runner	29
485	Space Star	29
486	350Z	30
487	370Z	30
488	Almera	30
489	Almera Classic	30
490	Almera Tino	30
491	Altima	30
492	Armada	30
493	GT-R	30
494	Juke	30
495	Leaf	30
496	Maxima	30
497	Micra	30
498	Murano	30
499	Navara	30
500	Note	30
501	NP300	30
502	Pathfinder	30
503	Patrol	30
504	Primera	30
505	Qashqai	30
506	Qashqai+2	30
507	Quest	30
508	Sentra	30
509	Skyline	30
510	Teana	30
511	Terrano	30
512	Tiida	30
513	Titan	30
514	X-Trail	30
515	XTerra	30
516	Z	30
517	Adam	31
518	Agila	31
519	Antara	31
520	Astra	31
521	Astra GTS	31
522	Cascada	31
523	Combo	31
524	Corsa	31
525	Frontera	31
526	Insignia	31
527	Karl	31
528	Meriva	31
529	Mokka	31
530	Omega	31
531	Signum	31
532	Speedster	31
533	Tigra	31
534	Vectra	31
535	Vivaro	31
536	Zafira	31
537	Zafira Tourer	31
538	1007	32
539	107	32
540	108	32
541	2008	32
542	206	32
543	207	32
544	208	32
545	3008	32
546	301	32
547	307	32
548	308	32
549	4007	32
550	4008	32
551	406	32
552	407	32
553	408	32
554	5008	32
555	508	32
556	607	32
557	807	32
558	Boxer	32
559	Partner	32
560	RCZ Sport	32
561	911	33
562	Boxster	33
563	Cayenne	33
564	Cayman	33
565	Macan	33
566	Panamera	33
567	Avantime	34
568	Captur	34
569	Clio	34
570	Duster	34
571	Duster Oroch	34
572	Espace	34
573	Fluence	34
574	Kadjar	34
575	Kangoo	34
576	Kaptur	34
577	Koleos	34
578	Laguna	34
579	Latitude	34
580	Logan	34
581	Master	34
582	Megane	34
583	Modus	34
584	Sandero	34
585	Sandero Stepway	34
586	Scenic	34
587	Symbol	34
588	Talisman	34
589	Trafic	34
590	Twingo	34
591	Twizy	34
592	Vel Satis	34
593	Wind	34
594	Zoe	34
595	Ghost	35
596	Phantom	35
597	25	36
598	400	36
599	45	36
600	600	36
601	75	36
602	Streetwise	36
603	600	37
604	9-3	37
605	9-3X	37
606	9-5	37
607	9-7X	37
608	90	37
609	900	37
610	9000	37
611	95 Station Wagon	37
612	96	37
613	99	37
614	Alhambra	38
615	Altea	38
616	Altea Freetrack	38
617	Altea XL	38
618	Arosa	38
619	Cordoba	38
620	Exeo	38
621	Ibiza	38
622	Leon	38
623	Mii	38
624	Toledo	38
625	Citigo	39
626	Fabia	39
627	Felicia	39
628	Octavia	39
629	Octavia Scout	39
630	Octavia Tour	39
631	Praktik	39
632	Rapid	39
633	Rapid Spaceback (NH1)	39
634	Roomster	39
635	Superb	39
636	Yeti	39
637	Actyon	40
638	Actyon Sports	40
639	Chairman	40
640	Korando	40
641	Kyron	40
642	Musso	40
643	Musso Sport	40
644	Rexton	40
645	Rodius	40
646	Stavic	40
647	Tivoli	40
648	Baja	41
649	Exiga	41
650	Forester	41
651	Impreza	41
652	Justy	41
653	Legacy	41
654	Levorg	41
655	Outback	41
656	Traviq	41
657	Tribeca	41
658	WRX	41
659	XV	41
660	Alto	42
661	Baleno	42
662	Celerio	42
663	Ciaz	42
664	Grand Vitara	42
665	Grand Vitara XL7	42
666	Ignis	42
667	Jimny	42
668	Kizashi	42
669	Liana	42
670	Splash	42
671	Swift	42
672	SX4	42
673	Wagon R	42
674	Wagon R+	42
675	4Runner	43
676	Alphard	43
677	Auris	43
678	Avalon	43
679	Avensis	43
680	Avensis Verso	43
681	Aygo	43
682	Camry	43
683	Celica	43
684	Corolla	43
685	Corolla Verso	43
686	FJ Cruiser	43
687	Fortuner	43
688	GT 86	43
689	Hiace	43
690	Highlander	43
691	Hilux	43
692	iQ	43
693	ist	43
694	Land Cruiser	43
695	Land Cruiser Prado	43
696	Mark II	43
697	Mirai	43
698	MR2	43
699	Picnic	43
700	Previa	43
701	Prius	43
702	RAV4	43
703	Sequoia	43
704	Sienna	43
705	Tacoma	43
706	Tundra	43
707	Venza	43
708	Verso	43
709	Vitz	43
710	Yaris	43
711	Yaris Verso	43
712	Amarok	44
713	Beetle	44
714	Bora	44
715	Caddy	44
716	Crafter	44
717	CrossGolf	44
718	CrossPolo	44
719	CrossTouran	44
720	Eos	44
721	Fox	44
722	Golf	44
723	Jetta	44
724	Lupo	44
725	Multivan	44
726	New Beetle	44
727	Passat	44
728	Passat CC	44
729	Phaeton	44
730	Pointer	44
731	Polo	44
732	Routan	44
733	Scirocco	44
734	Sharan	44
735	Tiguan	44
736	Touareg	44
737	Touran	44
738	Transporter	44
739	Up	44
740	C30	45
741	C70	45
742	C70 Convertible	45
743	C70 Coupe	45
744	S40	45
745	S60	45
746	S70	45
747	S80	45
748	S90	45
749	V40	45
750	V40 Cross Country	45
751	V50	45
752	V60	45
753	V70	45
754	V90	45
755	XC60	45
756	XC70	45
757	XC90	45
\.


--
-- TOC entry 2852 (class 0 OID 0)
-- Dependencies: 196
-- Name: brand_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('brand_id_seq', 45, true);


--
-- TOC entry 2853 (class 0 OID 0)
-- Dependencies: 200
-- Name: car_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('car_id_seq', 106, true);


--
-- TOC entry 2854 (class 0 OID 0)
-- Dependencies: 198
-- Name: fueltype_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('fueltype_id_seq', 5, true);


--
-- TOC entry 2855 (class 0 OID 0)
-- Dependencies: 202
-- Name: model_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('model_id_seq', 757, true);


-- Completed on 2018-02-09 13:30:10

--
-- PostgreSQL database dump complete
--

