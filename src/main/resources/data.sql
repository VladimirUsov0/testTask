-- truncate table bank,client,bank_client,credit,bank_credit,payment_schedule,loan_offer;
TRUNCATE SCHEMA public AND COMMIT;
insert into bank (id)
values ('91d6b100-c003-4330-8964-dcb7347c72bf'),
       ('d47f9367-6a2f-4a7f-b380-f18aedf9da19'),
       ('0abd7557-c63b-47e1-a91d-4bec476c5f28'),
       ('b8cfffdc-26d4-4240-b1e5-02067fa95ac4'),
       ('eb267302-7521-4356-8782-502a7f7f941e'),
       ('b75184e9-df62-434d-b305-1ed6d4bf01f9'),
       ('483b33c7-d473-4d51-8ad8-1cb09f3f2e33'),
       ('821e96b6-991d-4bb5-8d95-f6dc3bb0cc3b'),
       ('8e35fda2-968a-4b28-afbc-c89ea32d232a'),
       ('fb0f39a0-d09c-4f54-9c1b-23c3767b0c8e') ;


insert into client (id, fio, phone, email, passport_number)
values ('8d41cd5f-33a6-4992-8b45-1bfa9a90a8b7', 'Asia', '+86 (444) 517-6157', 'abarltrop0@artisteer.com',
        '4088 252476'),
       ('16e6f9ee-ce70-40e9-ae87-038bc8796ea6', 'Neddy', '+961 (295) 957-6124', 'nmassey1@home.pl', '3328 983650'),
       ('e5df89f4-2c6f-4168-b301-8ca6574827a0', 'Alf', '+357 (292) 435-7748', 'awellard2@a8.net', '7503 027481'),
       ('8857bd89-398f-4ce5-acbb-e910946cb536', 'Sutherland', '+63 (836) 887-5581', 'sgatfield3@nba.com',
        '1971 983527'),
       ('762bf7b2-429a-4e96-9b17-ffe70f15fb0b', 'Randie', '+33 (707) 770-1857', 'rsimner4@g.co', '0221 241239'),
       ('8c4e5a76-3584-4f1c-9c34-afead0d316b5', 'Saba', '+1 (330) 294-5808', 'scorkill5@answers.com', '1154 093467'),
       ('32db0a23-30cc-4364-a2f9-c20a69c465ff', 'Henrik', '+351 (129) 253-6887', 'hkilmurry6@plala.or.jp',
        '1851 025699'),
       ('09489f46-6308-45f8-b9e1-12c544058877', 'Casandra', '+86 (171) 814-2197', 'cstockings7@ow.ly', '8888 985427'),
       ('02a09daf-fa2b-4f59-a0c7-3c0bf1fb8c75', 'Nelie', '+593 (824) 244-4383', 'nsevier8@army.mil', '7759 397542'),
       ('273b860a-c595-4bf4-8da9-e621b5c7bebd', 'Emile', '+86 (869) 416-3931', 'ebernli9@tripod.com', '2008 857806'),
       ('b4009f75-d5d2-45a8-89a7-ab8c8f0d6f66', 'Julissa', '+62 (702) 497-7490', 'jmoxteda@harvard.edu', '1709 144803'),
       ('93ce3b03-6330-41db-911c-6615f31b8b01', 'Christiana', '+55 (283) 409-0893', 'cbattinb@admin.ch', '3346 363295'),
       ('35c57719-71f7-4e06-8771-572fef639ae9', 'Kanya', '+1 (284) 341-6560', 'kstanneringc@etsy.com', '2696 645547'),
       ('c2c40d5e-77e7-495a-87e7-2da1a8ef4963', 'Mahala', '+351 (834) 442-4102', 'mgooddyd@npr.org', '1924 115339'),
       ('62e06fd5-52fd-4ac3-898d-4f6b71b9afdb', 'Maisie', '+351 (604) 673-7752', 'mgarrarde@cocolog-nifty.com',
        '5536 130895'),
       ('fde7d151-3dfa-4b7a-ad49-f05c1218a078', 'Danyette', '+358 (804) 265-2498', 'dhembrowf@networkadvertising.org',
        '2311 808311'),
       ('75ded1f9-33a7-4f77-abdf-e08f43ce5094', 'Zenia', '+351 (549) 468-2248', 'zdavittig@slashdot.org',
        '7389 382876'),
       ('5a43d605-a3e8-4909-8a15-1d21ab8cba4a', 'Loraine', '+86 (847) 968-5414', 'lkeitleyh@nyu.edu', '5046 801133'),
       ('3983f41c-5007-43a6-8d34-b3881f2a99f1', 'Alys', '+84 (158) 445-0212', 'amanicombi@usgs.gov', '1114 427350'),
       ('fe7c4b90-b2cf-4cf9-8f14-f5fdbbbe11cd', 'Roxana', '+30 (944) 587-2387', 'rcoldmanj@abc.net.au', '4223 290201'),
       ('ec17adb8-9c00-4828-aa82-f0177bbc9842', 'Millisent', '+63 (881) 805-3062', 'mscraftonk@surveymonkey.com',
        '9179 421969'),
       ('4586fd56-7e52-490a-ba11-59725e518db2', 'Sid', '+269 (150) 313-6150', 'ssergeauntl@flavors.me', '6554 418449'),
       ('f5816b17-8a3f-4c2d-a9a7-ecec77a3726f', 'Denis', '+420 (400) 248-0937', 'ddeniskem@vk.com', '1347 350412'),
       ('3b02abd2-dde6-43d1-a4c0-caf73cc920fa', 'Bay', '+33 (773) 131-5340', 'bberrimann@whitehouse.gov',
        '2256 344525'),
       ('075ab4a1-eb12-47dd-aca9-badc65f61713', 'Julian', '+62 (417) 809-7597', 'jtysono@gmpg.org', '9504 677621'),
       ('36b38cc0-4627-4dfd-9565-5952d74225bd', 'Corry', '+62 (659) 162-5827', 'cstottp@stumbleupon.com',
        '7086 464867'),
       ('eb65619b-5e99-483a-a9ee-b79ae89a1c0f', 'Devinne', '+7 (614) 330-6885', 'dkalinowskyq@twitpic.com',
        '8545 135096'),
       ('a750105f-3265-4665-a9c6-6a5a6ca3d04e', 'Lazare', '+86 (551) 356-7000', 'lmacconnellr@quantcast.com',
        '6593 470440'),
       ('3031e11b-9efb-46ac-a05b-ac2056729183', 'Prisca', '+504 (707) 141-9735', 'ptassells@facebook.com',
        '5705 049550'),
       ('174563e2-2b3f-468d-911d-d1464ae03b76', 'Pam', '+86 (330) 756-7940', 'pgullifantt@wordpress.com',
        '4426 236619'),
       ('73e8f2eb-87e1-491c-8a1e-8e7c418ffd24', 'Jeff', '+972 (959) 398-9353', 'jalthorpeu@hatena.ne.jp',
        '9509 574170'),
       ('7f975fa3-2f15-4297-aada-dc9e77283231', 'Meggy', '+7 (591) 475-7838', 'msawkinsv@epa.gov', '8609 473412'),
       ('6045617b-23df-46e0-893a-31981a92a481', 'Emilie', '+86 (545) 637-8009', 'ebruniw@hatena.ne.jp', '6333 004659'),
       ('56251bc5-3f9e-4353-98a7-7bbe16813633', 'Jeanelle', '+62 (344) 530-2834', 'jtracyx@apple.com', '0844 852716'),
       ('9cc66cdb-62f7-41fe-bea9-9cd2257d3fbc', 'Ximenez', '+7 (915) 548-6464', 'xsimantsy@nature.com', '5819 964013'),
       ('469fd799-3cf6-4cd0-9bcb-2d25f2c0e3fd', 'Ulric', '+386 (146) 384-9140', 'ustoggellz@vk.com', '7524 100704'),
       ('8b085a93-522b-4168-9523-93a0f4664d78', 'Sylvan', '+255 (551) 471-2577', 'sprahm10@wordpress.com',
        '3781 355946'),
       ('5dea1444-cdb4-4521-9840-c4bdb8fb2006', 'Anatola', '+1 (757) 454-7961', 'agoldberg11@yellowbook.com',
        '3203 132420'),
       ('9f3ef00d-f03c-4bba-a3be-48e71de9235d', 'Randy', '+86 (381) 862-3519', 'rverma12@taobao.com', '2383 449062'),
       ('c2b008da-060c-4693-8ced-cd1559056dc8', 'Omar', '+63 (448) 535-7804', 'onekrews13@statcounter.com',
        '3992 274088'),
       ('ef9d40fc-fcef-4bd7-ba35-5dd1c952f2b2', 'Harlie', '+374 (390) 413-5807', 'hkindley14@soup.io', '5119 820567'),
       ('4d497e91-4fb2-4a56-bc18-1b14840b139f', 'Cynthie', '+66 (629) 421-5677', 'ccanas15@youtube.com', '7313 646294'),
       ('158a727f-e630-4953-a1a2-68ecb6861543', 'Freeman', '+62 (167) 914-6014', 'fdacth16@ehow.com', '1373 600810'),
       ('6f037656-b514-4d46-8869-4c5e13fbcfb7', 'Marnie', '+48 (837) 221-9548', 'mkeunemann17@ning.com', '2537 998000'),
       ('9f5311d8-3f9f-4a65-b586-aed1d6b33db3', 'Montague', '+62 (870) 285-5950', 'mthornborrow18@examiner.com',
        '6987 616514'),
       ('9fbb37ee-00bb-466b-b78b-af00560a4684', 'Eddie', '+62 (210) 167-0121', 'eblackstock19@clickbank.net',
        '6450 785912'),
       ('1622e113-ce03-4a27-9e50-a29914191e4f', 'Robena', '+351 (696) 150-8485', 'rwhittick1a@unesco.org',
        '6548 959942'),
       ('0171f86c-6787-4d77-a199-53eeb334dbd2', 'Karen', '+86 (793) 537-5778', 'kmattack1b@wired.com', '1754 311508'),
       ('6b48d040-2d13-4a6d-a557-605f93b4d30e', 'Geoffrey', '+7 (442) 131-1703', 'gstables1c@pen.io', '4382 969911'),
       ('84ae357f-6fd8-40c0-ba35-c7c6684b5aea', 'Zelig', '+60 (795) 267-9982', 'zwebbe1d@w3.org', '1028 095981');



