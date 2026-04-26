DELETE FROM recycling_log;
DELETE FROM drop_off_location;
DELETE FROM recycling_item;
DELETE FROM user;

INSERT INTO drop_off_location (name, address, accepted_categories, opening_time, closing_time, longitude, latitude) VALUES ('Dubai Recycling Center', 'Dubai Marina, Dubai', 'Plastic, Glass, Metal', '08:00', '20:00', 55.1390, 25.0805);
INSERT INTO drop_off_location (name, address, accepted_categories, opening_time, closing_time, longitude, latitude) VALUES ('Sharjah Green Hub', 'Al Majaz, Sharjah', 'Paper, Cardboard, Plastic', '07:00', '18:00', 55.3782, 25.3463);
INSERT INTO drop_off_location (name, address, accepted_categories, opening_time, closing_time, longitude, latitude) VALUES ('Abu Dhabi Eco Point', 'Corniche Road, Abu Dhabi', 'E-Waste, Batteries, Metal', '09:00', '21:00', 54.3773, 24.4539);
INSERT INTO drop_off_location (name, address, accepted_categories, opening_time, closing_time, longitude, latitude) VALUES ('Ajman Drop Station', 'Al Rashidiya, Ajman', 'Glass, Plastic, Paper', '08:00', '19:00', 55.4354, 25.4052);
INSERT INTO drop_off_location (name, address, accepted_categories, opening_time, closing_time, longitude, latitude) VALUES ('RAK Recycle Corner', 'Al Nakheel, Ras Al Khaimah', 'Plastic, Metal, Cardboard', '08:30', '17:30', 55.9432, 25.7895);

INSERT INTO user (full_name, phone_number, age, city, email) VALUES ('Ahmed Ali', '+971501234567', 25, 'Sharjah', 'ahmed.ali@example.com');
INSERT INTO user (full_name, phone_number, age, city, email) VALUES ('Fatima Khan', '+971501234568', 30, 'Dubai', 'fatima.khan@example.com');
INSERT INTO user (full_name, phone_number, age, city, email) VALUES ('Omar Hassan', '+971501234569', 28, 'Abu Dhabi', 'omar.hassan@example.com');
INSERT INTO user (full_name, phone_number, age, city, email) VALUES ('Sara Mohammed', '+971501234570', 22, 'Sharjah', 'sara.m@example.com');
INSERT INTO user (full_name, phone_number, age, city, email) VALUES ('Khalid Nasser', '+971501234571', 35, 'Ajman', 'khalid.n@example.com');

INSERT INTO recycling_item (item_name, category, is_recyclable, preparation_steps, common_mistakes, notes) VALUES ('Plastic Bottle', 'Plastic', true, 'Remove cap and rinse thoroughly', 'Leaving liquid inside', 'PET plastic');
INSERT INTO recycling_item (item_name, category, is_recyclable, preparation_steps, common_mistakes, notes) VALUES ('Aluminum Can', 'Metal', true, 'Rinse and crush to save space', 'Leaving food residue', 'Highly recyclable');
INSERT INTO recycling_item (item_name, category, is_recyclable, preparation_steps, common_mistakes, notes) VALUES ('Cardboard Box', 'Paper', true, 'Flatten and remove tape', 'Leaving tape attached', 'Keep dry');
INSERT INTO recycling_item (item_name, category, is_recyclable, preparation_steps, common_mistakes, notes) VALUES ('Glass Bottle', 'Glass', true, 'Rinse and remove metal caps', 'Mixing with broken glass', 'Separate by color');
INSERT INTO recycling_item (item_name, category, is_recyclable, preparation_steps, common_mistakes, notes) VALUES ('Newspaper', 'Paper', true, 'Keep dry and bundle together', 'Mixing wet with dry', 'Most recyclable material');

INSERT INTO recycling_log (user_id, item_id, quantity, date, estimated_co2_saved, diverted_from_landfill_kg) VALUES (1, 1, 5, '2026-04-20', 2.5, 1.2);
INSERT INTO recycling_log (user_id, item_id, quantity, date, estimated_co2_saved, diverted_from_landfill_kg) VALUES (1, 2, 3, '2026-04-21', 1.8, 0.9);
INSERT INTO recycling_log (user_id, item_id, quantity, date, estimated_co2_saved, diverted_from_landfill_kg) VALUES (2, 3, 8, '2026-04-22', 3.2, 2.4);
INSERT INTO recycling_log (user_id, item_id, quantity, date, estimated_co2_saved, diverted_from_landfill_kg) VALUES (3, 4, 2, '2026-04-23', 1.0, 0.6);
INSERT INTO recycling_log (user_id, item_id, quantity, date, estimated_co2_saved, diverted_from_landfill_kg) VALUES (2, 5, 10, '2026-04-24', 4.5, 3.0);