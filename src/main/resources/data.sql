-- Reloop - Seed Data
-- Clear existing data before inserting to avoid duplicates

DELETE FROM recycling_log;
DELETE FROM drop_off_location;
DELETE FROM recycling_item;
DELETE FROM user;

-- DropOffLocation seed data (Hussein Al Salami - 746006849)
INSERT INTO drop_off_location (name, address, accepted_categories, opening_time, closing_time, longitude, latitude) VALUES
('Dubai Recycling Center', 'Dubai Marina, Dubai', 'Plastic, Glass, Metal', '08:00', '20:00', 55.1390, 25.0805),
('Sharjah Green Hub', 'Al Majaz, Sharjah', 'Paper, Cardboard, Plastic', '07:00', '18:00', 55.3782, 25.3463),
('Abu Dhabi Eco Point', 'Corniche Road, Abu Dhabi', 'E-Waste, Batteries, Metal', '09:00', '21:00', 54.3773, 24.4539),
('Ajman Drop Station', 'Al Rashidiya, Ajman', 'Glass, Plastic, Paper', '08:00', '19:00', 55.4354, 25.4052),
('RAK Recycle Corner', 'Al Nakheel, Ras Al Khaimah', 'Plastic, Metal, Cardboard', '08:30', '17:30', 55.9432, 25.7895);

-- User seed data (Hussein Al Salami - 746006849)
INSERT INTO user (full_name, phone_number, age, city, email) VALUES
('Ahmed Ali', '+971501234567', 25, 'Sharjah', 'ahmed.ali@example.com'),
('Fatima Khan', '+971501234568', 30, 'Dubai', 'fatima.khan@example.com'),
('Omar Hassan', '+971501234569', 28, 'Abu Dhabi', 'omar.hassan@example.com'),
('Sara Mohammed', '+971501234570', 22, 'Sharjah', 'sara.m@example.com'),
('Khalid Nasser', '+971501234571', 35, 'Ajman', 'khalid.n@example.com');

-- RecyclingItem seed data (Saif Alshamali - 410002147)
INSERT INTO recycling_item (item_name, category, is_recyclable, preparation_steps, common_mistakes, notes) VALUES
('Plastic Bottle', 'Plastic', true, 'Remove cap and rinse thoroughly before recycling', 'Leaving liquid inside the bottle', 'PET plastic - check for recycling symbol'),
('Aluminum Can', 'Metal', true, 'Rinse and crush to save space', 'Leaving food residue inside', 'Highly recyclable - 100% recoverable'),
('Cardboard Box', 'Paper', true, 'Flatten and remove all tape before recycling', 'Leaving tape and staples attached', 'Keep dry - wet cardboard may not be accepted'),
('Glass Bottle', 'Glass', true, 'Rinse and remove metal caps', 'Mixing with broken glass', 'Separate by color if required by facility'),
('Newspaper', 'Paper', true, 'Keep dry and bundle together', 'Mixing wet paper with dry', 'One of the most recyclable materials');

-- RecyclingLog seed data (Naren Karthik - 746009107)
INSERT INTO recycling_log (user_id, item_id, quantity, date, estimated_co2_saved, diverted_from_landfill_kg) VALUES
(1, 1, 5, '2026-04-20', 2.5, 1.2),
(1, 2, 3, '2026-04-21', 1.8, 0.9),
(2, 3, 8, '2026-04-22', 3.2, 2.4),
(3, 4, 2, '2026-04-23', 1.0, 0.6),
(2, 5, 10, '2026-04-24', 4.5, 3.0);