insert into credit (id, limit, percent)
values ('faed0d27-2f40-4b7c-8249-bf5cca6e785c', 145445, 16.68),
       ('8b012a4d-0c9c-4392-b548-3422c305d9c9', 4059706, 31.12),
       ('3353b2fe-c6ea-46d5-a34a-354402fc5e60', 1702653, 291.7),
       ('de4c5679-f1a4-4567-9eab-cd04f0706ff3', 3066418, 202.31),
       ('7b04f96c-8296-4cae-9ec6-c6bcb897f142', 2883959, 57.93),
       ('fa4415a2-4c30-4bc0-a3cd-e24cc6b85a97', 3596542, 78.11),
       ('12069bd6-81e9-48dd-8b30-7060fec7ac59', 4094496, 18.05),
       ('ecc139d2-5bb6-4c83-a1ac-eedbb80134c8', 2190074, 164.82),
       ('054e58c0-0ca8-4dd2-bb0f-0c512e326e40', 1956994, 203.59),
       ('e477b574-ed75-4039-8b84-fb3c81ff85eb', 3261844, 157.72);

insert into bank_client (id, bank, client)
values
('3eea12b9-81db-8d14-6450-38de8eb65cbf','0abd7557-c63b-47e1-a91d-4bec476c5f28','075ab4a1-eb12-47dd-aca9-badc65f61713'),
('ac574c97-8a62-d39e-d015-ddfde337b8d5','0abd7557-c63b-47e1-a91d-4bec476c5f28','35c57719-71f7-4e06-8771-572fef639ae9'),
('edf45623-043a-869f-8a39-c4db5e6a660c','0abd7557-c63b-47e1-a91d-4bec476c5f28','3983f41c-5007-43a6-8d34-b3881f2a99f1'),
('b78408d9-b6a6-50c4-f742-22dd86c9919e','0abd7557-c63b-47e1-a91d-4bec476c5f28','b4009f75-d5d2-45a8-89a7-ab8c8f0d6f66'),
('35f25db6-3dd9-5020-6226-04c2d651bb58','0abd7557-c63b-47e1-a91d-4bec476c5f28','c2b008da-060c-4693-8ced-cd1559056dc8'),
('954ea665-dca4-5651-75de-9a178f7aedcd','0abd7557-c63b-47e1-a91d-4bec476c5f28','c2c40d5e-77e7-495a-87e7-2da1a8ef4963'),
('24298f60-ec12-88cb-1156-de543577116d','0abd7557-c63b-47e1-a91d-4bec476c5f28','ec17adb8-9c00-4828-aa82-f0177bbc9842'),
('3658ee91-def5-d4b5-1880-704109465cb3','0abd7557-c63b-47e1-a91d-4bec476c5f28','fde7d151-3dfa-4b7a-ad49-f05c1218a078'),
('03656198-6628-be79-4dde-520c5c69056b','483b33c7-d473-4d51-8ad8-1cb09f3f2e33','174563e2-2b3f-468d-911d-d1464ae03b76'),
('99c7348c-e5f1-a0e4-0203-e8797b39a14e','483b33c7-d473-4d51-8ad8-1cb09f3f2e33','3983f41c-5007-43a6-8d34-b3881f2a99f1'),
('fb0521fd-43fb-72d5-4797-ebede1180c12','483b33c7-d473-4d51-8ad8-1cb09f3f2e33','4d497e91-4fb2-4a56-bc18-1b14840b139f'),
('4d7feded-6381-33ca-6316-08741ce0258a','483b33c7-d473-4d51-8ad8-1cb09f3f2e33','62e06fd5-52fd-4ac3-898d-4f6b71b9afdb'),
('9a402ada-f571-948e-b11e-10a29780c615','483b33c7-d473-4d51-8ad8-1cb09f3f2e33','6f037656-b514-4d46-8869-4c5e13fbcfb7'),
('fd2a5fd5-ad5f-12c2-2f27-4bd4849889c6','483b33c7-d473-4d51-8ad8-1cb09f3f2e33','7f975fa3-2f15-4297-aada-dc9e77283231'),
('db2b045e-e7a9-f286-d41a-eba25e11130b','483b33c7-d473-4d51-8ad8-1cb09f3f2e33','8b085a93-522b-4168-9523-93a0f4664d78'),
('377695a2-93bd-8daa-7e45-1b4dddd1ae7f','483b33c7-d473-4d51-8ad8-1cb09f3f2e33','c2b008da-060c-4693-8ced-cd1559056dc8'),
('aaff3c37-6ce7-1756-6ef5-1b297d7ed0d8','483b33c7-d473-4d51-8ad8-1cb09f3f2e33','f5816b17-8a3f-4c2d-a9a7-ecec77a3726f'),
('058f4435-0b0e-cc20-a84e-b4815e028324','483b33c7-d473-4d51-8ad8-1cb09f3f2e33','fde7d151-3dfa-4b7a-ad49-f05c1218a078'),
('4a95bf10-d4a3-fe11-f057-9a55a65dfc00','821e96b6-991d-4bb5-8d95-f6dc3bb0cc3b','1622e113-ce03-4a27-9e50-a29914191e4f'),
('76eda21f-5e6d-3db4-9b89-1a26f2954297','821e96b6-991d-4bb5-8d95-f6dc3bb0cc3b','32db0a23-30cc-4364-a2f9-c20a69c465ff'),
('362bf02e-7515-8e35-3802-a128df8f81d9','821e96b6-991d-4bb5-8d95-f6dc3bb0cc3b','8d41cd5f-33a6-4992-8b45-1bfa9a90a8b7'),
('0ca043d5-eee7-b8e2-2f07-c709b42cf853','821e96b6-991d-4bb5-8d95-f6dc3bb0cc3b','b4009f75-d5d2-45a8-89a7-ab8c8f0d6f66'),
('54521fdc-0e78-e0d1-a675-891ffe6a5156','821e96b6-991d-4bb5-8d95-f6dc3bb0cc3b','ef9d40fc-fcef-4bd7-ba35-5dd1c952f2b2'),
('bb90e7cd-7e8f-1e3d-9b1d-b410659599dd','821e96b6-991d-4bb5-8d95-f6dc3bb0cc3b','fe7c4b90-b2cf-4cf9-8f14-f5fdbbbe11cd'),
('a8bbe219-fa8d-e70d-2b1b-6e511104b9b3','8e35fda2-968a-4b28-afbc-c89ea32d232a','6045617b-23df-46e0-893a-31981a92a481'),
('ac98570d-ae7f-ed0f-5f2e-23df387ffc1b','8e35fda2-968a-4b28-afbc-c89ea32d232a','6f037656-b514-4d46-8869-4c5e13fbcfb7'),
('103f116b-fdf4-df70-eed5-a7f64f54619d','8e35fda2-968a-4b28-afbc-c89ea32d232a','8857bd89-398f-4ce5-acbb-e910946cb536'),
('d7167314-b4b4-7936-01af-34302b279ce1','8e35fda2-968a-4b28-afbc-c89ea32d232a','8b085a93-522b-4168-9523-93a0f4664d78'),
('7f64c4a2-7f96-9da8-b70c-3570802112cd','8e35fda2-968a-4b28-afbc-c89ea32d232a','c2c40d5e-77e7-495a-87e7-2da1a8ef4963'),
('b8f7499f-6aa0-a136-f026-83dfd92f995a','8e35fda2-968a-4b28-afbc-c89ea32d232a','ef9d40fc-fcef-4bd7-ba35-5dd1c952f2b2'),
('b9cee0de-73b5-8f4a-9517-47f43bb3faed','91d6b100-c003-4330-8964-dcb7347c72bf','174563e2-2b3f-468d-911d-d1464ae03b76'),
('ad5699b2-b53d-6afd-0d5c-0c0ebaa1383d','91d6b100-c003-4330-8964-dcb7347c72bf','469fd799-3cf6-4cd0-9bcb-2d25f2c0e3fd'),
('a2bafbf7-c23f-8be4-3e02-dd6a36356eea','91d6b100-c003-4330-8964-dcb7347c72bf','6f037656-b514-4d46-8869-4c5e13fbcfb7'),
('9f1acef3-72c0-67ae-e1a7-3c93c4dd9c6c','b75184e9-df62-434d-b305-1ed6d4bf01f9','0171f86c-6787-4d77-a199-53eeb334dbd2'),
('c22fcc1b-41a3-e087-fda7-2da42ddf1957','b75184e9-df62-434d-b305-1ed6d4bf01f9','075ab4a1-eb12-47dd-aca9-badc65f61713'),
('3d367584-df76-d760-fb1a-b02a815c7a9b','b75184e9-df62-434d-b305-1ed6d4bf01f9','273b860a-c595-4bf4-8da9-e621b5c7bebd'),
('5488cc0f-49ea-37ec-22ef-3ce2addc9dd1','b75184e9-df62-434d-b305-1ed6d4bf01f9','5dea1444-cdb4-4521-9840-c4bdb8fb2006'),
('983307f0-ecbd-250f-7e81-e30c55571cbb','b75184e9-df62-434d-b305-1ed6d4bf01f9','9cc66cdb-62f7-41fe-bea9-9cd2257d3fbc'),
('4236d7ac-2ec9-c24a-8027-6eecc4c29474','b75184e9-df62-434d-b305-1ed6d4bf01f9','9f5311d8-3f9f-4a65-b586-aed1d6b33db3'),
('d3e874c7-0b5e-7215-5f76-5be5e39c557e','b8cfffdc-26d4-4240-b1e5-02067fa95ac4','1622e113-ce03-4a27-9e50-a29914191e4f'),
('1e87203b-850d-fecf-282f-b29f150bba7d','b8cfffdc-26d4-4240-b1e5-02067fa95ac4','273b860a-c595-4bf4-8da9-e621b5c7bebd'),
('18b766d2-969c-0f14-1c69-9b993e761622','b8cfffdc-26d4-4240-b1e5-02067fa95ac4','4586fd56-7e52-490a-ba11-59725e518db2'),
('410b5f97-6b4c-8025-193b-0eed19d308bb','b8cfffdc-26d4-4240-b1e5-02067fa95ac4','469fd799-3cf6-4cd0-9bcb-2d25f2c0e3fd'),
('fb7aeb18-45c5-b9eb-1697-8f0446621160','b8cfffdc-26d4-4240-b1e5-02067fa95ac4','4d497e91-4fb2-4a56-bc18-1b14840b139f'),
('df8fd698-54d3-402a-ce26-82e8f151a751','b8cfffdc-26d4-4240-b1e5-02067fa95ac4','6f037656-b514-4d46-8869-4c5e13fbcfb7'),
('73afa686-3efd-59c6-0d04-1aa99b38c5b0','b8cfffdc-26d4-4240-b1e5-02067fa95ac4','9fbb37ee-00bb-466b-b78b-af00560a4684'),
('58345515-d78e-4df2-8ec9-ad1a950d2688','d47f9367-6a2f-4a7f-b380-f18aedf9da19','02a09daf-fa2b-4f59-a0c7-3c0bf1fb8c75'),
('7c9efc88-1ee0-9edc-cd37-c9262544c0c4','d47f9367-6a2f-4a7f-b380-f18aedf9da19','3b02abd2-dde6-43d1-a4c0-caf73cc920fa'),
('636b7ab5-8a38-83be-55ee-615e5abbb988','d47f9367-6a2f-4a7f-b380-f18aedf9da19','84ae357f-6fd8-40c0-ba35-c7c6684b5aea'),
('ab51e7e9-0fec-5ed6-9eac-d9ae864abd21','d47f9367-6a2f-4a7f-b380-f18aedf9da19','9f5311d8-3f9f-4a65-b586-aed1d6b33db3'),
('edc81298-5c3a-1ba1-73a1-72732ba025ef','d47f9367-6a2f-4a7f-b380-f18aedf9da19','fe7c4b90-b2cf-4cf9-8f14-f5fdbbbe11cd'),
('b0d361b5-9b30-4e3c-de98-dfbfcc80300d','eb267302-7521-4356-8782-502a7f7f941e','36b38cc0-4627-4dfd-9565-5952d74225bd'),
('eaefe172-b66d-3119-eac5-eb92d7724e09','eb267302-7521-4356-8782-502a7f7f941e','5a43d605-a3e8-4909-8a15-1d21ab8cba4a'),
('1869df57-dc60-16e9-2b72-930014228b9c','eb267302-7521-4356-8782-502a7f7f941e','6045617b-23df-46e0-893a-31981a92a481'),
('e3af1b1e-6592-e282-1cd0-07d629144344','eb267302-7521-4356-8782-502a7f7f941e','9f3ef00d-f03c-4bba-a3be-48e71de9235d'),
('2795e0c2-ba4e-b35a-cb8f-060d1c3ce272','fb0f39a0-d09c-4f54-9c1b-23c3767b0c8e','0171f86c-6787-4d77-a199-53eeb334dbd2'),
('9109bdc4-0650-ce41-8584-6629879f097f','fb0f39a0-d09c-4f54-9c1b-23c3767b0c8e','36b38cc0-4627-4dfd-9565-5952d74225bd'),
('aaea1212-d4b5-b3ed-4c9d-f3225a94d6bd','fb0f39a0-d09c-4f54-9c1b-23c3767b0c8e','84ae357f-6fd8-40c0-ba35-c7c6684b5aea');

