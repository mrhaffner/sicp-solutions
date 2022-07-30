;; Exercise 2.2
;; Page 121

;; construcor
(defn make-segment
    [pt1, pt2]
    {:start pt1 :end pt2})

;; selector
;; returns a point
(defn start-segment
    [segment]
    (get segment :start))

;; selector
;; returns a point
(defn end-segment
    [segment]
    (get segment :end))

;; constructor
(defn make-point
    [x, y]
    {:x x :y y})

;; selector
(defn x-point
    [point]
    (get point :x))

;; selector
(defn y-point
    [point]
    (get point :y))

;; returns the midpoint of a line
(defn midpoint-segment
    [line]
    (make-point 
        (/ 
            (+  (x-point (start-segment line)) 
                (x-point (end-segment line)))
            2)
        (/  
            (+  (y-point (start-segment line)) 
                (y-point (end-segment line)))
            2)))

;; test line
(def line
    (make-segment
        (make-point 1 1)
        (make-point 2 2)))

;; test getting midpoint
(def midpoint
    (midpoint-segment line))