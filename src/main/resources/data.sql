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


insert into bank_client (bank, client)
values
('0abd7557-c63b-47e1-a91d-4bec476c5f28','075ab4a1-eb12-47dd-aca9-badc65f61713'),
('0abd7557-c63b-47e1-a91d-4bec476c5f28','35c57719-71f7-4e06-8771-572fef639ae9'),
('0abd7557-c63b-47e1-a91d-4bec476c5f28','3983f41c-5007-43a6-8d34-b3881f2a99f1'),
('0abd7557-c63b-47e1-a91d-4bec476c5f28','b4009f75-d5d2-45a8-89a7-ab8c8f0d6f66'),
('0abd7557-c63b-47e1-a91d-4bec476c5f28','c2b008da-060c-4693-8ced-cd1559056dc8'),
('0abd7557-c63b-47e1-a91d-4bec476c5f28','c2c40d5e-77e7-495a-87e7-2da1a8ef4963'),
('0abd7557-c63b-47e1-a91d-4bec476c5f28','ec17adb8-9c00-4828-aa82-f0177bbc9842'),
('0abd7557-c63b-47e1-a91d-4bec476c5f28','fde7d151-3dfa-4b7a-ad49-f05c1218a078'),
('483b33c7-d473-4d51-8ad8-1cb09f3f2e33','174563e2-2b3f-468d-911d-d1464ae03b76'),
('483b33c7-d473-4d51-8ad8-1cb09f3f2e33','3983f41c-5007-43a6-8d34-b3881f2a99f1'),
('483b33c7-d473-4d51-8ad8-1cb09f3f2e33','4d497e91-4fb2-4a56-bc18-1b14840b139f'),
('483b33c7-d473-4d51-8ad8-1cb09f3f2e33','62e06fd5-52fd-4ac3-898d-4f6b71b9afdb'),
('483b33c7-d473-4d51-8ad8-1cb09f3f2e33','6f037656-b514-4d46-8869-4c5e13fbcfb7'),
('483b33c7-d473-4d51-8ad8-1cb09f3f2e33','7f975fa3-2f15-4297-aada-dc9e77283231'),
('483b33c7-d473-4d51-8ad8-1cb09f3f2e33','8b085a93-522b-4168-9523-93a0f4664d78'),
('483b33c7-d473-4d51-8ad8-1cb09f3f2e33','c2b008da-060c-4693-8ced-cd1559056dc8'),
('483b33c7-d473-4d51-8ad8-1cb09f3f2e33','f5816b17-8a3f-4c2d-a9a7-ecec77a3726f'),
('483b33c7-d473-4d51-8ad8-1cb09f3f2e33','fde7d151-3dfa-4b7a-ad49-f05c1218a078'),
('821e96b6-991d-4bb5-8d95-f6dc3bb0cc3b','1622e113-ce03-4a27-9e50-a29914191e4f'),
('821e96b6-991d-4bb5-8d95-f6dc3bb0cc3b','32db0a23-30cc-4364-a2f9-c20a69c465ff'),
('821e96b6-991d-4bb5-8d95-f6dc3bb0cc3b','8d41cd5f-33a6-4992-8b45-1bfa9a90a8b7'),
('821e96b6-991d-4bb5-8d95-f6dc3bb0cc3b','b4009f75-d5d2-45a8-89a7-ab8c8f0d6f66'),
('821e96b6-991d-4bb5-8d95-f6dc3bb0cc3b','ef9d40fc-fcef-4bd7-ba35-5dd1c952f2b2'),
('821e96b6-991d-4bb5-8d95-f6dc3bb0cc3b','fe7c4b90-b2cf-4cf9-8f14-f5fdbbbe11cd'),
('8e35fda2-968a-4b28-afbc-c89ea32d232a','6045617b-23df-46e0-893a-31981a92a481'),
('8e35fda2-968a-4b28-afbc-c89ea32d232a','6f037656-b514-4d46-8869-4c5e13fbcfb7'),
('8e35fda2-968a-4b28-afbc-c89ea32d232a','8857bd89-398f-4ce5-acbb-e910946cb536'),
('8e35fda2-968a-4b28-afbc-c89ea32d232a','8b085a93-522b-4168-9523-93a0f4664d78'),
('8e35fda2-968a-4b28-afbc-c89ea32d232a','c2c40d5e-77e7-495a-87e7-2da1a8ef4963'),
('8e35fda2-968a-4b28-afbc-c89ea32d232a','ef9d40fc-fcef-4bd7-ba35-5dd1c952f2b2'),
('91d6b100-c003-4330-8964-dcb7347c72bf','174563e2-2b3f-468d-911d-d1464ae03b76'),
('91d6b100-c003-4330-8964-dcb7347c72bf','469fd799-3cf6-4cd0-9bcb-2d25f2c0e3fd'),
('91d6b100-c003-4330-8964-dcb7347c72bf','6f037656-b514-4d46-8869-4c5e13fbcfb7'),
('b75184e9-df62-434d-b305-1ed6d4bf01f9','0171f86c-6787-4d77-a199-53eeb334dbd2'),
('b75184e9-df62-434d-b305-1ed6d4bf01f9','075ab4a1-eb12-47dd-aca9-badc65f61713'),
('b75184e9-df62-434d-b305-1ed6d4bf01f9','273b860a-c595-4bf4-8da9-e621b5c7bebd'),
('b75184e9-df62-434d-b305-1ed6d4bf01f9','5dea1444-cdb4-4521-9840-c4bdb8fb2006'),
('b75184e9-df62-434d-b305-1ed6d4bf01f9','9cc66cdb-62f7-41fe-bea9-9cd2257d3fbc'),
('b75184e9-df62-434d-b305-1ed6d4bf01f9','9f5311d8-3f9f-4a65-b586-aed1d6b33db3'),
('b8cfffdc-26d4-4240-b1e5-02067fa95ac4','1622e113-ce03-4a27-9e50-a29914191e4f'),
('b8cfffdc-26d4-4240-b1e5-02067fa95ac4','273b860a-c595-4bf4-8da9-e621b5c7bebd'),
('b8cfffdc-26d4-4240-b1e5-02067fa95ac4','4586fd56-7e52-490a-ba11-59725e518db2'),
('b8cfffdc-26d4-4240-b1e5-02067fa95ac4','469fd799-3cf6-4cd0-9bcb-2d25f2c0e3fd'),
('b8cfffdc-26d4-4240-b1e5-02067fa95ac4','4d497e91-4fb2-4a56-bc18-1b14840b139f'),
('b8cfffdc-26d4-4240-b1e5-02067fa95ac4','6f037656-b514-4d46-8869-4c5e13fbcfb7'),
('b8cfffdc-26d4-4240-b1e5-02067fa95ac4','9fbb37ee-00bb-466b-b78b-af00560a4684'),
('d47f9367-6a2f-4a7f-b380-f18aedf9da19','02a09daf-fa2b-4f59-a0c7-3c0bf1fb8c75'),
('d47f9367-6a2f-4a7f-b380-f18aedf9da19','3b02abd2-dde6-43d1-a4c0-caf73cc920fa'),
('d47f9367-6a2f-4a7f-b380-f18aedf9da19','84ae357f-6fd8-40c0-ba35-c7c6684b5aea'),
('d47f9367-6a2f-4a7f-b380-f18aedf9da19','9f5311d8-3f9f-4a65-b586-aed1d6b33db3'),
('d47f9367-6a2f-4a7f-b380-f18aedf9da19','fe7c4b90-b2cf-4cf9-8f14-f5fdbbbe11cd'),
('eb267302-7521-4356-8782-502a7f7f941e','36b38cc0-4627-4dfd-9565-5952d74225bd'),
('eb267302-7521-4356-8782-502a7f7f941e','5a43d605-a3e8-4909-8a15-1d21ab8cba4a'),
('eb267302-7521-4356-8782-502a7f7f941e','6045617b-23df-46e0-893a-31981a92a481'),
('eb267302-7521-4356-8782-502a7f7f941e','9f3ef00d-f03c-4bba-a3be-48e71de9235d'),
('fb0f39a0-d09c-4f54-9c1b-23c3767b0c8e','0171f86c-6787-4d77-a199-53eeb334dbd2'),
('fb0f39a0-d09c-4f54-9c1b-23c3767b0c8e','36b38cc0-4627-4dfd-9565-5952d74225bd'),
('fb0f39a0-d09c-4f54-9c1b-23c3767b0c8e','84ae357f-6fd8-40c0-ba35-c7c6684b5aea');
